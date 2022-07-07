import java.util.*;

public class Main {

    public static ArrayList<ArrayList<ArrayList<Creature>>> world;
    public static Map<CreatureTypes, Map<CreatureTypes, Integer>> mapEatableProbability;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) throws NoSuchFieldException, InterruptedException {

        // создаем мир

        world = generateWorld();

        // создаем list Creature и заполняем им наш мир

        List<CreatureTypes> listOfCreatures = List.of(CreatureTypes.BEAR, CreatureTypes.WOLF, CreatureTypes.SNAKE);

        GeneratorCreature generatorCreature = new GeneratorCreature();
        for (CreatureTypes type : listOfCreatures) {
            generatorCreature.generateCreature(type);
        }
        System.out.println("Создали мир");
        printWorld();

        // создаем мапу вероятности съедания

        mapEatableProbability = CreateMapEatableProbability();

        // запускаем процесс поедания

        CreaturesEating(mapEatableProbability);

        // новый мир после поедания
        System.out.println("Мир после поедания");
        printWorld();

        // размножились

        reproductionCreatures(world);

        // после размножения
        System.out.println("Мир после размножения");
        printWorld();

        // создаем процесс движения
        moveWorld();
        System.out.println("Мир после перемещения");
        printWorld();

    }

    public static void printWorld() {
        Map<Creature, Integer> log = new LinkedHashMap<>();
        for (int i = 0; i < Constants.X_AXIS_LENGTH; i++) {
            for (int j = 0; j < Constants.Y_AXIS_LENGTH; j++) {
                for (int k = 0; k < world.get(i).get(j).size(); k++) {
                    Creature creature = world.get(i).get(j).get(k);
                    if (!log.containsKey(creature)) {
                        log.put(creature,1);
                    }
                    else {
                        log.put(creature,log.get(creature)+1);
                    }
                }
            }
        }

        for (Creature c: log.keySet()) {
            System.out.println(c.getClass().getName() +" " +  log.get(c));
        }

    }


    private static void reproductionCreatures(ArrayList<ArrayList<ArrayList<Creature>>> world) {
        for (int i = 0; i < Constants.X_AXIS_LENGTH; i++) {
            for (int j = 0; j < Constants.Y_AXIS_LENGTH; j++) {
                ArrayList<Creature> creaturesCheck = world.get(i).get(j);
                creaturesCheck.addAll(getCounts(creaturesCheck));
            }
        }
    }

    private static List<Creature> getCounts(List<Creature> creatures) {
        Map<Creature, Integer> counts = new HashMap<>();
        for (Creature creature : creatures) {
            if (!counts.containsKey(creature)) {
                counts.put(creature, 1);
            } else {
                int value = counts.get(creature);
                counts.put(creature, value + 1);
            }
        }
        List<Creature> result = new ArrayList<>();
        for (Creature creature : counts.keySet()) {
            Integer getCreature = counts.get(creature);
            if (getCreature >= 2) {
                int valueNewCreature = getCreature / 2;
                for (int i = 0; i < valueNewCreature; i++) {
                    result.add(creature);
                }
            }
        }
        return result;
    }


    private static void moveWorld() {
        int Steps;

        ArrayList<ArrayList<ArrayList<Creature>>> tempWorld = (ArrayList<ArrayList<ArrayList<Creature>>>) world.clone();

        for (int i = 0; i < world.size(); i++) {
            for (int j = 0; j < world.get(i).size(); j++) {
                for (int k = 0; k < world.get(i).get(j).size(); k++) {
                    ArrayList<String> canMove = new ArrayList<>();
                    Steps = (int) (Math.round(Math.random() * (world.get(i).get(j).get(k).speed + 1)));
                    if (Steps != 0 && Steps < Constants.X_AXIS_LENGTH - Steps && Steps < Constants.Y_AXIS_LENGTH - Steps) {
                        addWays(Steps, canMove, i, j);
                        int realSteps = (int) (Math.random() * canMove.size());
                        String getWay = canMove.get(realSteps);
                        Creature temp = getCreature(i, j, k);

                        switch (getWay) {
                            case "left" -> {
                                tempWorld.get(i - Steps).get(j).add(temp);
                                removeCreature(tempWorld, i, j, k);
                            }
                            case "right" -> {
                                tempWorld.get(i + Steps).get(j).add(temp);
                                removeCreature(tempWorld, i, j, k);
                            }
                            case "up" -> {
                                tempWorld.get(i).get(j - Steps).add(temp);
                                removeCreature(tempWorld, i, j, k);
                            }

                            case "down" -> {
                                tempWorld.get(i).get(j + Steps).add(temp);
                                removeCreature(tempWorld, i, j, k);
                            }
                        }
                    }
                }
            }
        }
        world = tempWorld;
    }

    private static void removeCreature(ArrayList<ArrayList<ArrayList<Creature>>> tempWorld, int i, int j, int k) {
        tempWorld.get(i).get(j).remove(world.get(i).get(j).get(k));
    }

    private static void addWays(int move, ArrayList<String> canMove, int i, int j) {
        if (i - move >= 0) {
            canMove.add("left");
        }
        if (i + move < Constants.X_AXIS_LENGTH) {
            canMove.add("right");
        }
        if (j - move >= 0) {
            canMove.add("up");
        }
        if (j + move < Constants.Y_AXIS_LENGTH) {
            canMove.add("down");
        }
    }

    private static Creature getCreature(int i, int j, int k) {
        return world.get(i).get(j).get(k);
    }

    private static void CreaturesEating(Map<CreatureTypes, Map<CreatureTypes, Integer>> mapEatableProbability) throws InterruptedException {
        Creature attackerCreature;
        Creature defenderCreature;
        int attackerCreaturePosition = 0;
        int defenderCreaturePosition;

        for (int i = 0; i < world.size(); i++) {
            for (int j = 0; j < world.get(i).size(); j++) {
                for (int k = 0; k < world.get(i).get(j).size(); k++) {
                    attackerCreature = world.get(i).get(j).get(attackerCreaturePosition);
                    defenderCreature = world.get(i).get(j).get(k);
                    while (world.get(i).get(j).get(attackerCreaturePosition).getClass() != world.get(i).get(j).get(k).getClass()) {
                        defenderCreaturePosition = k;

                        int eatablePercents = mapEatableProbability.get(CreatureTypes.valueOf(attackerCreature.toString().toUpperCase())).get(CreatureTypes.valueOf(defenderCreature.toString().toUpperCase()));
                        int fightPercent = (int) (Math.round(Math.random() * 100));

                        if (eatablePercents > fightPercent) {

                            world.get(i).get(j).remove(defenderCreaturePosition);
                            if (defenderCreaturePosition == world.get(i).get(j).size() - 1) {
                                break;
                            }
                            if (world.get(i).get(j).size() - 1 < attackerCreaturePosition) attackerCreaturePosition++;
                            else break;
                        }
                    }
                    attackerCreaturePosition = 0;
                }
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
