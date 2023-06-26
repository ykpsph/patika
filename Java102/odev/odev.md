1. [] Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı. 
2. [x] Sınıfa ait iki tür constructor metot bulunmalı.
3. [x] MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
4. [x] MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
5. [x] getSize() : dizideki eleman sayısını verir.
6. [x] getCapacity() : dizinin kapasite değerini verir.
7. [x] add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
8. [x] getValue(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
9. [x] remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
10. [x] update(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.
11. [x] String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.
12. [x] int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
13. [x] int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
14. [x] boolean isEmpty() : Listenin boş olup olmadığını söyler.
15. [x] T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.
16. [x] clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.
17. [x] MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.
18. [x] boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
