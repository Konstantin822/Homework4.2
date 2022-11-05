package animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.runDistance = 500;
        this.swimDistance = 10;
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
        public void swim(int distance){
            if (distance <= swimDistance) {
                System.out.println(this.name + " swam " + distance + " m.");
            } else {
                System.out.println("Too far");
            }
        }
    }
