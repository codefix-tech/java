public class Level2{
    public static void main(String [] arg){
        int[] arr = {-2,1,2,3,4,5,6,7,8};
        int countEven = 0;
        int countNotEven = 0;

        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                countEven++;
            }
        }

        System.out.println();
        System.out.print("Non-even (odd) numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                countNotEven++;
            }
        }

        System.out.println();
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of non-even (odd) numbers: " + countNotEven);
    }
}