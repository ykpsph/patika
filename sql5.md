# odev 5
```sql
1. film tablosunda bulunan ve film ismi 'n' karakteri ile biten en uzun 5 filmi siralayiniz.
SELECT *
FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5
```

```sql
2. film tablosunda bulunan ve film ismi 'n' karakteri ile biten en kisa ikinci 5 filmi siralayiniz.
SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length ASC
LIMIT 5;
```
```sql
customer tablosunda bulunan last_name sutununa gore azalan yapilan siralamada store_id 1 olmak kosuluyla ilk 4 veriyi siralayiniz.
SELECT last_name, store_id
FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;
```
