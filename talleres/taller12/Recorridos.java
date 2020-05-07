import java.util.ArrayList;

public class Recorridos {
  public boolean sc(ArrayList<Integer> x, final int a) {
    for (int i = 0; i < x.size(); i++) {
      if (x.get(i) == a) {
        return true;
      }
    }
    return false;
  }
  
  public boolean profundidad(DigraphAL x, int a, int b) {
    ArrayList<Integer> c = x.getSuccessors(a);
    if(c.size() == 0) {
      return false; 
    }
    else if(sc(c, b)) {
      return true;
    }
    else {
      for(int i = 0; i < c.size(); i++) {
        profundidad(x, c.get(i), b);
      }
    }
    return false;
  }
  public boolean aux(DigraphAL x,ArrayList<Integer> a) {
    ArrayList<Integer> b = new ArrayList();
    boolean c = false;
    for(int i = 0; i < a.size(); i++) {
      b = x.getSuccessors(a.get(i));
      for(int j=0; j < a.size(); j++) {
        if(b.contains(a.get(j))) {
          c = true;   
        }
      }
    }
    return c;
  }
  public boolean amplitud(DigraphAL x, int a, int b) {
    ArrayList<Integer> c = x.getSuccessors(a);
    if(c.size() == 0) {
      return false; 
    } else if(aux(x, c)) {
      return aux(x, c);
    } else {
      for(int i = 0; i < c.size(); i++) {
        amplitud(x, c.get(i),b);
      }
    }
    return false;
  }
}
