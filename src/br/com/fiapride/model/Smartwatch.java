package br.com.fiapride.model;

public class Smartwatch {
	public String cor;
	public String marca;
	public int cargaBateria;
	public boolean ligado;
	public boolean bluetooth;

	public Smartwatch(String cor, String marca, int cargaBateria, boolean ligado, boolean bluetooth) {
		this.cor = cor;
		this.marca = marca;
		this.cargaBateria = cargaBateria;
		this.ligado = ligado;
		this.bluetooth = bluetooth;
	}

	public void mostrarCarga() {
		if (cargaBateria < 0 || cargaBateria > 100) {
			System.out.println("Bateria inválida");
			return;
		}

		if (ligado == false) {
			System.out.println("O Smartwatch está desligado.");
			return;
		}

		if (cargaBateria < 15) {
			System.out.println("Bateria baixa " + cargaBateria + "%");
			return;
		}

		System.out.println("Carga atual: " + cargaBateria + "%");
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

		if (cargaBateria <= 5) {
			System.out.println("Erro: bateria baixa " + cargaBateria + "%. Carregue antes.");
			return;
		}

		System.out.println("Mensagem recebida: " + mensagem);
	}
}
