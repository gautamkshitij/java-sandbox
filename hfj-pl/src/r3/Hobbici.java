package r3;

/**
 * Wersja ostateczne
 *
 * Wprawdzie program kompiluje sie 
 * i bangla, ale wyniki sa hmmmm
 * malo intuicyjne;
 *
 * Poprawilem, zeby program byl 
 * 'bardziej' intuicyjny
 *
 * Wyniki jakie powinien dac kolejno to:
 * Bilbo
 * Frodo
 * Sam 
 */
class Hobbici{
  String imie;
  public static void main(String[] args){
    Hobbici[] h = new Hobbici[3];
    int z=-1;
    while(z<2){
      z=z+1;
	  h[z]=new Hobbici();
      h[z].imie="Bilbo";
      if(z==1){
        h[z].imie="Frodo";
      }
      if(z==2){
        h[z].imie="Sam";
      }
      System.out.print(h[z].imie + " jest ");
      System.out.println("dobrym imieniem dla hobbita");
    }
  }
}
