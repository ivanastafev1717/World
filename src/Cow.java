public class Cow extends Herbivorous {

    public Cow() {
        this.weight=350;
        this.maxPopulation=20;
        this.speed=1;
        this.foodSaturation=53;
        this.turnToDeath=4;
    }

    @Override
    public String toString() {
        return "Cow";
    }



}
