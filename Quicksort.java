import java.util.*;

public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        System.out.println("After sorting:");

        for (int x : a)
            System.out.print(x + " ");
    }
}
