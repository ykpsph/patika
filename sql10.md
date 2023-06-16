# odev 10

```sql
1. city tablosu ile country tablosunda bulunan sehir ve ulke isimlerini birlikte gorebilecegimiz left join sorgusu yaziniz.
SELECT city, country
FROM city
LEFT JOIN country
ON city.country_id = country.country_id
ORDER BY country ASC;
```

```sql
2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte gorebilecegimiz right join sorgusu yaziniz.
SELECT payment_id, first_name, last_name
FROM customer
RIGHT JOIN payment
ON payment.customer_id = customer.customer_id;
```

```sql
3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte gorebilecegimiz full join sorgusu yaziniz.
SELECT rental_id, first_name, last_name
FROM customer
FULL JOIN rental
ON rental.customer_id = customer.customer_id;
```
