package lab1;

public class Multiples {
    public static void main(String[] args) {
        int result = multiples_of_three_and_five();
        System.out.println("There are " + result + " multiples of 3 or 5 that are below 1000");
    }

    private static int multiples_of_three_and_five() {
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
