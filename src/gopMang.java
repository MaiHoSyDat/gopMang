import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[arr1.length + arr2.length];
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm các phần tử vào mảng 1 :");
        while (a < arr1.length) {
            System.out.println("Phần tử thứ " + (a + 1) + ": ");
            arr1[a] = scanner.nextInt();
            a++;
        }
        a = 0;
        System.out.println("Thêm các phần tử vào mảng 2 :");
        while (a < arr2.length) {
            System.out.println("Phần tử thứ " + (a + 1) + ": ");
            arr2[a] = scanner.nextInt();
            a++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
           arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length]= arr2[i];
        }
        System.out.println("Mảng sau khi gộp là: " + Arrays.toString(arr3));
    }
}
