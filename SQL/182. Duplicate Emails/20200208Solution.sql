# Write your MySQL query statement below
select Email from (
    select Email ,count(Email) as num from Person
    group by Email
) as Temp
where num > 1;

#更快的方法
# SELECT Email FROM Person GROUP BY Email HAVING count(Email) > 1