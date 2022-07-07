public class Duck extends Herbivorous{

    public Duck() {
        this.weight=1;
        this.maxPopulation=50;//500
        this.speed=1;
        this.foodSaturation=0.15;
        this.turnToDeath=4;
    }

    @Override
    public String toString() {
        return "Duck" ;
    }



}
