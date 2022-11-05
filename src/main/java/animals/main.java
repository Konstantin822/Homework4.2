package animals;

public class main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Buda");
        Dog dog2 = new Dog("Pesht");
        Cat cat1 = new Cat("Sau");
        Cat cat2 = new Cat("Ron");

        dog1.run(450);
        dog1.swim(5);
        dog2.run(501);
        dog2.swim(11);

        cat1.run(100);
        cat1.swim(1);
        cat2.run(201);
        cat2.swim(1);

        System.out.println("Amount of animals: " + Animal.amount);

    }
}
