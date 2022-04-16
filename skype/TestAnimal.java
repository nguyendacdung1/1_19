package skype;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Kien1");
        System.out.println(a1);
        Cat c2 = new Cat("kien2");
        c2.greets();
        Dog d1 = new Dog("Kiên");
        System.out.println(d1.toString());
        d1.greets();

    }
}
