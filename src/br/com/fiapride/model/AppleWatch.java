package br.com.fiapride.model;

public class AppleWatch extends Smartwatch {
	private boolean temApps;

	public AppleWatch(String cor, String marca, Bateria bateria, boolean temApps) {
		super(cor, marca, bateria);
		this.temApps = temApps;
	}

	public boolean isTemApps() {
		return this.temApps;
	}

	@Override
	public String exibirTipoUso() {
		return "AppleWatch: ideal para aplicativos, notificações e integração com o celular.";
	}
}