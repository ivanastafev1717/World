public class Rabbit extends Herbivorous{

    public Rabbit() {
        this.weight=3;
        this.maxPopulation=750;
        this.speed=3;
        this.foodSaturation=0.45;
        this.turnToDeath=7;
    }

    @Override
    public String toString() {
        return "Rabbit";
    }



}
