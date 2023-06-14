# odev 6
```sql
1. film tablosunda bulunan rental_rate sutunundaki degerlerin ortalamasi nedir?
SELECT AVG(rental_rate)
FROM film;
```

```sql
2. film tablosunda bulunan filmlerden kac tenisi 'C' ile baslar ?
SELECT COUNT(title)
FROM film
WHERE title LIKE 'C%';
```

```sql
3. film tablosunda bulunan filmlerden rental_rate degeri 0.99 a esit olan en uzun (length) film kac dakikadir?
SELECT MAX(length)
FROM film
WHERE rental_rate = 0.99;
```

```sql
4. film tablosunda bulunan filmlerin uzunlugu 150 dakikadan buyuk olanlarina ait kac farkli replacement_cost degeri vardir ?
SELECT  COUNT(DISTINCT replacement_cost)
FROM film
WHERE length > 150;
```
