package r4;

class OdtwarzaczTest{
	static Odtwarzacz odtwarzacz = new Odtwarzacz();
	String tytul = "sing sing";
	public static void main(String[] args){
		new OdtwarzaczTest().odtworz();
	}
	void odtworz(){
		odtwarzacz.playSound(tytul);
	}
}
