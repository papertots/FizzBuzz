public class Multiples {
    public static void main(String[] args) {
        int multipleCount = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                multipleCount++;
            }
        }
        System.out.println(multipleCount);
    }
}
