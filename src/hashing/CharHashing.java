import java.util.Scanner;

public class CharHashing {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input string
String s = sc.next();

// Pre-compute: Create hash array for 26 lowercase letters
int[] hash = new int[26];
for (int i = 0; i < s.length(); i++) {
// Use formula: char - 'a' to map 'a'-'z' to 0-25
hash[s.charAt(i) - 'a']++;
}

// Input number of queries
int q = sc.nextInt();
while (q-- > 0) {
char c = sc.next().charAt(0);
// Fetch result: O(1) lookup
System.out.println(hash[c - 'a']);
}

sc.close();
}
}