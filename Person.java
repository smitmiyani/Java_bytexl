class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}

public class main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        System.out.println(person.getName());

        person.setName("Jane Doe");

        System.out.println(person.getName()); 
    }
}
