package org.generation.italy;

public class Appartamento extends Casa {

	private int codEnergetico;

	public Appartamento(int s, int n, int codice) {
		super(s,n);
		this.codEnergetico = codice;
	}
	@Override
	public int costoCasa() {
	 int costo = superficie * 1500 + NumeroStanze * codEnergetico;
		return costo;
	}
	
}
