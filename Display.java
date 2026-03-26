class Calculator {
    public int add(int a, int b) {
        return (a + b);
    }

       protected int add(int a, int b, int c) {
        return (a + b + c);
    }

       private double add(double a, double b) {
        return (a + b);
    }
    public void showDecimalAddition(double x, double y) {
        double result = add(x, y);
        System.out.println("Sum of decimals: " + result);}}
public class Display{
    

       public static void main(String[] args) {

        Calculator c1 = new Calculator();

        System.out.println("Sum of 2 integers: " + c1.add(2, 3));
        System.out.println("Sum of 3 integers: " + c1.add(2, 3, 4));
        c1.showDecimalAddition(2.5, 3.5);
    }
}
 