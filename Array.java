import java.util.*;

public class ArraySimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int ch;

        do {
            System.out.println("\n1.Create");
            System.out.println("2.Insert");
            System.out.println("3.Delete");
            System.out.println("4.Search");
            System.out.println("5.Display");
            System.out.println("0.Exit");
            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter size: ");
                    int n = sc.nextInt();

                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr.add(sc.nextInt());
                    }
                    break;

                case 2:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    System.out.print("Enter value: ");
                    int val = sc.nextInt();

                    arr.add(pos, val);
                    break;

                case 3:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();

                    arr.remove(pos);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();

                    System.out.println("Found at position " + arr.indexOf(key));
                    break;

                case 5:
                    System.out.println("Array Elements: " + arr);
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 0);

        sc.close();
    }
}
