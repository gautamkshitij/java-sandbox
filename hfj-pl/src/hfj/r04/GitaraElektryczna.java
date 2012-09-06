package hfj.r04;
class GitaraElektryczna{
	String rodzaj;
	int iloscKonwerterow;
	boolean uzywanaPrzezGwiazde;
	String getRodzaj(){
		return rodzaj;
	}
	void setRodzaj(String rodzajGitary){
		rodzaj=rodzajGitary;
	}
	int getIloscKonwerterow(){
		return iloscKonwerterow;
	}
	void setIloscKonwerterow(int ilosc){
		iloscKonwerterow=ilosc;
	}
	boolean getUzywanaPrzezGwiazde(){
		return uzywanaPrzezGwiazde;
	}
	void setUzywanaPrzezGwiazde(boolean takCzyNie){
		uzywanaPrzezGwiazde=takCzyNie;
	}
}
