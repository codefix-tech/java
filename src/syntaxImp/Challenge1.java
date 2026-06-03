public class Challenge1{
    public static void main(String [] arg){
   
     FindMax fm = new FindMax(new int[]{2,4,1,6});
     
     System.out.println(fm.findMax());

    }
}

class FindMax{

    int max = 0;
    int [] nums;
    FindMax(int[]nums){
        this.nums=nums;
    }

    int findMax(){
       
       for(int i = 0; i < nums.length; i++){
       if (nums[i] > max){
        max = nums[i];
        i++;
       
       }
       
       }
       return max;
    }
}