



Mapping enums
Wanted to perist a manytomany with an enum
Thought this was a good idea as it would provide consistency with cuisine naming (avoiding 'indiian' and 'indian' and 'Indiaan')

But mapping a many-to-many with enums seems tricky, couldn't find anything helpful

Used this tutorial:
https://thorben-janssen.com/hibernate-enum-mappings/
Notes

- by default Hibernate maps an enum to a number. uses positional value starting from 0
- not good if you are planning on making changes to the enum (as may change ordinal value of remaining values)
- You can map to a String (not as efficient), but adding/removing values less problematic
- Note, you cannot RENAME a value without migrating the database


THEN found this:
https://www.emanuelepapa.dev/using-spring-data-to-persist-a-set-of-enums-in-a-many-to-many-relationship/

Which describes what I'm looking for

The key to understanding is that there are only 2 tables, despite the many-to-many relationship.
`cuisine` is not an entity and does not have its own table. The list of enums exists only in the Spring application! We only have to create the table which represents the relationship between `Restaurant` and `Cuisine`



Considered storing geo location as an array of two values. 
Postgres datatype POINT stores values as `[longitude, latitude]`, whereas most packages require `[latitude, longitude]`. Decided to keep values separate