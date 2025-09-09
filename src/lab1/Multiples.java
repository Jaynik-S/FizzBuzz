package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println("There are " + multiples(1000, 3, 5) + " multiples of 3 or 5 that are below 1000");
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                counter++;
            }
        }
        return counter;
    }
}
