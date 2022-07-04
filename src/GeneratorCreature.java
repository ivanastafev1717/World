public class GeneratorCreature {


    public void generateCreature(CreatureTypes creature) throws NoSuchFieldException {

        CreatureFabric fabric = new CreatureFabric();
        //создаем временный объект для получения maxPopulation

        Creature maxPopulationCreature = fabric.creatureCreature(creature);

//        //получаем maxPopulation как умеем
//        int indexBegin = Integer.parseInt(String.valueOf(temp.toString().indexOf("maxPopulation")));
//      int indexEnd = Integer.parseInt(String.valueOf(temp.toString().indexOf("foodSaturation")));
//      int count = (Integer.parseInt(temp.toString().substring(indexBegin + 14, indexEnd - 2)));
//        System.out.println(count);

        //создаем creature


        for (int i = 0; i < Constants.X_AXIS_LENGTH; i++) {
            for (int j = 0; j < Constants.Y_AXIS_LENGTH; j++) {
                {
                    int countCreature = (int) (Math.random() * maxPopulationCreature.maxPopulation);
                    for (int k = 0; k < countCreature; k++) {

                        Main.getWorld().get(i).get(j).add(fabric.creatureCreature(creature));
                    }

                }
            }
        }
        //  System.out.println(Main.world);

   }

}