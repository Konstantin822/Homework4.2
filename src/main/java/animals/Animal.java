package animals;

public abstract class Animal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;
    public static int amount;

    public Animal(String name){
        this.name = name;
        amount++;
    }

    abstract void run(int distance);

    abstract void swim(int distance);

    }

