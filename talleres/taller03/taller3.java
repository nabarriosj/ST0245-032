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
	    torresDeHannoiAux(n - 1, origen, destino,intermedio );
	    System.out.println(" Disco "+ n + " de "+ origen + " a "+ destino);
	    torresDeHannoiAux(n - 1, intermedio, origen, destino);
	}
    }
    
    
    
		
