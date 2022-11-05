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

    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println(this.name + " ran " + distance + " m.");
        } else {
            System.out.println("Too far.");
        }
    }
    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println(this.name + " swam " + distance + " m.");
        } else {
            System.out.println("Too far");
        }
    }
}
