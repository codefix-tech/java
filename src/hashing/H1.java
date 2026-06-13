import java.util.Scanner;

public class H1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input size of array
System.out.println("Enter size of array:");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.print("Enter Number : ");

// Pre-compute: Create hash array
// Assuming max element value is 12 based on the video example
int[] hash = new int[12];

for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
hash[arr[i]] += 1;
}

// Input number of queries
System.out.println("Enter number of queries:");
int q = sc.nextInt();
System.out.println("Enter number : ");

// Process queries
 System.out.print("Enter number : ");
while (q-- > 0) {
   
int number = sc.nextInt();
// Fetch result
if (number < hash.length) {
System.out.println(hash[number]);
} else {
System.out.println(0);
}
}
sc.close();
}
}