public class laboratorio2_array2 {
  
  //Ejercicio countEvens
  public int countEvens(int[] nums) {
    int contador = 0;
      for(int i = 0; i<nums.length; i++) {
        if(nums[i] % 2 == 0) {
          contador += 1;
        }
      }
      return contador;
  }
  
  //Ejercicio centeredAverage
  public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = nums[0];
    for(int i = 1; i < nums.length; i++) {
	    sum  += nums[i];
	    if(nums[i] > max) { 
        max = nums[i]; 
      } 
      else if(nums[i] < min) min = nums[i];
    }
    return (sum-max-min) / (nums.length - 2);
  }
  
  //Ejercicio sum13
  public int sum13

}
