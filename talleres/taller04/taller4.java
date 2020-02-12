/**
 *La clase Taller4  tiene como objetivo dar solución al taller5
 *
 *@autor Nelson Barrios, Santiago Montoya
 
    
   public class taller4
   {
    public static int maximo(int [] nums){
        return maximoAux(nums, nums[nums.length-1], nums.length-1);
    }
    public static int maximoAux(int [] nums, int max, int start){
        if(start<0){
            return max;
        }
        else{
            if(nums[start]>=max){
                return maximoAux(nums, nums[start], start-1);
            } 
            else return maximoAux(nums, max, start-1);
        }
    }
    
    public static boolean groupSum(int start, int[] nums, int target){
        if (start == nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start])||  groupSum(start + 1, nums, target);
    }
    
    public static int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
