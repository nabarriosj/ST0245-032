import java.util.ArrayList;
public class Nodo1 {
	private String nombre;
	private double tamanio;
	private Nodo1 directorio;
	private ArrayList<Nodo1> archivos = new ArrayList<>();

	public Nodo1(String nombre, double tamanio, Nodo1 directorio) {
		this.nombre = nombre;
		this.tamanio= tamanio;
		archivos.add(directorio)
	}

	public Nodo1(String nombre, Nodo1 directorio) {
		this.nombre = nombre;
		archivos.add(directorio);
	}

	public String getNombre() {
		return name;
	}

	public Nodo1 getDirectorio() {
		return directorio;
	}

	public double getTamanio {
		return tamanio;
	}	

	public int getTamanioArchivos() {}
		return files.size();
	}

	public void añadirArchivo(Nodo1 nodo) {
		archivos.add(nodo);
	}

	public Nodo1 getAchivos(int i) {
		return archivos.get(i)
	}
}
