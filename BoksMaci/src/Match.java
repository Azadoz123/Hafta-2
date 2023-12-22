public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;
    double hitChance;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.hitChance = Math.random() * 100;
    }

    void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){

                if(hitChance <= 50){
                    f2.health = f1.hit(f2);
                    if(isWin())
                        break;
                    f1.health = f2.hit(f1);
                    if (isWin())
                        break;
                    System.out.println(f1.name +" sağlık: " + f1.health);
                    System.out.println(f2.name +" sağlık: " + f2.health);
                }else {
                    f1.health = f2.hit(f1);
                    if(isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin())
                        break;
                    System.out.println(f1.name +" sağlık: " + f1.health);
                    System.out.println(f2.name +" sağlık: " + f2.health);
                }


            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor !");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= minWeight);
    }

    boolean isWin(){
        if(f1.health == 0){
            System.out.println(f2.name + " kazandı.");
            return true;
        }

        if (f2.health == 0){
            System.out.println(f1.name + " kazandı.");
            return true;
        }

        return false;
    }
}
