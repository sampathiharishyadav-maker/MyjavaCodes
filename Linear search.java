import java.util.*;

class LinearSearch {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter number of elements: ");

int n = sc.nextInt();

int a[] = new int[n];

System.out.println("Enter " + n + "integers");

for (int i=0;i<n;i++)

a[i]=sc.nextInt();

System.out.print("Enter search value: ");
 int key=sc.nextInt();

int i;

for(i=0;i<n;i++){

if(a[i]==key) 
break;
}
if(i<n)
{
System.out.println(key+" found at location "+(i+1));
}
else{
 System.out.println(key+" is not found.");
}
}
}
