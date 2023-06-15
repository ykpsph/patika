# odev 7
```sql
1. film tablosunda bulunan filmleri rating degerlerine gore gruplayiniz.
SELECT rating
FROM film
GROUP BY rating;
```

```sql
2. film tablosunda bulunan filmleri replacement_cost sutununa gore grupladigimizda 
film sayisi 50'den fazla olan replacement_cost degerini ve karsilik gelen film sayisini siralayiniz.
SELECT replacement_cost, COUNT(*)
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;

```

```sql
3. customer tablosunda bulunan store_id degerlerine karsilik gelen musteri sayilari nelerdir ?
SELECT store_id, COUNT(*) as musteri_sayisi
FROM customer
GROUP BY store_id;
```

```sql
4. city tablosunda bulunan sehir verilerini country_id sutununa 
gore gruplandirdiktan sonra en fazla sehir sayisi barindiran country_id bilgisini ve sehir sayisini paylasiniz.
SELECT country_id, COUNT(*)
FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;
```
