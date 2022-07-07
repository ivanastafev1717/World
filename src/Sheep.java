public class Sheep extends Herbivorous{

    public Sheep() {
        this.weight=45;
        this.maxPopulation=156;
        this.speed=1;
        this.foodSaturation=7;
        this.turnToDeath=5;
    }

    @Override
    public String toString() {
        return "Sheep";
    }


}
