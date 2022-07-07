public class GeneratorCreature {

    public void generateCreature(CreatureTypes creature) {

        CreatureFabric fabric = new CreatureFabric();

        Creature maxPopulationCreature = fabric.creatureCreature(creature);

        for (int i = 0; i < Constants.X_AXIS_LENGTH; i++) {
            for (int j = 0; j < Constants.Y_AXIS_LENGTH; j++) {
                {
                    int countCreature = (int) (Math.random() * (maxPopulationCreature.maxPopulation+1));
                    for (int k = 0; k < countCreature; k++) {

                        Main.getWorld().get(i).get(j).add(fabric.creatureCreature(creature));
                    }
                }
            }
        }
   }
}