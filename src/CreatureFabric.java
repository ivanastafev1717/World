public class CreatureFabric {
    public Creature creatureCreature(CreatureTypes type) {
        Creature toReturn = null;
        switch (type) {
            case WOLF -> toReturn = new Wolf();
            case SNAKE -> toReturn = new Snake();
            case FOX -> toReturn = new Fox();
            case BEAR -> toReturn = new Bear();
            case EAGLE -> toReturn = new Eagle();
            case HORSE -> toReturn = new Horse();
            case DEER -> toReturn = new Deer();
            case RABBIT -> toReturn = new Rabbit();
            case HAMSTER -> toReturn = new Hamster();
            case GOAT -> toReturn = new Goat();
            case KANGAROO -> toReturn = new Kangaroo();
            case SHEEP -> toReturn = new Sheep();
            case COW -> toReturn = new Cow();
            case DUCK -> toReturn = new Duck();
            case CATERPILLAR -> toReturn = new Caterpillar();
            case PLANT -> toReturn = new Plant();


            default -> throw new IllegalArgumentException("Неправильный тип животного: " + type);
        }
        return toReturn;
    }
}







