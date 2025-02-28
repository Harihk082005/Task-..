public class Calc {

    public int add(int a, int b) {
        return a + b;
    
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(5, 3);
      
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
