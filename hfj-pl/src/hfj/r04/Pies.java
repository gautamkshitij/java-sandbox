package hfj.r04;
class Pies{
	int wielkosc;
	String nazwa;
	void szczekaj(){
		if(wielkosc>23){
			System.out.println("Houuu! Houuu!");
		} else if(wielkosc>6){
			System.out.println("Chau! Chau!");
		} else {
			System.out.println("Hiau! Hiau!");
		}
	}
	void szczekaj(int iloscSzczekniec){
		while(iloscSzczekniec>0){
			System.out.println("hauuuu");
			iloscSzczekniec=iloscSzczekniec-1;
		}
	}
}
