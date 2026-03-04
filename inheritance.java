class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    void work() {
        System.out.println(name + " is working as an employee.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println(name + " is managing the team.");
    }
}

class Student extends Person {
    void study() {
        System.out.println(name + " is studying.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.name = "Rahul";
        m.displayName();
        m.work();
        m.manage();

        System.out.println();

        Student s = new Student();
        s.name = "Anita";
        s.displayName();
        s.study();
    }
}