class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("This is Calculator class");
    }

    private void show() {
        System.out.println("Private method in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("Advanced Addition:");
        return a + b + 10;
    }

    @Override
    protected void display() {
        System.out.println("This is Advanced Calculator class");
    }

    // Own show method (not overriding parent’s private one)
    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

public class Main {
    public static void main(String[] args) {
        // Base class object
        Calculator c1 = new Calculator();
        System.out.println("Calculator add: " + c1.add(2, 3));
        c1.display();
        c1.accessPrivate();

        System.out.println("-----------------------------");

        // Derived class object
        AdvancedCalculator c2 = new AdvancedCalculator();
        System.out.println("Advanced add: " + c2.add(2, 3));
        c2.display();
        c2.show();
        c2.accessPrivate();

        System.out.println("-----------------------------");

        // Runtime polymorphism: parent reference to child object
        Calculator ref = new AdvancedCalculator();  
        System.out.println("Polymorphism add: " + ref.add(5, 5));
        ref.display();
        ref.accessPrivate();
    }
}
