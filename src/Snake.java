public class Snake extends Predator{

    public Snake() {
        this.weight=2;
        this.maxPopulation=7;
        this.speed=1;
        this.foodSaturation=0.3;
        this.turnToDeath=15;
    }



    @Override
    public String toString() {
        return "Snake";
    }

}
