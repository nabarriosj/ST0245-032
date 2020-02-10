 /**
 *
 *@author Santiago Montoya Tobon, Nelson Andres Barrios 
 */
public class Recursion1 {
  public int factorial (int n){
    if (n == 1) 
      return 1;
    return n+ factorial (n-1)
  }
  public int bunnyEars (int c){
    if (n == 0)
      return 0;
    return 2 + bunnyEars (c - 1);
  }
  public int fibonacci (int n){
    if (n <= 0)
      return 0;
    return fibonacci(n - 2) + fibonacci(n - 1);
  }
  public int bunnyEars2 (int c){
    if (c == 0)
      return 0;
    if (c % 2 == 1)
      return 2 + bunnyEars2 (c - 1);
    return 3 + bunnyEars2(c - 1);
  }  
  public int triangle (int f){
    if (f == 0)
      return 0;
    return f + triangle(f - 1);
  }
  public int sumDigits (int n){
    if (n == 0) 
      return 0;
    return n % 10 + sumDigits(n / 10);
  }
  public count7 (int n){
    if (n == 0) 
      return 0;
    if (n % 10 == 7) 
      return 1 + count7(n / 10);
    return count7(n / 10);
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
