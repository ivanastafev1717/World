public class Fox extends Predator{

    public Fox() {
        this.weight=4;
        this.maxPopulation=50;
        this.speed=3;
        this.foodSaturation=1;
        this.turnToDeath=8;
    }

    @Override
    public String toString() {
        return "Fox";
    }



}
