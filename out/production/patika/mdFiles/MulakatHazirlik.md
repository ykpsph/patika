- [ ] NoSql  
- [ ] MongoDB
- [ ] Collections ----------------------------------------> java102.md
- [ ] map ile ilgili bir soru sordu hatirlamiyorum --------> java102.md
- [ ] Call by Value
- [ ] Call by Reference
- [ ] Exception Handling --------------------------------> java102.md
- [ ] try-catch ----------------------------------------> java102.md
- [x] final keyword ------------------------------------> java102.md
- [x] static keyword ------------------------------------> java102.md
- [ ] Design Patterns (SINGLETON)
- [ ] Dosya Okuma Islemleri ----------------------------> java102.md
- [x] SOLID
- [ ] Bilgisayara neler kurmak gerekiyor ?
- [ ] Repository, JavaEE, JDK
- [x] Database operasyonlari alisveris-musteri ornegi mesela
- [ ] Set ------------------------------------------------> java102.md
- [x] FK PK ------------------------------------------------> SQL.md
- [x] Left/Right join  ------------------------------------> SQL.md
---
# Mulakatlara Hazirlik

<details>
    <summary>Encapsulation nedir ?</summary>

- **Encapsulation**, bir nesnenin sahip oldugu ozellik ve davranislarin gizlenmesidir.
- **Getter** ve **Setter** metotlari, koruma altina alinmis nesne ozelliklerine erismek icin kullanilan metotlardir.
- Bir sinifa ait niteliklerin ancak o sinifa ait metotlar tarafindan degistirilebilmesi ve okunabilmesi ilkesidir.
- Kitap adinda bir sinif olsun, degiskenlerinden biride sayfaSayisi olsun.
- Kitap sinifindan bir nesne olustururken sayfaSayisi negatif bir deger girilirse anlamsiz olur.
- Sinifa ait nitelikleri disaridan erisime kapatmak icin niteliklerin erisim belirleyicilerini **private** yapmaliyiz.
- Degiskenleri **private** yaparak koruma altina alip **public** **Getter** ve **Setter** metotlari ile kullanima sunulur.
- Yani **private** olan degiskenlere **getter** ve **setter** metotlari ile ulasabiliyoruz.
</details>

---
<details>
    <summary>Inheritance nedir ?</summary>

- Bir sinifin sahip oldugu ozellik ve davranislarin baska siniflara aktarilmasidir.
- Kalitim kullanarak birbiri ile iliskili bir grup nesnenin ortak ozelliklarini tanimlayan temel bir sinif olusturabiliriz.
- Bir sinif sadece bir sinifi inherit edebilir. (bir sinifin sadece bir ust sinifi olabilir).
- bir sinif diger bir sinifi extends anahtar sozcugunu kullanarak inherit eder.
- Bir UniversiteOgrencisi ve birde Ogrenci siniflari olsun. UniversiteOgrencisi, Ogrenci sinifini inherit eder, ondan miras alir cunku UniversiteOgrencisi'de bir Ogrencidir.
- cok guzel bir ornek : bir sinif olusturdugumuzda, default olarak Object sinifindan, parametresiz bir constructor(yapici blok) o olusturdugumuz sinifa miras kalir. Buda bir inheritance.
- A alt sinif B ust sinif
```java
public class A extends B {}
```
- **Tek Yonlu Kalitim (Single Inheritance):** Bir sinifin baska bir sinifi genislettigi alt ve ust sinif iliskisini ifade eder.
- **Cok Seviyeli Kalitim (Multilevel Inheritance):** Bir sinifa ait alt sinifin baska siniflari genisletmesine denir. C extends B, B extends A, dolayli olarak C extends A.
- **Hiyerarsik Kalitim (Hierarchical Inheritance):** Birden fazla sinifin ayni sinifi genislettigi alt ve ust sinif iliskisini ifade eder. B, C ve D siniflari A sinifini genisletir.
- **Hibrit Kalitim (Hybrid Inheritance):** Birden fazla kalitim turunun kombinasyonuna denir.
- Benzer isi yapan siniflarin ortak ozellikleri gruplanabilir.
- Alt sinifin, ust siniftaki nitelik ve davranislari kendisine almasi demektir.
- **TarimKrediManager** ve **OgretmenKrediManager**, **BaseKrediManager**'i inherit ederler yani ondan miras alirlar.
</details>

