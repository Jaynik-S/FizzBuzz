package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(1000));
    }
    public static int reduce(int n){
        if (n <= 0) {
            return 0;
        }
        else if (n % 2 == 0) {
            return reduce(n / 2) + 1;
        }
        else {
            return reduce(n - 1) + 1;
        }

    }
}
