public class Employee {
    // nitelikler
    String name;
    double salary;
    int workHours;
    int startYear;

    Employee(String name, double salary, int workHours, int startYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startYear = startYear;
    }


    // uygulanan vergiyi hesaplar - maas 1000'den az ise vergi alinmaz - fazla ise %3 vergi
    double tax() {
        if(this.salary <= 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    // mesaileri hesaplar
    double bonus() {
        // eger calisan haftada 40 saatten fazla calismis ise fazladan calistigi her saat basina 30 ekle
        int bonus = 0;
        if(this.workHours > 40) {
            bonus = (this.workHours - 40)*30;
        }
        return bonus;
    }

    // kac yildir calistigina gore maas artisini hesaplar
    double raiseSalary() {
        int currentYear = 2021;
        int howLong = currentYear - this.startYear;
        double artisMiktari = 0;

        // eger calisan 10 yildan az suredir calisiyorsa maasina %5 zam yapilacaktir.
        if(howLong < 10) {
            artisMiktari = this.salary * 0.05;
        }
        // eger calisan 9 yildan fazla ve 20 yildan az calisiyorsa maasina %10 zam yapilacak
        else if (howLong > 9 && howLong < 20) {
            artisMiktari = this.salary * 0.10;
        }
        // eger calisan 19 yildan fazla calisiyorsa %15 am yapilacaktir.
        else if (howLong > 19) {
            artisMiktari = this.salary * 0.15; // 20*15=300
        }
        return artisMiktari;
    }

    // toString() calisana ait bilgileri ekrana basacaktir. ? printInfo bence daha uygun
    void printInfo() {
        System.out.println("Adi: "+this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Baslangic Yili: "+this.startYear);
        System.out.println("--------------------------------------");
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maas artisi: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maas: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam maas: "+ (this.salary + raiseSalary()));
    }

}