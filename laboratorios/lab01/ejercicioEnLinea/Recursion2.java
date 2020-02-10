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
   
