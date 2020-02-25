/**
* @author Santiago Montoya, Nelson A Barrios
**/
public class Arrays {
  private int size;
  private static final int DEFAULT_CAPACITY = 10;
  private int array[];
  
  public Arrays() {
    size = 0;
    array = new int[DEAFULT_CAPACITY];
  }
  public int size() {
    return size;
  }
  public int add(int e) {
    add(size,e);
  }
  public int get(int i) {
    if(i < size && i>0) {
      return array[i];
    } else {
      throw new IndexOutOfBoundsException("Index : " +i);
    }
  }public void add(int index, int e) {
    if (index == size ) //revisar 
      for (int i = 0; i < size; i++) {
        if(i == size && size == array.length) {
          extend();
        }
        if(i == index) {
          int swap = 0; //revisar 
          array[i] = e;
          array[i + 1] = swap;
          i++;
          size++;
        }
      }
  } else if (index < size ) { //revisar
      array[index] = e;
      size++;
      if (size == arraylength) {
        extend();
    }
  }
  private void extend () {
    int doble = 2 * array.length;
    int array2[] = new int[array.length + doble];
    for (int i = 0; i < size; i++) {
      ___ = array[i] //COMPLETAR
    }
    array = array2 
  }
  
}
