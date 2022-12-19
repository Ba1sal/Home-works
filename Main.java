public class Main {
    public static void main(String[] args) {

        Person adam = new Person();
        adam.fullName = "Azamat";
        adam.age = 18;

        System.out.println(adam);
        adam.move(adam.fullName);
        adam.talk(adam.fullName);

        System.out.println("\n<<<<----->>>>");

        Person chel = new Person("Нурбек", 23);
        System.out.println(chel);
        chel.move(chel.fullName);
        chel.talk(chel.fullName);

    }
}
