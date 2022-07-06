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
        System.out.println(world);

        // создаем мапу вероятности съедания

        mapEatableProbability = CreateMapEatableProbability();

        // запускаем процесс поедания

        CreaturesEating(mapEatableProbability);

        // новый мир после поедания
        System.out.println("Мир после поедания");
        System.out.println(world);

        // размножились

       reproductionCreatures(world);

       // после размножения
        System.out.println("Мир после размножения");
        System.out.println(world);

        // создаем процесс движения
        moveWorld();
        System.out.println("Мир после перемещения");
        System.out.println(world);


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
        for (Creature creature: creatures) {
            if (!counts.containsKey(creature)) {
                counts.put(creature,1);
            }
            else {
                int value = counts.get(creature);
                counts.put(creature,value+1);
            }
        }
        List<Creature> result = new ArrayList<>();
        for (Creature creature: counts.keySet()) {
            Integer getCreature = counts.get(creature);
            if (getCreature >=2) {
                int valueNewCreature = getCreature/2;
                for (int i = 0; i < valueNewCreature; i++) {
                    result.add(creature);
                }
            }
        }
        return result;
    }


    private static void moveWorld() {
        int move;
        ArrayList<String> canMove = new ArrayList<>();
        for (int i = 0; i < world.size(); i++) {
            for (int j = 0; j < world.get(i).size(); j++) {
                for (int k = 0; k < world.get(i).get(j).size(); k++) {
                    //количество шагов от 0 до max
                    move = (int) (Math.round(Math.random() * (world.get(i).get(j).get(k).speed+1)));
                    //пофиксить что по x и y разное количество шагов
                    if (move!=0 && move<Constants.X_AXIS_LENGTH && move<Constants.Y_AXIS_LENGTH) {
                        if (i - move >= 0) {
                            canMove.add("left");
                        }
                        if (i + move < Constants.X_AXIS_LENGTH ) {
                            canMove.add("right");
                        }
                        if (j - move >= 0) {
                            canMove.add("up");
                        }
                        if (j + move < Constants.Y_AXIS_LENGTH) {
                            canMove.add("down");
                        }
                    int makeMove = (int) (Math.random() * canMove.size());
                    String getWay = canMove.get(makeMove);
                        Creature temp = getCreature(i, j, k);
                      // правильно ли раставлены оси?
                        switch (getWay) {
                            case "left" -> {
                                System.out.println(world.get(i).get(j).get(k) + " [" + i + j + k + "] двигается " + getWay +" на " + move);
                                world.get(i-move).get(j).add(temp);
                            }
                            case "right" -> {
                                System.out.println(world.get(i).get(j).get(k) + " [" + i + j + k + "] двигается " + getWay +" на " + move);
                                world.get(i+move).get(j).add(temp);
                        }
                            case "up" -> {
                                System.out.println(world.get(i).get(j).get(k) + " [" + i + j + k + "] двигается "  + getWay +" на " + move);
                                world.get(i).get(j-move).add(temp);
                            }

                            default -> {
                                System.out.println(world.get(i).get(j).get(k) + " [" + i + j + k + "] двигается " +getWay + " на " + makeMove +"");
                                world.get(i).get(j+move).add(temp);
                            }
                        }
                    }
                    System.out.println(world.get(i).get(j).get(k) + " [" + i + j + k + "] стоит на месте");
                    canMove = new ArrayList<>();
                }
            }
        }
    }

    private static Creature getCreature(int i, int j, int k) {
        Creature temp = world.get(i).get(j).get(k);
        world.get(i).get(j).remove(k);
        return temp;
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
                    while (world.get(i).get(j).get(attackerCreaturePosition).getClass() != world.get(i).get(j).get(k).getClass())
                            {
                        defenderCreaturePosition = k;
//                      System.out.println("Attacker " + attackerCreature + " " + attackerCreaturePosition);
//                      System.out.println("Defender " + defenderCreature + " " + defenderCreaturePosition);
                        int eatablePercents = mapEatableProbability.get(CreatureTypes.valueOf(attackerCreature.toString().toUpperCase())).get(CreatureTypes.valueOf(defenderCreature.toString().toUpperCase()));
                        int fightPercent = (int) (Math.round(Math.random() * 100));

                        if (eatablePercents > fightPercent) {

//                            System.out.println("Выпало "+fightPercent+"<"+eatablePercents+" - " + attackerCreature + " съедает " + defenderCreature);
                            world.get(i).get(j).remove(defenderCreaturePosition);
                 //   System.out.print("Удалили - " + defenderCreature + "["+i+","+j+","+defenderCreaturePosition+"]"+"    ");
                     //       System.out.println("defenderCreaturePosition="+defenderCreaturePosition+" world.get(i).get(j).size()-1)+"+(world.get(i).get(j).size()-1));
                            if (defenderCreaturePosition==world.get(i).get(j).size()-1){
                           break;
                            }

                        } else {
//                            System.out.println("Выпало "+fightPercent+">"+eatablePercents+" - " +attackerCreature + " проходит мимо " + defenderCreature);
                        }
                           if (world.get(i).get(j).size()-1<attackerCreaturePosition) attackerCreaturePosition++;
                           else break;
//                                System.out.println();
                    }

                }
//                System.out.println("-------------------------------");
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
