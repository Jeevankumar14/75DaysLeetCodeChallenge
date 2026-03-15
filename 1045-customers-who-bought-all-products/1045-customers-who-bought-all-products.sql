# Write your MySQL query statement below

select c.customer_id from Product p left join Customer c on c.product_key=p.product_key group by c.customer_id having count(distinct c.product_key)=(select count(  distinct p.product_key) from Product p);