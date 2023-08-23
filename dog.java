
public class dog {

    private String name;
    private String breed;

    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("ruff, i am " + name + " " + breed);
    }
}