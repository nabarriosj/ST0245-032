
 * @author Nelson Barrios, Santiago Montoya
 
public class Taller3 {

	
    public static void torresDeHannoi(int n) {
	torresDeHannoiAux(n, 1, 2, 3);
    }
	
    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
	if(n == 1)
	    {   
		System.out.println("Mover disco de "+ origen + " a "+ destino);
	    }
	else {
	    torresDeHannoiAux(n - 1, origen, intermedio,destino );
	    System.out.println(" Disco "+ n + " de "+ origen + " a "+ destino);
	    torresDeHannoiAux(n - 1, intermedio, origen, destino);
	}
    }
		
		
   
    public static void combinations(String s) { 
	combinationsAux("", s); 
    }

    /**
     *
     * El método combinationsAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena s 
     * @param s es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *
     * Las cadenas de salida tienes una longitud desde 0 hasta el lenght de la cadena s
     * por simplicidad del ejercicio no se repiten letras y el orden de la secuencia 
     * no supone importancia, es decir, la cadena AB es igual a la cadena BA.
     * Ej: para la cadena ABC se tiene la salida: { A, AB, ABC, AC, B, BC, C}
     *
     */
    private static void combinationsAux(String prefix, String s) {  
	if (s.length() _____ 0) { 
	    System.out.println(prefix _____ s.charAt(0));   
	    combinationsAux(______ + s.charAt(0), s.substring(1)); 
	    combinationsAux( _______ , ________);        
	}
    }
		
		
    /**
     *
     * El método permutation es un auxiliar del proceso 
     * @param str es la cadena a permutar
     */
    public static void permutation(String str) {
	permutation("", str); 
    }
	
    /**
     *
     * El método permutationAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena str 
     * @param str es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *
     * Las cadenas de salida tienes una longitud de lenght de la cadena s
     * Ej: para la cadena AB se tiene la salida: { ABC,ACB,BAC,BCA,CAB,CBA }
     * donde los caracteres no se repiten pero el orden tiene un papel importante.
     *
     */
    private static void permutationAux(String prefix, String str) {
	int n = _________;
	if (n ______ 0)
	    System.out.println(prefix);
	else {
	    for (int i = 0; i _____ n; i++)
		permutation( _________________ , str.substring(0, i) + str.substring( _____ , n));
	}
    }
		
	
}
