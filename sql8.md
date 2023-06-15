# odev 8

```sql
1. test veritabaninizda employee isimli sutun bilgileri id(INTEGER), name VARCHAR(50),
birthday DATE, email VARCHAR(100) olan tablo olusturalim.
CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR NOT NULL,
  birthday DATE,
  email VARCHAR(100)
);
```

```sql
2. olusturdugumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Trenna', '2018-05-05', 'tworkman0@hc360.com');
insert into employee (id, name, birthday, email) values (2, 'Pat', '2016-10-02', 'prubes1@typepad.com');
insert into employee (id, name, birthday, email) values (3, 'Rinaldo', '2010-08-26', 'rpriestnall2@theguardian.com');
.
.
.
```

```sql
3. sutunlarin her birine gore diger sutunlari guncelleyecek 5 adet update islemi yapalim
UPDATE employee
SET
	name = 'Melike',
	birthday = '2010-10-10',
	email = 'melike@gmail.com'
WHERE name LIKE 'Me%';
```

```sql
4. sutunlarin her birine gore ilgili satiri silecek 5 adet DELETE islemi yapalim.
DELETE FROM employee
WHERE name LIKE '%n';
```
