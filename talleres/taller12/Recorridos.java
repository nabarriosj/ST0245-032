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
  public boolean profundidad(DigraphAL x, int a, int b){
        ArrayList<Integer> c = x.getSuccessors(a);
        if(c.size() == 0){
            return false; 
        }
        else if(sc(c, b)){
            return true;
        }
        else{
            for(int i = 0; i < c.size(); i++){
                profundidad(x,c.get(i),b);
            }
        }
        return false;
    }
}
