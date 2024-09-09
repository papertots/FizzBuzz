public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = getSteps(n);
        System.out.println(steps);
    }

    private static int getSteps(int n) {
        int steps = 0;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
                steps++;
            } else {
                n--;
                steps++;
            }
        }
        return steps;
    }
}
