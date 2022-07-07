import java.util.HashMap;
import java.util.Map;

public class Constants {

    static Map<CreatureTypes, Map<CreatureTypes, Integer>> mapEatableProbability;

    final static int X_AXIS_LENGTH = 100;
    final static int Y_AXIS_LENGTH = 20;

    static {
        mapEatableProbability = new HashMap<>();
        mapEatableProbability.put(CreatureTypes.WOLF, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.SNAKE, 10);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.FOX, 10);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.EAGLE, 10);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.HORSE, 30);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.DEER, 40);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.RABBIT, 70);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.HAMSTER, 90);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.GOAT, 60);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.SHEEP, 70);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.KANGAROO, 20);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.COW, 30);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.DUCK, 80);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.WOLF).put(CreatureTypes.PLANT, 0);

        mapEatableProbability.put(CreatureTypes.SNAKE, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.RABBIT, 50);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.HAMSTER, 90);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.DUCK, 50);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.CATERPILLAR, 90);
        mapEatableProbability.get(CreatureTypes.SNAKE).put(CreatureTypes.PLANT, 0);

        mapEatableProbability.put(CreatureTypes.FOX, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.SNAKE, 20);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.EAGLE, 10);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.DEER, 5);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.RABBIT, 70);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.HAMSTER, 90);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.GOAT, 20);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.SHEEP, 20);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.KANGAROO, 5);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.DUCK, 80);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.FOX).put(CreatureTypes.PLANT, 0);

        mapEatableProbability.put(CreatureTypes.BEAR, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.WOLF, 20);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.SNAKE, 30);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.EAGLE, 10);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.DEER, 5);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.RABBIT, 70);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.HAMSTER, 90);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.GOAT, 20);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.SHEEP, 20);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.KANGAROO, 5);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.DUCK, 80);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.BEAR).put(CreatureTypes.PLANT, 0);

        mapEatableProbability.put(CreatureTypes.EAGLE, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.SNAKE, 50);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.RABBIT, 90);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.HAMSTER, 90);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.DUCK, 85);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.CATERPILLAR, 20);
        mapEatableProbability.get(CreatureTypes.EAGLE).put(CreatureTypes.PLANT, 0);

        mapEatableProbability.put(CreatureTypes.HORSE, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.HORSE).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.DEER, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.DEER).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.RABBIT, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.RABBIT).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.HAMSTER, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.HAMSTER).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.GOAT, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.GOAT).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.SHEEP, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.SHEEP).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.KANGAROO, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.KANGAROO).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.COW, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.CATERPILLAR, 0);
        mapEatableProbability.get(CreatureTypes.COW).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.DUCK, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.CATERPILLAR, 50);
        mapEatableProbability.get(CreatureTypes.DUCK).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.CATERPILLAR, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.CATERPILLAR).put(CreatureTypes.PLANT, 100);

        mapEatableProbability.put(CreatureTypes.PLANT, new HashMap<>());
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.WOLF, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.SNAKE, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.FOX, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.BEAR, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.EAGLE, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.HORSE, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.DEER, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.RABBIT, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.HAMSTER, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.GOAT, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.SHEEP, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.KANGAROO, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.COW, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.DUCK, 0);
        mapEatableProbability.get(CreatureTypes.PLANT).put(CreatureTypes.CATERPILLAR, 0);






    }

}
