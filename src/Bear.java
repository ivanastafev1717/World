public class Bear extends Predator{

    public Bear() {
        this.weight=250;
        this.maxPopulation=5;
        this.speed=2;
        this.foodSaturation=38;
        this.turnToDeath=15;
    }

    @Override
    public String toString() {
        return "Bear";
    }



}
