import java.util.ArrayList;
public class Nodo1 {
	private String nombre;
	private double tama�o;
	private Nodo1 directorio;
	private ArrayList<Nodo1> archivos = new ArrayList<>();

	public Nodo1(String nombre, double tama�o, Nodo1 directorio) {
		this.nombre = nombre;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}	

	public int getTama�anoArchivos() {
		return files.size();
	}

	public void a�adirArchivo(Nodo1 nodo) {
		archivos.add(nodo);
	}

	public Nodo1 getAchivos(int i) {
		return archivos.get(i)
	}
}