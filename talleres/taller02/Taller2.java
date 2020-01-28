
 *@autor Nelson Barrios, Santiago Montoya
 *@Taller No.2
 */

   public static int gcd(int p, int q){
		if (p % q == 0)
      return q;
    else
      return gcd(q, p % q);
	}



 public boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) 
    
      return target == 0;
   else
   
       return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
}

    
    public static void combinations(String s) {
	combinationsAux("", s);
    }

   
    private static void combinationsAux(String prefix, String s) {
	if(s.length() == 0) {
	    System.out.println( s );
	}else{
	    combinationsAux( _______ + s.charAt(0), s.substring(1));
	    combinationsAux( prefix, s.substring( __ ));
	}
    }

}
