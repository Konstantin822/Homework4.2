package animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.runDistance = 200;
    }

    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println(this.name + " ran " + distance + " m.");
        } else {
            System.out.println("Too far.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can not swim");
    }
}
