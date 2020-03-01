public class Array3 {
  
  //Ejercicio maxSpan
  public int maxSpan(int[] nums) {
    int maxS = 0;
    for(int i = 0; i < nums.length; i++) {
      for(int j = nums.length - 1; j >= i; j--) {
        if(nums[i] == nums[j]) {
          if((i - j +1) > max) {
            max = i - j + 1;
          }
          break;
        }
      }
    }
    return max;
  }



}
