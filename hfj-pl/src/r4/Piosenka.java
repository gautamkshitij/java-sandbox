package r4;

class Piosenka{
	String tytul;
	String artysta;
	public void okreslTytul(String tytul){
		this.tytul=tytul;
	}
	public void okreslArtyste(String artysta){
		this.artysta=artysta;
	}
	public void play(){
		System.out.println("Gram piosenke: " +
			tytul);
	}
}
