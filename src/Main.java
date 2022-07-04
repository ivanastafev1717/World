import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static ArrayList<ArrayList<ArrayList<Creature>>> world;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) throws NoSuchFieldException {

        // создаем мир

        world = generateWorld();


        // создаем list Creature и заполняем им наш мир

        List<CreatureTypes> listOfCreatures = List.of(CreatureTypes.BEAR, CreatureTypes.WOLF, CreatureTypes.SNAKE);

        GeneratorCreature generatorCreature = new GeneratorCreature();
        for (CreatureTypes type : listOfCreatures) {
            generatorCreature.generateCreature(type);
        }

        System.out.println(world);

        // создаем мапу вероятности съедания

        Map<CreatureTypes, Map<CreatureTypes, Integer>> mapEatableProbability = CreateMapEatableProbability();

        // создаем процесс поедания

        CreaturesEating(mapEatableProbability);
    }

    private static void CreaturesEating(Map<CreatureTypes, Map<CreatureTypes, Integer>> mapEatableProbability) {
        Creature attackerCreature;
        Creature defenderCreature;
        int attackerCreaturePosition = 0;
        int defenderCreaturePosition;

        for (int i = 0; i < Constants.X_AXIS_LENGTH; i++) {
            for (int j = 0; j < Constants.Y_AXIS_LENGTH; j++) {
                for (int k = 0; k < world.get(i).get(j).size(); k++) {
                    attackerCreature = world.get(i).get(j).get(attackerCreaturePosition);
                    defenderCreature = world.get(i).get(j).get(k);
                    while (world.get(i).get(j).get(attackerCreaturePosition).getClass() != world.get(i).get(j).get(k).getClass())
                            {
                        defenderCreaturePosition = k;
                        System.out.println("Attacker " + attackerCreature + " " + attackerCreaturePosition);
                        System.out.println("Defender " + defenderCreature + " " + defenderCreaturePosition);
                        int eatablePercents = mapEatableProbability.get(CreatureTypes.valueOf(attackerCreature.toString().toUpperCase())).get(CreatureTypes.valueOf(defenderCreature.toString().toUpperCase()));
                        int fightPercent = (int) (Math.round(Math.random() * 100));

                        if (eatablePercents > fightPercent) {

                            System.out.println("Выпало "+fightPercent+"<"+eatablePercents+" - " + attackerCreature + " съедает " + defenderCreature);
                            world.get(i).get(j).remove(defenderCreaturePosition);
                            System.out.println("Удалили - " + defenderCreature);
                            System.out.println("defenderCreaturePosition="+defenderCreaturePosition+" world.get(i).get(j).size()-1)+"+(world.get(i).get(j).size()-1));
                            if (defenderCreaturePosition==world.get(i).get(j).size()-1){
                           break;
                            }

                        } else {
                            System.out.println("Выпало "+fightPercent+">"+eatablePercents+" - " +attackerCreature + " проходит мимо " + defenderCreature);
                        }
                            attackerCreaturePosition++;
                                System.out.println();
                    }

                }
                System.out.println("-------------------------------");
                attackerCreaturePosition=0;
            }
        }
    }


    private static Map<CreatureTypes, Map<CreatureTypes, Integer>> CreateMapEatableProbability() {
        Map<CreatureTypes, Map<CreatureTypes, Integer>> mapEatableProbability = new HashMap<>();
        mapEatableProbability.put(CreatureTypes.BEAR, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.SNAKE, 30);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.WOLF, 20);
        mapEatableProbability.put(CreatureTypes.WOLF, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.SNAKE, 10);
        mapEatableProbability.put(CreatureTypes.SNAKE, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.WOLF, 0);

        return mapEatableProbability;
    }


    private static ArrayList<ArrayList<ArrayList<Creature>>> generateWorld() {

        ArrayList<ArrayList<ArrayList<Creature>>> world = new ArrayList<>(Constants.X_AXIS_LENGTH);

        for (int i = 0; i < Constants.X_AXIS_LENGTH; i++) {
            world.add(new ArrayList<>(Constants.Y_AXIS_LENGTH));
            for (int j = 0; j < Constants.Y_AXIS_LENGTH; j++) {
                world.get(i).add(new ArrayList<>());
            }
        }
        return world;
    }

    public static ArrayList<ArrayList<ArrayList<Creature>>> getWorld() {
        return world;
    }

}
