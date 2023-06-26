package Java101;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    // chance of dodging the hit
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter f){
        System.out.println(this.name + " => " + f.name + " " + this.damage + " hasar vurdu.");

        if(f.isDodge()){
            System.out.println(f.name + " gelen hasari blockladi.");

            return f.health;
        }

        if(f.health - this.damage < 0){
            return 0;
        }

        return f.health - this.damage;
    }

    boolean isDodge() {
        double chanceOfDodge = Math.random() * 100;
        return chanceOfDodge <= this.dodge;
    }
}
