public class Array3 {
  
  //Ejercicio maxSpan
  public int maxSpan(int[] nums) {
    int maxS = 0;
    for(int i = 0; i < nums.length; i++) {
      for(int j = nums.length - 1; j >= i; j--) {
        if(nums[i] == nums[j]) {
          if((j - i +1) > maxS) {
            maxS = j - i + 1;
          }
          break;
        }
      }
    }
    return maxS;
  }
  
  //Ejercicio fix34
  public int[] fix34(int[] nums) {
    int j = 1;
	    for(int i = 0; i < nums.length - 1; i++) {
		    if(nums[i] == 3 && nums[i+1] != 4) {
			    for(; nums[j] != 4; j++);
			      nums[j] = nums[i+1];
			      nums[i+1] = 4;
		    }
	    }
	  return nums;
  }
  
  //Ejercicio fix45
  public int[] fix45(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 4) {
        int temp = nums[i+1];
        nums[i+1] = 5;
        for (int j = 1; j < nums.length; j++){
          if(nums[j] == 5 && nums[j - 1] != 4) {
            nums[j] = temp;
          } else if(nums[0]==5) {
            nums[0]=temp;
          }
        }
      }
    }
   return nums;
  }
  
  //Ejercicio canBalance
  public boolean canBalance(int[] nums) {
    for(int i = 1; i < nums.length; i++) {
      int sum1 = 0;
      int sum2 = 0;
      for(int a = 0; a < i; a++) sum1 += nums[a];
      for(int b = i; b < nums.length; b++) sum2 += nums[b];
      if(sum1 == sum2) return true;
    }
    return false;
  }
  
  //Ejercicio squareUp
  public int[] squareUp(int n) {
	  int[] array = new int[n*n];
	  int p;
	  for(int i = 1; i <= n; i++) {
		  p = n * i - 1;
		  for(int j = 1; j <= i; j++, p--)
			array[p] = j;
	  }
	  return array;
  }
}
