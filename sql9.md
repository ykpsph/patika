# odev 9

```sql
1. city tablosu ile country tablosunda bulunan sehir ve ulke isimlerini birlikte gorebilecegimiz
INNER JOIN sorgusu yaziniz.

SELECT city as sehir, country as ulke
FROM city
INNER JOIN country
ON country.country_id = city.country_id
WHERE country LIKE 'Turke%';
```

```sql
2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte gorebilecegimiz INNER JOIN sorgusunu yaziniz.
SELECT payment_id, first_name, last_name
FROM payment
INNER JOIN customer ON payment.customer_id = customer.customer_id;
```

```sql
3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki 
first_name ve last_name isimlerini birlikte gorebilecegimiz INNER JOIN sorgusu yaziniz.
SELECT rental_id, first_name, last_name
FROM customer
INNER JOIN rental ON customer.customer_id = rental.rental_id;
```