---
<details>
    <summary>Method Overriding nedir ?</summary>

- Bir alt sinifta, ust siniftan gelen metodun ayni isimle ve ayni sayida parametre ile kendine ozel olarak tekrar yazilmasina denir.
- Alt sinifta kodlanan metot, ust siniftaki metotla ayni isim ve parametre listesine sahiptir, ancak ust siniftaki metotla ayni kodlari icermemelidir.
- Method Overriding 'in neden gerekli oldugunu anlamak icin inheritance'ta alt siniflara indikce daha ozel siniflara, ust siniflara ciktikca daha genel siniflara ulastigimizi bilmemiz gerek.
- Ust sinifta tanimlanan bir yontem, o sinifi inherit eden alt siniflarin ortak ozelliklerine gore calisan bir yontem olacaktir.
- Alt siniflara inildikce siniflar ozellestigi icin, ust siniftaki yontem alt sinif icin fazla genel ve dolayisiyla yetersiz kalabilir.
- Bu durumda alt sinif, kendi ozelliklerine bagli olarak daha ozel bir gerceklestirim yapacaktir.
</details>

---
<details>
    <summary>Method Overloading nedir ?</summary>

- Bir sinif icinde, ayni isimde ve farkli parametre sayilarina sahip metotlarin bulunmasidir.
</details>

---
<details>
    <summary>Polymorphism nedir ?</summary>

- Bir ust sinif referansinin tum alt sinif nesnelerini tutabilmesidir.
- Bir ust sinif referansi ile alt siniftaki nesnelerin kullanilabilmesine olanak saglar. 
- Buradaki avantaj, bir islemi gerceklestirirken hangi sinifa ait nesne ile islem gerceklestirdigimizi bilmemize gerek kalmamasidir.
- BaseDatabaseManager, OracleDatabaseManager, SqlDatabaseManager, MysqlDatabaseManager.
- Cok Bicimlilik ayni gorevin farkli yollarla yapilabilmesini ifade eder.
- Nesne, ayni davranisi farkli formlar ve gorunusler ile yerine getirebilir.
- Alt siniflarin, ust siniflardaki metotlari (method overriding) sayesinde cok bicimli olarak davranmasina denir.
- TarimKrediManager ve OgretmenKrediManager, BaseKrediManager'i inherit ederler yani ondan miras alirlar. Ust siniftan miras aldigi metodun donus tipini ve parametre sayisini degistirmeden override ettiginde polymorphism oluyor.
- BKM'de hesapla metodu olsun. TKM oldugu gibi kullansin. OKM bu metodu override etsin. Bu polymorphism'dir.
- Hesapla metotlari her sinifta yaptigi islemler ayniysa o yanlis bir kullanimdir.
- Polymorphism, Inheritance yaptiginda hesapla metodunu kendi icinde degistirebilirsin, bu ozgurlugu, cok bicimliligi sagliyorum diyor.
- BaseKrediManager diye bir ust sinif dusun. TarimKrediManager, OgretmenKrediManager ve EmekliKrediManager siniflari BaseKrediManager'i inherit etsinler yani ondan miras alsinlar ayni zamanda BaseKrediManager'daki metodlari kendilerine gore override etsinler. Ve arayuzden cagirma islemini yaptigimiz bir class oldugunu dusun KrediUI. KrediUI'a dependency injection ile BaseKrediManager gonderiyoruz. KrediUI sinifindan yeni bir nesne olustururken yani KrediUI new'lendiginde bizden parametre olarak ne isteyecek ? Bir BaseKrediManager. bu sayede biz parametre olarak TarimKrediManager'da verebiliriz OgretmenKrediManager'da verebiliriz. Bu bir polymorphism ornegidir. En onemlisi bagimliligimiz ortadan kalkiyor.
</details>

---
<details>
    <summary>Abstraction nedir ?</summary>

