public class Horse extends Herbivorous{

    public Horse() {
        this.weight=300;
        this.maxPopulation=23;
        this.speed=3;
        this.foodSaturation=45;
        this.turnToDeath=5;
    }

    @Override
    public String toString() {
        return "Horse";
    }




}
