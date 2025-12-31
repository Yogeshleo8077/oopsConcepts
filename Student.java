// Class: A class is a blueprint/template
// Object: A object is a real world instance

class Students {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();

        s1.name = "Yogesh";
        s1.age = 23;
        s1.display();

        s2.name = "Anuj";
        s2.age = 25;
        s2.display();
    }
}