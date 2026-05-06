package br.com.fiapride.model;

public class AppleWatch extends Smartwatch implements Recarregavel {
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

	@Override
	public void recarregar(int percentual) {
		if (percentual < Recarregavel.CARGA_MINIMA || percentual > Recarregavel.CARGA_MAXIMA) {
			System.out.println("Erro: percentual inválido para recarga do AppleWatch.");
		}

		System.out.println("AppleWatch recarregado para " + percentual + "%.");
	}
}
