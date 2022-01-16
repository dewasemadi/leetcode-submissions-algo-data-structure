-- problem: https://leetcode.com/problems/combine-two-tables/

SELECT firstName, lastName, city, state
    FROM Person LEFT JOIN Address
        ON Person.Person.id = Address.Person.id


-- reference: https://www.w3schools.com/sql/sql_join.asp