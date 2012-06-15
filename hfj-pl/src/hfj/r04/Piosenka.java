package hfj.r04;
class Piosenka{
	String tytul;
	String artysta;
	public void setTytul(String tytul){
		this.tytul=tytul;
	}
	public void setArtysta(String artysta){
		this.artysta=artysta;
	}
	public void play(){
		System.out.println("Gram piosenke: " +
			tytul);
	}
}
