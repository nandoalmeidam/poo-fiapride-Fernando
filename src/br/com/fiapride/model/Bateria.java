package br.com.fiapride.model;

public class Bateria {
	private int carga;

	public Bateria(int carga) {
		this.setCarga(carga);
	}

	public int getCarga() {
		return this.carga;
	}

	private void setCarga(int carga) {
		if (carga < 0 || carga > 100) {
			System.out.println("Carga inválida");
			return;
		}
		this.carga = carga;
	}

}