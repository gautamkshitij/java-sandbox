package r7;

public class Wlasciciel {

	public void start(){
		Weterynarz w = new Weterynarz();
		Pies p = new Pies();
		Hipopotam h = new Hipopotam();
		w.zrobZastrzyk(p);
		w.zrobZastrzyk(h);
	}
}
