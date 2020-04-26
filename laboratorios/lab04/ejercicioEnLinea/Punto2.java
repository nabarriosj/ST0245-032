public class punto2 {
	Nodo root;
	public punto2() {
		root = null;
	}

	public void insertar(int n) {
		insertarArbol(root, n);
	}

	public void buscar(int n) {
		buscarArbol(root, n);	
	}

	public void postOrder() {
		postOrdarArbol(root);
	}

	public Nodo insertarArbol(Nodo nodo, int n) {
		if(nodo == null) {
			nodo = new Nodo(n)
			return nodo;
		} if (n < nodo.dato) {
			nodo.izq = insertarVal(nodo.izq, n);
		} else if (n > nodo.dato) {
			nodo.der = insertarVal(nodo,der, n)
		}
		return nodo;			
	}

	public void buscarArbol(Nodo nodo, int n) {
		if (nodo.dato == n){
			return true;
		} else if (nodo.dato > n) {
			if (nodo == null) return false;
			buscarVal(nodo.der, n);
		} else {
			if (nodo == null) return false;
			buscarVal(nodo.izq, n);
		}
		return false;
	}

	public void postOderArbol(Nodo nodo) {
		if (nodo != null) {
			postOrderArbol(nodo.izq);
			postOrderArbol(nodo.der);
			System.out.println(nodo.dato);
		}
	}
}