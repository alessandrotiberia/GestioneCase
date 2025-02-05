package org.generation.italy;

public class Archivio {
	private Casa[] v = new Casa[10];

	public Archivio(Casa[] c) {
		this.v = c;
	}

	/*
	 * METODO RESTITUISCE MEDIA DATO PARAMETRO N, DEI COSTI DI TUTTE LE CASE
	 * PRESENTI NEL CAMPO LA CUI SUPERFICIE SUPERA N
	 */

	public int mediaCase(int n) { 
		int media = 0, count = 0, somma = 0;
		for (int i = 0; i < this.v.length; i++) {
			if (v[i] != null && v[i].getSuperficie() > n) {
				media = media + v[i].costoCasa();
				count++;
			}

		}
		media = somma / count;
		return media;

	}

	public static void main(String[] args) {
		Appartamento a = new Appartamento(100, 3000, 1);
		Appartamento b = new Appartamento(100, 3000, 1);
		Villa c = new Villa(100, 30000, true);
		Casa[] ar = new Casa[10];
		ar[0] = a;
		ar[1] = b;
		ar[2] = c;

		Archivio arch = new Archivio(ar);
		System.out.println(arch.mediaCase(50));
	}
}
