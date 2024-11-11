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
