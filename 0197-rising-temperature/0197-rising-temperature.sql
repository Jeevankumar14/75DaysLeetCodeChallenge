# Write your MySQL query statement below

select w.id from Weather w join Weather w2 on datediff(w.recordDate,w2.recordDate)=1 where w.temperature>w2.temperature;