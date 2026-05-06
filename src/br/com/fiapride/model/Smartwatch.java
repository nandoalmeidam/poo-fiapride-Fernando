package br.com.fiapride.model;

public class Smartwatch {
	private String cor;
	private String marca;
	private boolean isLigado;
	private boolean isBluetooth;
	private Pulseira pulseira;

	public Smartwatch(String cor, String marca) {
		this.setCor(cor);
		this.setMarca(marca);
		this.isLigado = false;
		this.isBluetooth = false;
	}

	public void mostrarCarga() {

		if (isLigado == false) {
			System.out.println("O Smartwatch está desligado.");
			return;
		}
		System.out.println("O Smartwatch está : " + isLigado);
	}

	public void receberMensagem(String mensagem) {

		if (isLigado == false) {
			System.out.println("Erro: Smartwatch desligado. Não pode receber mensagem.");
			return;
		}

		if (isBluetooth == false) {
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

	public boolean isLigado() {
		return this.isLigado;
	}

	public boolean isBluetooth() {
		return this.isBluetooth;
	}

	public Pulseira getPulseira() {
		return this.pulseira;
	}

	public void setPulseira(Pulseira pulseira) {
		this.pulseira = pulseira;
	}
}
