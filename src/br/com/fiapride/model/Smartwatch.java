public class Smartwatch {
	private String cor;
	private String marca;
	private int cargaBateria;
	private boolean ligado;
	private boolean bluetooth;

	public Smartwatch(String cor, String marca, int cargaBateria, boolean ligado, boolean bluetooth) {
		this.setCor(cor);
		this.setMarca(marca);
		this.setCargaBateria(cargaBateria);
		this.ligado = false;
		this.bluetooth = false;
	}

	public void mostrarCarga() {

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

	public int getCargaBateria() {
		return this.cargaBateria;
	}

	private void setCargaBateria(int cargaBateria) {
		if (cargaBateria < 0 || cargaBateria > 100) {
			System.out.println("Bateria inválida");
			return;
		}
		this.cargaBateria = cargaBateria;
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
