# Let's Eat
#### an API to demonstrate a many2many relationship with an enum

### Mapping enums
Wanted to perist some data with a manytomany with an enum
An enum would provide consistency with cuisine naming (avoiding 'italiann', 'itaalian', etc)

I began with following tutorial from Thorben Janssen:
https://thorben-janssen.com/hibernate-enum-mappings/

#### Notes
- by default Hibernate maps an enum to a number, uses positional value starting from 0
- this is not great if you are planning on making changes to the enum (as may change ordinal value of remaining values)
- possible to map to a String (not as efficient), but adding/removing values less problematic
- N.B, you cannot RENAME a value without migrating the database

It was useful, but wasn't quite what I was looking for, then I found this from Emanuel Pappa:
https://www.emanuelepapa.dev/using-spring-data-to-persist-a-set-of-enums-in-a-many-to-many-relationship/

The key to understanding is that there are only 2 tables, despite the many-to-many relationship.
`cuisine` is not an entity and does not have its own table. The list of enums exists only in the Spring application! We only have to create the table which represents the relationship between `Restaurant` and `Cuisine`

Considered storing geo location as an array of two values. 
Postgres datatype POINT stores values as `[longitude, latitude]`, whereas most packages require `[latitude, longitude]`. Decided to keep values separate.

### Sample API

```
// localhost:8080/restuarants

{
        "id": 5,
        "name": "Big Lola's Taqueria",
        "address": "493 Smithdown Road",
        "postcode": "L15 5AE",
        "website": "https://biglolas.co.uk/",
        "cuisines": [
            "MEXICAN"
        ],
        "location": {
            "id": 4,
            "town": "Liverpool",
            "neighbourhood": "Wavertree"
        },
        "latitude": 53.390099848417435,
        "longitude": -2.9255602025424277
    },
    {
        "id": 6,
        "name": "Rudy's Pizza",
        "address": "Peter Street",
        "postcode": "M2 5QJ",
        "website": "https://www.rudyspizza.co.uk/pizzerias/peterst",
        "cuisines": [
            "PIZZA"
        ],
        "location": {
            "id": 5,
            "town": "Manchester",
            "neighbourhood": "City Centre"
        },
        "latitude": 53.47842331842055,
        "longitude": -2.2474895790689655
    },
    {
        "id": 7,
        "name": "Fargo's",
        "address": "377 Ladypool Road",
        "postcode": "B12 8LA",
        "website": "http://www.fargosfresh.co.uk/",
        "cuisines": [
            "PIZZA",
            "BURGERS"
        ],
        "location": {
            "id": 6,
            "town": "Birmingham",
            "neighbourhood": "Balsall Heath"
        },
        "latitude": 52.45295183461756,
        "longitude": -1.8789830376678671
    }

```
