public class College {
    public void status() {
        System.out.println("College is open today");
    }
}

public class Student {
    College obj = new College();

    public void goToCollege() {
        obj.status();
    }
}