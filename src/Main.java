import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] oneArray = new int[]{1, 2, 3};
        double[] twoArray = new double[]{1.57, 7.654, 9.986};
        int[] treeArray = new int[]{7, 5, 9, 4};
        System.out.println("Задача 2");
        for (int i = 0; i < oneArray.length; i++) {
            System.out.printf("%s%s", oneArray[i], (i != oneArray.length - 1 ? "," : "\n"));
        }
        for (int i = 0; i < twoArray.length; i++) {
            System.out.printf("%s%s", twoArray[i], (i != twoArray.length - 1 ? "," : "\n"));
        }
        for (int i = 0; i < treeArray.length; i++) {
            System.out.printf("%s%s", treeArray[i], (i != treeArray.length - 1 ? "," : "\n"));
        }
        System.out.println("Задача 3");
        for (int i = oneArray.length - 1; i >= 0; i--) {
            System.out.printf("%s%s", oneArray[i], (i != 0 ? "," : "\n"));
        }
        for (int i = twoArray.length - 1; i >= 0; i--) {
            System.out.printf("%s%s", twoArray[i], (i != 0 ? "," : "\n"));
        }
        for (int i = treeArray.length - 1; i >= 0; i--) {
            System.out.printf("%s%s", treeArray[i], (i != 0 ? "," : "\n"));
        }
        System.out.println("Задача 4");
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] % 2 != 0) {
                oneArray[i] += 1;
            }
        }
        System.out.print(Arrays.toString(oneArray));
    }
}