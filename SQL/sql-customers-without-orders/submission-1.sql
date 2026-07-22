-- Write your query below
select name from customers c where not exists (select customer_id from orders o where c.id=o.customer_id);