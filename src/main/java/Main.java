import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        Func func = (array1) -> {
            int max = array1[0];
            int preMax = array1[1];
            int maxInd = 0;
            int preMaxInd = 1;
            for (int i = 1; i < array1.length; i++) {
                if(array1[i]>array1[i-1]){
                    preMax = max;
                    max = array1[i];
                    preMaxInd = maxInd;
                    maxInd = i;
                }
            }
            return preMaxInd;
        };

        int k = func.preMaxElement(array);
        System.out.println(array[k]);
    }
}
