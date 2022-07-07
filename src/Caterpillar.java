public class Caterpillar extends Herbivorous{

    public Caterpillar() {
        this.weight=0.01;
        this.maxPopulation=100; //10000
        this.speed=1;
        this.foodSaturation=0.0025;
        this.turnToDeath=1;
    }

    @Override
    public String toString() {
        return "Caterpillar";
    }



}
