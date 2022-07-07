public class Plant extends Creature{

    public Plant() {
        this.weight=1;
        this.maxPopulation=1000; //10000
        this.speed=0;
        this.foodSaturation=0;
        this.turnToDeath=0;
    }

    @Override
    public String toString() {
        return "Plant";
    }



}