- Alt siniflarin ortak ozelliklerini ve islevlerini tasiyan ancak henuz bir nesnesi olmayan bir ust sinif olusturmak istenirse abstract ust sinif olusturulur.
- Abstraction icin iki yontem vardir : interface tanimlamak, abstract sinif tanimlamak
- Abstract class(soyut sinif) abstract anahtar kelimesi ile tanimlanan siniflardir.
- Abstract sinif icinde abstract metotlar veya normal metotlar tanimlanabilir.
- Soyut siniflarin nesneleri olusturulamaz, yani new'lenemez.
- final kelimesi ile tanimlanmis metotlar alt siniflarda override edilemezler. 
- Abstract metodlar miras alinan sinif tarafindan implemente edilmek zorundadirlar.
- Bir sinifa veya metoda temel gorevlerin tanimlanmasi, detaylarin ise tanimlanmamasi demektir.
- Sinifin icindeki ic isleyisi disaridan izole etmektir.
</details>

---
<details>
    <summary>Interface nedir ?</summary>

- Siniflar arasinda pek cok ortak davranis bulundugu durumlarda tasarlanan yapilardir. 
- TKM OKM AKM'in ortak metotlarini BKM'de toplayabiliriz.
- Sadece kendisinden tureyecek olan siniflarin icini dolduracagi imza metod tanimlarinin bulundugu bir yapidir.
- Erisim belirleyicisi public oldugu taktirde, sinifin icindeki butun metotlar ve degiskenler public olur.
- Interface sinif bildirimi interface kelimesiyle yapilir.
- Bir sinif birden fazla interface implemente edebilir.
- newlenemez, yani nesnesi olusturulamaz.
- Icerisinde yalnizca metodlarin imzalari yer alir, ici dolu metod bulundurmazlar.
- Bir sinifin ne yapmasi gerektigini belirtir, nasil yapmasi gerektigini degil.
- Bir interface ile onu implemente eden bir sinif arasinda can-do iliskisi vardir.
- Interface'ler implementasyon kabul edilir, inheritance kabul edilmez.
- Interface'ler referans tiptir, bu yuzden bir interface, onu implemente eden siniflarin referansini tutar.
- Bir katman, baska bir katmanin sinifini kullanacakken sadece o sinifin interface'inden iletisim kurmalidir.
- Yani, CustomerManager(business)'in CustomerDao(dataAccess) ile iletisim kurarken gidipte MySql nesnesi ile degilde (dataAccess) katmaninin interface'i olan CustomerDao ile iletisim kurar ve bana bir CustomerDao ver der.
</details>

---
<details>
    <summary>Abstract nedir ?</summary>

