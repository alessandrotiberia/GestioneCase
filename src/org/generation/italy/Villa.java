package org.generation.italy;

public class Villa extends Casa {
	private boolean piscina;
	
	/* Questo è il costruttore della classe Villa. Prende tre parametri:
	 *  s (superficie), n (numero di stanze) e p (booleano per indicare la presenza di una piscina). */
	public Villa(int s, int n, boolean p) {
		
		super(s,n); /* Chiama il costruttore della classe genitore (Casa) utilizzando la parola chiave super.
					 * Passa i valori di s e n al costruttore della classe Casa */
		this.piscina = p;
	}

	@Override /* Questa annotazione indica che il metodo che segue sovrascrive un metodo nella classe genitore. */
	public int costoCasa() {
		/* costo è superficie per 2000.*/
		int costo = superficie * 2000;
		if( piscina ) /* SE piscina è presente allora tot costo + costo della piscina */
			costo = costo + 20000;
		/* SE numero stanze maggiore 10 allora costo + costo di 10 Stanze*/
		if( NumeroStanze >= 10)
			costo = costo + 10000;
		return costo; // ritorno costo tot
	}
}
