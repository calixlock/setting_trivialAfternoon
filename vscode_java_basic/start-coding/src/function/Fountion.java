package function;

public class Fountion {
    public static void main(String[] args) {
        // Car myCar = new Car(null, null, 10);
        // myCar.drive(100);
        // myCar.stop(50);
        // myCar.getTotalDistanceDriven();

        int a = 2;
        int b = 3;
        int i = plus(a, b);
        System.out.println(i);

    }

    public static int plus(int a, int b) {
        return a + b;
    }
}
