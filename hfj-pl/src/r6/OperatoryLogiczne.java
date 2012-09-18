package r6;

class OperatoryLogiczne {
	public static void main(String[] args) {
		int cena = 0;
		
		// && operator koniunkcji, np.
		if(cena>=1000 && cena<1600){
			String aparat = "x";
		}
		
		String marka = null;
		// || operator alternatywy, np.
		if(marka.equals("A") || marka.equals("B")) {
			// wykonaj operacje charakterystyczne tylko dla marek A i B
		}

		String typZoomu = "optyczny";
		int stopienPow = 5;
		if ((typZoomu.equals("optyczny") && 
			(stopienPow >=3 && stopienPow<=8)) ||
			(typZoomu.equals("cyfrowy") &&
			(stopienPow>=5 && stopienPow<=12))){
			// wykonaj operacje odpowiednie dla danego obiektywu
		}
		
		int model = 300;
		// rozne ( != oraz ! )
		if(model !=2000){
			// wszystkie aparaty za wyjatkiem modelu 2000
		}
		
		if(!marka.equals("X")){
			// wszystkie marki za wyjatkiem X
		}
		
		Jajko zmRef = null;
		// operatory && i || to tzw. operatory przetwarzania skroconego, 
		// przyklad: 
		if(zmRef != null && zmRef.czyDobryTyp()){
			// wykonaj operacje dla zmiennej wlasciwego typu
		}
		
		// operatory & i | to operatory przetwarzania pelnego
		// (uzywane zazwyczaj do operacji na bitach)
	}
}