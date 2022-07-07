public class Wolf extends Predator{


    public Wolf() {
        this.weight=50;
        this.maxPopulation=30;
        this.speed=3;
        this.foodSaturation=8;
        this.turnToDeath=10;
    }



    @Override
    public String toString() {
        return "Wolf";
    }

}
