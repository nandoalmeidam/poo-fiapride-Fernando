package br.com.fiapride.model;

public class MiBand extends Smartwatch {

	private boolean isRedondo;

	public MiBand(String cor, String marca, boolean isRedondo) {
		super(cor, marca);

		this.isRedondo = isRedondo;
	}

	public boolean isRedondo() {
		return this.isRedondo;
	}

}