- icerisinde degisken veya metod bulundurabilir.
- metodlar abstract veya abstract olmayan metodlar olabilir.
- yani abstract metod kullaniyorsan o metod imzadir govdesi olmaz. ama abstract metod degilde normal bir metod ise govdesi olur. (interface ile farki budur, interface'te sadece metod imzasi vardir.)
- abstract metodlar inherit edilen alt siniflarda override edilmek zorundadir.
- Abstract siniflardan turetilen siniflarin abstract metodlari implement etmesi zorunludur. Diger metodlari override etmeden de kullanabilir.
- bir abstract metod yazabilmek icin metodun bulundugu sinifinda abstract bir sinif olmasi gerekiyor.
- bir sinif yalnizca bir abstract sinifi inherit edebilir.
- Kendisinden miras alacak siniflar ile arasinda is-a iliskisi vardir. Yani UniversiteOgrencisi bir Ogrenci'dir.
</details>

---
<details>
    <summary>Access Modifiers nelerdir ?</summary>

- Java'da 4 erisim belirleyici vardir :
- **public :** bu erisim belirleyicisi ile tanimlanan hersey digre butun siniflar tarafindan erisilebilir.
- **private :** Bu erisim belirleyisici ile tanimlanan herhangi bir eleman sadece ve sadece ayni sinif icerisinden erisilebilir.
- **package-private (default) :** Bu erisim belirleyicisi ile isaretlenen hersey sadece ve sadece ayni paket icerisinde tanimlanan siniflar tarafindan erisilebilir. Farkli paketlerde bulunan siniflar erisemez. Java'da degiskenleri, metodlari vs. diger erisim belirleyicisilerle tanimlamazsaniz, package-private olarak tanimlamis olursunuz.Yani package veya package-private gibi kelimeler kulanilmaz
- **protected :** Bu erisim belirleyicisi ile herhangi bir eleman turetilmis olan ve ayni paket icerisinde olan siniflar icerisinden erisilebilir.
</details>

---
<details>
    <summary>Abstract class ve Interface arasindaki farklar nelerdir ?</summary>

| ABSTRACT CLASS                                                                                                               | INTERFACE                                                                                                     |
|------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| Constructor icerebilir                                                                                                       | Constructor iceremez                                                                                          |
| Farkli tiplerde erisim belirleyicisi icerebilir. public, private, protected gibi.                                            | Farkli tipte erisim belirleyicisi icermez.Interfacete tanimlanan her metod default olarak public kabul edilir |
| Sinifin ait oldugu kimligi belirmek icin kullanilir.(is-a iliskisi)                                                          | Sinifin yapabilecegi seyleri belirtmek icin kullanilir (can-do iliskisi)                                      |
| Bir sinif sadece bir abstract class inherit edebilir.                                                                        | Bir sinif birden fazla interface'i inherit edebilir.                                                          |
| Eger bircok sinif ayni turden ve ortak davranislar sergiliyorsa abstract sinifi base class olarak kullanmak dogru olacaktir. | Eger bircok sinif yalnizca ortak metodlari kullaniyor ise interface'ten turetilmeleri dogru olacaktir.        |
| Abstract sinif metod, fields, vb. uyeleri icerebilir                                                                         | Interface yalnizca metod imzalarini icerebilir.                                                               |
| Turetilen siniflar abstract sinifi tamamen veya kismi implemente edebilir.                                                   | Turetilen siniflar interface'i tamamen implemente etmek zorundadir.                                           |
| Metod imzalari veya implementasyonlari icerebilir.                                                                           | Yalnizca metod imzalarini icerebilir                                                                          |

</details>

---
<details>
    <summary>Static keyword nedir ?</summary>

- Sinif degiskenlerini veya sinif metotlarini tanimlarken kullanilir.
- Eger bir degisken *static* yapilirsa o degisken artik sinif degiskeni olur.
- Sinif degiskenleri, her nesne olusturuldugunda ayri ayri olusmazlar.
- Sinifa ait ne kadar nesne olursa olsun, sinif degiskeni (static degisken) 1 tanedir. Ve sinifa ait herhangi bir nesne uzerinden bu degiskene ulasilabilir.
- Sinif degiskenlerinin bir diger ozelligi ise sinifa ait herhangi bir nesne olusturulmasa dahi bellekte yer kaplarlar.
- Degiskenler gibi, metotlar static yapildiginda (*static* anahtar sozcugu ile) o metotlar sinif metotlari olurlar.
- Bir sinif metodu ise nesne olusturulmadan sinif adi uzerinden cagirilabilir.
- Sinifa ait basinda *static* olmayan degikenlere *olgu* degiskenleri deniyor.
- Sinif degiskenleri dendiginde *static* degiskenler oluyor ve bunlarin nesneyle bir baglantilari yok.
- Attributes and methods belongs to the class, rather than an object
</details>

---
<details>
    <summary>Final keyword nedir ? </summary>

- The **final keyword** is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
- The final keyword is useful when you want a variable to always store the same value, like PI
- Attributes and methods cannot be overridden/modified
</details>

---
<details>
    <summary>SQL nedir ?</summary>

- Structured Query Language
- Yapilandirilmis Sorgu Dili
- Iliskisel veritabani RDBMS ile iliski kurmamizi saglayan bir declarative yani bildirimsel bir programlama dilidir.
- Sorgu (Query) SQL komutlarini iceren sorgu cumlesidir.
<details>
    <summary>SELECT</summary>

```roomsql
SELECT first_name, last_name
FROM author;
```
</details>
<details>
    <summary>WHERE</summary>

```roomsql
SELECT title, replacement_cost
FROM film
WHERE replacement_cost = 14.99;
```
```roomsql
SELECT * 
FROM actor
WHERE first_name = 'Penelope' AND last_name = 'Monroe';
```
</details>
<details>
    <summary> BETWEEN ve IN </summary>

```roomsql
SELECT * FROM film
WHERE length >= 100 AND length <= 140;
```
```roomsql
SELECT * FROM film
WHERE length BETWEEN 100 AND 140;
```
```roomsql
SELECT * FROM film
WHERE length IN (30,60,90,120);
```
```roomsql
SELECT first_name, last_name FROM actor
WHERE first_name IN ('Penelope', 'Nick', 'Ed');
```
</details>
<details>
    <summary>LIKE ve ILIKE</summary>

- Burada kullanilan % karakteri sifir, bir veya daha fazla karakteri temsil eder ve wildcard olarak isimlendirilir. Bir deger wildcard karakteri _ karakteridir ve bir karakteri temsil eder. ILIKE operatoru LIKE operatorunun case-insensitive versiyonudur.
```roomsql
SELECT * FROM actor
WHERE first_name LIKE 'P%';
```
</details>
<details>
    <summary>DISTINCT ve COUNT</summary>

- **DISTINCT** bir tablodaki birbirini tekrar eden sutunlari gormek farkli degerleri gormek icin kullaniriz
```roomsql
SELECT DISTINCT rental_rate
FROM film;
```
```roomsql
SELECT DISTINCT replacement_cost
FROM film;
```
- COUNT aggregate fonksiyonu ilgili sorgu sonucunda olusan veri sayisini bildirir. Ismi Penelope olan aktorleri sirala :
```roomsql
SELECT COUNT(*)
FROM actor
WHERE first_name = 'Penelope';
```
</details>
<details>
    <summary>ORDER BY</summary>

- ORDER BY anahtar kelimesi sayesinde verileri herhangi bir sutunda bulunan degerlere gore azalan veya artan bir sekilde siralayabiliriz. (ASC:ARTAN) (DESC:AZALAN)
```roomsql
SELECT title, rental_rate, length
FROM film
ORDER BY rental_rate ASC, length DESC;
```
</details>
<details>
    <summary>LIMIT ve OFFSET</summary>

- Bazi durumlarda kosullari saglayan verilerin tamamini degil belirli bir sayida olanlarini siralamak isteriz, bunun icin LIMIT anahtar kelimesini kullaniyoruz.
```roomsql
SELECT *
FROM film
WHERE title LIKE 'B%'
ORDER BY length DESC
LIMIT 10;
```
- Bazi durumlarda sonuc olarak gordugumuz veri grubu icerisinden bazilarini "pass" gecmek isteriz. Ornegin film tablosundan B ile baslayan filmleri uzunluklarina gore siralayalim ancak en uzun 6 filmi "pass" gecelim ve sonrasindaki 4 firmi siralayalim. LIMIT 4 OFFSET 6.
```roomsql
SELECT *
FROM film
WHERE title LIKE 'B%'
ORDER BY length DESC
OFFSET 6
LIMIT 4;
```
</details>
<details>
    <summary>Aggregate Fonksiyonlar</summary>

- AVG fonksiyonu ile sayisal degerlerden olusan sutunun ortalama degerini aliriz.
```roomsql
SELECT AVG(length)
FROM film;
```
- SUM fonksiyonu ile sayisal degerlerden olusan sutunun toplam degerini aliriz.
```roomsql
SELECT SUM(length)
FROM film;
```
- MAX fonksiyonunu ile kullandigimiz sayisal degerlerden olusan sutunun en yuksek degerini aliriz.
```roomsql
SELECT MAX(length)
FROM film;
```
- MIN fonksiyonunu ile kullandigimiz sayisal degerlerden olusan sutunun en dusuk degerini aliriz.
```roomsql
SELECT MIN(length)
FROM film;
```
</details>
<details>
    <summary>GROUP BY</summary>

- dvdrental veritabaninda rental_rate sutununda 3 farkli deger var. Bu 3 farkli deger icin en uzun filmi bulmaya calisalim.
```roomsql
SELECT rental_rate, MAX(length)
FROM film
GROUP BY rental_rate;
```
- SELECT anahtar kelimesinde bulunan sutunlarin GROUP BY anahtar kelimesi icerisinde bulunmasi gerek. rating'lere gore film sayilarini sirala :
```roomsql
SELECT rental_rate, COUNT(*)
FROM film
WHERE rental_rate != 2.99
GROUP BY rental_rate;
```
</details>
<details>
    <summary>HAVING</summary>

- **HAVING** anahtar kelimesi sayesinde gruplandirilmis verilere kosullar ekleyebiliriz.
- **WHERE** anahtar kelimesi ise satir bazli kosullar vermek icin.
```roomsql
SELECT rental_rate, COUNT(*)
FROM film
GROUP BY rental_rate
HAVING COUNT(*) > 325;
```
- en yuksek alisveris yapan musterinin id'si :
```roomsql
SELECT customer_id, SUM(amount)
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
ORDER BY SUM(amount) DESC
LIMIT 1;
```
</details>
<details>
    <summary>ALIAS</summary>

- AS anahtar kelimesi sayesinde sorgular sonucu olusturgumuz tablo ve sutunlara gecici isimler veririz.
```roomsql
SELECT customer_id as customerid, SUM(amount) as amount
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
ORDER BY SUM(amount) DESC
LIMIT 1;
```
</details>
<details>
    <summary>CREATE</summary>

- Tablo olustururken 3 onemli baslik vardir : Sutunlara verilecek isim, sutunlarin veri tipi ve varsa sutunlarda bulunan kisitlama yapilari.
```roomsql
CREATE TABLE author (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100),
  birthday DATE
);
```
```roomsql
INSERT INTO author(first_name, last_name, email, birthday)
VALUES
  ('Martha', 'Williams', 'martha_williams@gmail.com', '1985-11-23'),
  ('Ilber', 'Ortayli', 'ortayliilber@gmail.com', '1945-03-19'),
  ('Dan', 'Brown', 'dan@gmail.com', '1973-02-02');
```
- Bir tablonun yedegini boyle olustururuz : 
```roomsql
CREATE TABLE author3 AS
SELECT * FROM author;
```
</details>
<details>
    <summary>DROP</summary>

```roomsql
DROP TABLE IF EXISTS author;
```
</details>
<details>
    <summary>UPDATE</summary>

```roomsql
UPDATE author
SET
  first_name = 'Murat',
  last_name = 'Bardakci',
  email = 'bardakcimurat@gmail.com',
  birthday = '1974-01-01'
WHERE first_name = 'Ilber' AND last_name = 'Ortayli';
```
</details>
<details>
    <summary>DELETE</summary>

```roomsql
DELETE FROM author
WHERE first_name = 'Tom';
```
</details>
<details>
    <summary>Primary Key nedir ?</summary>

- PRIMARY KEY bir tabloda bulunan veri siralarini birbirinden ayirmamizi saglayan bir kisitlama (constraint) yapisidir. 
- O tabloda bulunan veri siralarina ait bir "benzersiz tanimlayicidir".
- benzersiz (unique) olmalidir
- NULL degerine sahip olamaz
- Bir tabloda en fazla 1 tane bulunur.
```roomsql
CREATE TABLE bok (
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author(id)
);
```
</details>
<details>
    <summary>Foreign Key nedir ?</summary>

- FOREIGN KEY bir tabloda bulunan herhangi bir sutundaki verilerin genelde baska bir tablo sutunundan referans vermesi durumudur, tablolar arasi iliski kurulmasini saglar.
- Bir tabloda birden fazla sutun FK olarak tanimlanabilir.
- Ayni sutunun icerisinde ayni degerler bulunabilir.
```roomsql
CREATE TABLE bok (
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author(id)
);
```
</details>
<details>
    <summary>INNER JOIN</summary>

- INNER JOIN yapisi sayesinde birbiriyle iliskili olan tablolarin birbiriyle kesisen verilerini siralayabiliriz. 
- author-book tablolarinin yerlerinin degistirilmesi sonucu etkilemez bundan dolayi simetriktir.
```roomsql
SELECT title, first_name, last_name
FROM bok
INNER JOIN author ON bok.author_id = author.id;
```
```roomsql
SELECT city as sehir_ismi, country as ulke_ismi
FROM city
INNER JOIN country
ON country.country_id = city.country_id
WHERE country LIKE 'Turke%';
```
</details>
<details>
    <summary>LEFT JOIN</summary>

- LEFT JOIN yapisinda tablo birlestirme islemi tablo1 (soldaki tablo) uzerinden gerceklestirilir.
- Ornegin tablo1 olarak bok tablosunu aldigimizda oncelikle bok tablosundaki tum verileri aliriz, sonrasinda bu verilerin eslestigi ilgili tablo2 sutunundaki verileri aliriz. tablo1'de olup tablo2'de olmayan veriler icin NULL degeri kullanilir.
```roomsql
SELECT book.title, author.first_name, author.last_name
FROM book
LEFT JOIN author
ON author.id = book.author_id;
```
</details>
<details>
    <summary>RIGHT JOIN</summary>

- RIGHT JOIN yapisindaki tablo birlestirme islemi tablo2 (Sagdaki tablo) uzerinden gerceklestirilir. Ornegin tablo2 author tablosunu aldigimizda oncelikle author tablosundaki butun verileri alacagiz, sonra bu verilerin eslestigi tablo1 sutunundaki verileri alacagiz. tablo2 de olup tablo1'de olmayanlar icin NULL degeri kullanilir.
```roomsql
SELECT bok.title, author.first_name, author.last_name
FROM bok 
RIGHT JOIN author
ON author.id = bok.author_id;
```
</details>
<details>
    <summary>FULL JOIN</summary>

- FULL JOIN yapisinda tablo birlestirme islemi her iki tablo uzerinden gerceklestirilir.
- Ornegin tablo1 olarak book tablosunu aldigimizda tum verileri aliriz, tablo2 'deki tum verileri de aliriz.
- tablo1'de olup tablo2'de olmayan ve tablo2'de olup tablo1'de olmayan veriler icin NULL degeri kullanilir.
```roomsql
SELECT book.title, author.first_name, author.last_name FROM book
FULL JOIN author
ON author.id = book.author_id;
```
</details>
</details>

---
<details>
    <summary> SOLID principles nelerdir ? </summary>

<details>
    <summary> Single Responsibility Principle </summary>

- Each class should be responsible for a single part or functionality of the system.
- Every class in Java should have a single job to do
- Here is an example of a java class that doesn't follow the single responsibility principle :
```java
public class Vehicle {
  public void printDetails() {}
  public double calculateValue() {}
  public void addVehicleToDB() {}
}
```
- The Vehicle class has three separate responsibilities: reporting, calculation, and database.
- By applying SRP, we can separate the above class into three classes with separate responsibilities.
</details>
<details>
    <summary> Open-Closed Principle </summary>

- Software components should be open for extension, but not for modification
```java
public class VehicleCalculations {
    public double calculateValue(Vehicle v) {
        if (v instanceof Car) {
            return v.getValue() * 0.8;
            if (v instanceof Bike) {
                return v.getValue() * 0.5;
            }
        }
    }
}
```
- Suppose we now want to add another subclass called Truck. We would have to modify the above class by adding another if statement, which goes against the Open-Closed Principle.
- A better approach would be for the subclasses Car and Truck to override the calculateValue method:
```java
public class Vehicle {
    public double calculateValue() {}
}
public class Car extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.8;
}
public class Truck extends Vehicle{
    public double calculateValue() {
        return this.getValue() * 0.9;
}}}
```
- Adding another Vehicle type is as simple as making another subclass and extending from the Vehicle class.
</details>
<details>
    <summary> Liskov Substitution Principle </summary>

- Objects of a superclass should be replaceable with objects of its subclasses without breaking the system.
- The Liskov Substitution Principle applies to inheritance hierarchies such that derived classes must be completely substitutable for their base classes.
</details>
<details>
    <summary> Interface Segregation Principle </summary>

- No client should be forced to depend on methods that it does not use.
- The Interface Segregation Principle states that clients should not be forced to depend upon interface members they do not use. In other words, do not force any client to implement an interface that is irrelevant to them.
- it does not make sense for a Bike class to implement the openDoors() method as a bike does not have any doors! 
- To fix this, ISP proposes that the interfaces be broken down into multiple, small cohesive interfaces so that no class is forced to implement any interface, and therefore methods, that it does not need.
</details>
<details>
    <summary> Dependency Inversion Principle </summary>

- High-level modules should not depend on low-level modules, both should depend on abstractions.
- The Dependency Inversion Principle states that we should depend on abstractions (interfaces and abstract classes) instead of concrete implementations (classes).
- The abstractions should not depend on details; instead, the details should depend on abstractions.
- what if we wanted to add another engine type, let’s say a diesel engine? This will require refactoring the Car class.
```java
public class Car {
    private Engine engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
public class Engine {
   public void start() {}
}
```
- we can solve this by introducing a layer of abstraction. Instead of Car depending directly on Engine, let’s add an interface:
```java
public interface Engine {
    public void start();
}
public class Car {
    private Engine engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
public class PetrolEngine implements Engine {
   public void start() {//}
}
public class DieselEngine implements Engine {
   public void start() {//}
}}}
```

</details>
</details>

---
<details>
    <summary> Siniflar Arasi iliskiler nelerdir ? </summary>

- **Bagimlilik Dependency** iliskisi / **uses a** :
- Eger bir sinifin metotlarindan en az biri baska bir sinifa ait parametre aliyorsa, parametre alan metoda ait sinif diger sinifa bagimlidir ya da onu kullanir.
- **Birlestirme Composition** iliskisi / **has a** :
- Eger bir sinifin degiskenlerinden en az bir tanesi baska bir sinif turunden ise, degiskene sahip olan sinif diger sinifi icerir yani "has a" olarak adlandirilir.
- **Kalitim Inheritance** iliskisi / **is a** :
- Eger bir sinifa ait tum nesneler ayni zamanda daha genel yapidaki baska bir sinifa aitse, o zaman bu iki sinif arasinda kalitim iliskisi vardir.
</details>

---
<details>
    <summary>Singleton Design Pattern nedir ?</summary>

- The Singleton pattern solves two problems at the same time, violating the *Single Responsibility Principle*.
- **Ensure that a class has just a single instance.** We want to control how many instances a class has is to control access to some shared resource - for example, a database or a file.
- Here's how it works : imagine that you created an object, but after a while decided to create a new one. Instead of receiving a fresh object, you'll get the one you already created.
- Note that this behavior is impossible to implement with a regular constructor since a constructor call must always return a new object by design.
- **Provide a global access point to that instance.** Just like a global variable, the Singleton pattern lets you access some object from anywhere in the program. However, it also protects that instance from being overwritten by other code.
- All implementations of the Singleton have these two steps in common : 
  - Make the default constructor private, to prevent other objects from using the `new` operator with the Singleton class.
  - Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.
![](../../../AppData/Local/Temp/structure-en-indexed.png)
- Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
- The Singleton pattern disables all other means of creating objects of a class except for the special creation method.
- Thid method either creates a new object or returns an existing if it has already been created.
- **Use the Singleton pattern when you need stricter control over global variables.**
- Unlike global variables, the Singleton pattern guarantees that there's just one instance of a class.
- Nothing, except for the Singleton class itself, can replace the cached instance.
- Note that you can always adjust this limitation and allow creating any number of Singleton instances.
- The only piece of code that needs changing is the body of the `getInstance` method.
- **How to implement?**
  1. Add a private static field to the class for storing the singleton instance. 
  2. Declare a public static creation method for getting the singleton instance.
  3. Implement “lazy initialization” inside the static method. It should create a new object on its first call and put it into the static field. The method should always return that instance on all subsequent calls.
  4. Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.
  5. Go over the client code and replace all direct calls to the singleton’s constructor with calls to its static creation method.
- [refactoring.guru](https://refactoring.guru/design-patterns/singleton/java/example#example-1--Singleton-java)
- ----------------------------------------
- Advantage of Singleton Design Pattern : Saves memory because object is not created at each request. Only single instance is reused again and again.
- Singleton Design pattern, Creational Design Pattern grubunda yer alir.
- Singleton Design patter calisma zamaninda yalnizca bir object yaratilmasini garanti eden tasarim desenidir.
- Kullanimina ihtiyac duyulan durum sudur :
    - Birden cok sinifin ayni instance'i kullanmasi gerekmektedir.
    - Tum uygulama icin yalnizca bir nesne olmasi gerekmektedir.
    - Sadece bir nesne oldugu (unique) garanti edilmelidir.
- Bu gereklilikler icin bir sinif olustururuz ve sinifin kendi instance'ini yonetmesini saglariz.
- Bir sinifin yalnizca bir instance'inin bulundugundan emin olmaliyiz ve buna global erisim noktasi saglamaliyiz.
- Singleton pattern kullaniminin faydalari :
  - Bir instance'a kontrollu erisim saglanir.
  - Global degiskenler yaratmaktan kaciniriz.
- Singleton pattern yalnizca bir object yaratmak icin test edilmis bir yontemdir.
- Singleton pattern bize global bir erisim noktasi sunar, global degiskenler gibi dezavantaji yoktur.
- Bu dezavantajlardan biri sudur : objemizi global degisken olarak yarattigimizda uygulama basladiginda nesne yaratilacak, bu nesne kaynak yogunsa ve uygulamaniz onu kullanmadan tamamladiysa ne olacak ? Single Pattern'dea bir object ancak ona ihtiyac duydugumuzda yaratilir.

<details>
    <summary>Example</summary>

```java

```
</details>

</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

---
<details>
    <summary> ? </summary>

-
</details>

