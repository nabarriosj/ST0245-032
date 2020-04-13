impor java.util.LinkedList;
class Main{
  public static void main(String[] args){
    String l1 = organizar("This_is_a_[Beiju]_text");
    String l2 = organizar("[[]][][]Happy_Birthday_to_Tsinghua_University");
    String l3 = organizar("asd[fgh[jkl");
    String l4 = organizar("asd[fgh[jkl[");
    String l5 = organizar("[[a[[d[f[[g[g[h[h[dgd[fgsfa[f");
    System.out.println(l1.equals("BeijuThis_is_a__text"));
    System.out.println(l2.equals("Happy_Birthday_to_Tsinghua_University"));
    System.out.println(l3.equals("jklfghasd"));
    System.out.println(l4.equals("jklfghasd"));
    System.out.println(l5.equals("ffgsfadgdhhggfda"));
  }
  
  public static String organizar(String arreglo){
    LinkedList<Character> x = new LinkedList<>();
    int count = 0;
    boolean start = false;
    String y = "";
    for(int i = 0; i < arreglo.length(); i++){
      char apuntador = arreglo.charAt(i);
      if(apuntador == '[' && i < arreglo.length - 1){
        start = true;
        i++;
        count = 0;
      }
      else if(apuntador == ']' && i < arreglo.length - 1){
        start = false;
        count++;
      }
      if (inicio){
        x.add(count,arreglo.charAt(i));
        count++
      }
      else{
        x.add(arreglo.charAt(i));
      }
    }
    
    LinkedList<Character> eliminar = new LinkedList<>();
    eliminar.add('[');
    eliminar.add(']');
    x.removeAll(eliminar);
    
    for(int i = 0; i < x.size(); i++){
      y += x.get(i);
    }
    return y;
  }
}
