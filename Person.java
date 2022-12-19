public class Person {

    String fullName;
    int age;

    void move(String fullName){
        System.out.printf("Какой-то  %s идет", fullName);
    }

    void talk(String fullName){
        System.out.printf("\nКакой-то  %s говорит",fullName);
    }
    
    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "\nПолное имя: " + fullName +
                "\nВозраст: " + age;
    }
}
