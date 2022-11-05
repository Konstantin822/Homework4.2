package animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.runDistance = 200;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can not swim");
    }
}
