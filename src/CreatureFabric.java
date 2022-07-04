public class CreatureFabric {
    public Creature creatureCreature(CreatureTypes type) {
        Creature toReturn = null;
        switch (type) {
            case BEAR -> toReturn = new Bear();
            case WOLF -> toReturn = new Wolf();
            case SNAKE -> toReturn = new Snake();
            default -> throw new IllegalArgumentException("Неправильный тип животного: " + type);
        }
        return toReturn;
    }
}







