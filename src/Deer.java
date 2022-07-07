public class Deer extends Herbivorous{

    public Deer() {
        this.weight=170;
        this.maxPopulation=41;
        this.speed=3;
        this.foodSaturation=26;
        this.turnToDeath=4;
    }

    @Override
    public String toString() {
        return "Deer";
    }



}
