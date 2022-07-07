import java.util.Objects;

public abstract class Creature {
    double weight;
    int speed;
    int maxPopulation;
    double foodSaturation;
    int turnToDeath;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return weight == creature.weight && speed == creature.speed && maxPopulation == creature.maxPopulation && Double.compare(creature.foodSaturation, foodSaturation) == 0 && turnToDeath == creature.turnToDeath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, speed, maxPopulation, foodSaturation, turnToDeath);
    }
}
