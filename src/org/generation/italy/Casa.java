package org.generation.italy;

public abstract class Casa {

	protected int superficie;
	protected int NumeroStanze;

	public Casa(int s, int n) {
		this.NumeroStanze = n;
		this.superficie = s;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getNumeroStanze() {
		return NumeroStanze;
	}

	public void setNumeroStanze(int numeroStanze) {
		NumeroStanze = numeroStanze;
	}

	public abstract int costoCasa();
}
