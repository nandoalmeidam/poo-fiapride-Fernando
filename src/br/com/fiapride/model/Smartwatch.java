package br.com.fiapride.model;

public class Smartwatch {
	private String cor;
	private String marca;
	private Bateria bateria;
	private boolean ligado;
	private boolean bluetooth;

	public Smartwatch(String cor, String marca, Bateria bateria) {
		this.setCor(cor);
		this.setMarca(marca);
		this.bateria = bateria;
		this.ligado = false;
		this.bluetooth = false;
	}

	public void mostrarCarga() {

		if (ligado == false) {
			System.out.println("O Smartwatch está desligado.");
			return;
		}

		if (bateria.getCarga() < 15) {
			System.out.println("Bateria baixa " + bateria.getCarga() + "%");
			return;
		}

		System.out.println("Carga atual: " + bateria.getCarga() + "%");
	}

	public void receberMensagem(String mensagem) {

		if (ligado == false) {
			System.out.println("Erro: Smartwatch desligado. Não pode receber mensagem.");
			return;
		}

		if (bluetooth == false) {
			System.out.println("Erro: Bluetooth desligado. Não pode receber mensagem.");
			return;
		}

		System.out.println("Mensagem recebida: " + mensagem);
	}

	public String getCor() {
		return this.cor;
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return this.marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public Bateria getBateria() {
		return this.bateria;
	}

	public boolean getLigado() {
		return this.ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getBluetooth() {
		return this.bluetooth;
	}

	private void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
}
