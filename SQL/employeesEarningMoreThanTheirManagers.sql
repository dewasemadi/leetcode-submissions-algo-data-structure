-- problem: https://leetcode.com/problems/employees-earning-more-than-their-managers/

SELECT a.name as Employee
    FROM Employee AS a, Employee AS b 
        WHERE a.ManagerId = b.Id
            AND a.Salary > b.Salary

-- self relationship