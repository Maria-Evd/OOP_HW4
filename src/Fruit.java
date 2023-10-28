class Fruit {

    private final int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple(int weight) {
        super(weight);
    }
}

class GoldenApple extends Apple {
    public GoldenApple(int weight) {
        super(weight);
    }
}

class Orange extends Fruit {
    public Orange(int weight) {
        super(weight);
    }
}

