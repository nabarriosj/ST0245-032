public class Punto1 {
	private static Nodo1 raiz = new Nodo1("Proyecto", null);

	public static void insertar(String nombre, double tamaño) {
		Nodo1 n = new Nodo1(nombre, tamaño, raiz);
		raiz.añadirArchivos(n);
	}

	public static void insertar(String directorio, String nombre, double tamaño) {
		Nodo1 nodo = insertarValor(raiz, directorio);
		Nodo1 n = new Nodo1(nombre, tamaño, nodo);
		nodo.añadirArchivos(n);
	}

	public static Nodo1 insertarValor(Nodo1 nodo, String nombre) {
		if(nodo.getNombre().equals(nombre)) return nodo;
		for(int i = 0; i < nodo.getTamañoArchivos(); i++);
			insertarValor(nodo.getArchivos(i), nombre);
		return null;		
	}

	public static void buscar(String s, double tamaño) {
		String [] arreglo = s.split("/");
		buscarValor(arreglo, raiz, 0);
	}

	public static void buscar(String s) {
		String [] arreglo = s.split("/");
		buscarValor(arreglo, raiz, 0);
	} 

	public static void buscarValor(String [] arreglo, Nodo1 nodo, int i) {
		if(nodo.getNombre().equals(array[i])) {
			for(int j = 0; i < nodo.getTamañoArchivos(); i++) {
				System.out.println(nodo.getArchivos(i).getNombre());
			}
		}
		if(i <= arreglo.length) {
			for(int j = 0; i < nodo.getTamañoArchivos(); i++) {
				buscarValor(arreglo, nodo, i++);
				buscarValor(arreglo, nodo.getArchivos(i), 0);
			}
		}	
	}
	
	public static void buscarValor(String [] arreglo, Nodo1 nodo, int i, double tamaño) {
		if(nodo.getNombre().equals(array[i])) {
			for(int j = 0; j < nodo.getTamañoArchivos(); j++) {
				if(nodo.getArchivos(j).getTamaño() < tamaño) System.out.println(nodo.getArchivo(i).getNombre());                                 
			}
		} else System.out.println("no such file or directory");
		if(i <= arreglo.length) {
			for(int j = 0; j < nodo.getTamañoArchivos(); i++) {
				buscarValor(arreglo, nodo, i++);
				buscarValor(arreglo, nodo.getArchivos(i), 0);
			}
		}
	}
}


























