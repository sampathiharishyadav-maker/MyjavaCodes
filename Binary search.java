import java.util.*;

class BinarySearch {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter number of elements: ");

int n = sc.nextInt();

int a[] = new int[n];

System.out.println("Enter " + n +"integers");

for(int i=0;i<n;i++)

a[i]=sc.nextInt();

System.out.print("Enter search value: ");

int key=sc.nextInt();

int p=Arrays.binarySearch(a,key);

if(p>=0)

System.out.println(key+" found at location "+(p+1));

else
System.out.println(key+" is not  not fund.");} }
