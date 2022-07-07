public class Hamster extends Herbivorous{

    public Hamster() {
        this.weight=0.03;
        this.maxPopulation=1000; //10000
        this.speed=1;
        this.foodSaturation=0.0075;
        this.turnToDeath=3;
    }

    @Override
    public String toString() {
        return "Hamster";
    }



}
