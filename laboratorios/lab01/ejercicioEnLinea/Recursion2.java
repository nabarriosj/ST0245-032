* @author: Santiago Montoya Tobon, Nelson Andres Barrios Jimenez
public class Recursion2 {
   public boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length) 
      return target == 0;
    if (nums[start] == 6)
        return groupSum6(start + 1, nums, target - nums[start]);
    return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
  }
  public boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) 
      return target == 0;
    return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
  }
   public boolean groupSum5(int start, int[] nums, int target){
        if(start >= nums.length){
            if(target == 0){
                return true;
            }else{
                return false;
            }
        }if(nums[start] % 5 == 0){
            if(start < nums.length - 1 && nums[start+1] == 1){
                return groupSum5(start + 2, nums, target - nums[start]);
            }else{
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }if(groupSum5(start + 1, nums, target - nums[start])){
            return true;
        }else{
            return groupSum5(start + 1, nums, target);
        }
    }

    public boolean groupSumClump(int start, int[] nums, int target){
        if(start >= nums.length)
        {
            if(target == 0)
                return true;
            return false;
        }
        int i = start + 1;
        for(;  i < nums.length && nums[start] == nums[i]; i++);
        if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
            return true;
        return groupSumClump(i, nums, target);	
    }

    public boolean splitArray(int[] nums){
        return splitArrayAux(nums, 0, 0);	
    }

    public boolean splitArrayAux(int[] nums, int i, int balance){
        if(i == nums.length){
            return (balance == 0);
        }if(splitArrayAux(nums, i + 1, balance + nums[i])){
            return true;
        }else{
            return splitArrayAux(nums, i + 1, balance - nums[i]);
        }
    }
}
