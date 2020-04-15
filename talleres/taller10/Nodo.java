class Nodo {
  Nodo izquierda;
  Nodo derecha;
  int dato;
  public Nodo(int dato) {
    this.dato = dato;
  }
  
  public void Insertar(int n){   //llama al metodo para insertar con un valor n
    InsertarArbol(n)
  }
  
  public boolean Buscar(int n){     //llama al metodo buscar con un valor n 
    BuscarArbol(n)
  }
  
  public boolean BuscarArbol(int valor){     // el metodo va a comparar las ramas basandose en el if para ubicarlo en el sector menor o mayor de el arbol 
    if(dato == valor){
      return true;
    }else if(valor < dato){
      if(izquierda == null){
        return false;
      }else{
        return izquierda.BuscarArbol(valor);
      }
    }else (valor > dato){
      if(dercha == null){
        return false;
      }else{
        return derecha.BuscarArbol(valor);
      }
    } 
  }
  
  
  
  public void InsertarArbol(int valor){     //el metodo comparara el valor para saber en que sector de el arbol ubicarlo en base al if
    if(valor < dato){
      if(izquierda == null){
        izquierda = new Nodo(valor); 
      }else{
        izquierda.InsertarArbol(valor);
      }
    }else{
      if(derecha == null){
        derecha = new Nodo(valor);
      }else{
        derecha.InsertarArbol(valor);
      }
    }
  }
  
}
