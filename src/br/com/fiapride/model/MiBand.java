package br.com.fiapride.model;

public class MiBand extends Smartwatch implements Recarregavel {

	private boolean isRedondo;

	public MiBand(String cor, String marca, Bateria bateria, boolean isRedondo) {
		super(cor, marca, bateria);
		this.isRedondo = isRedondo;
	}

	public boolean isRedondo() {
		return this.isRedondo;
	}

	@Override
	public String exibirTipoUso() {
		return "MiBand: ideal para monitoramento de saúde e bateria duradoura.";
	}

	@Override
	public void recarregar(int percentual) {
		if (percentual < Recarregavel.CARGA_MINIMA || percentual > Recarregavel.CARGA_MAXIMA) {
			System.out.println("Erro: percentual inválido para recarga da MiBand.");
		}

		System.out.println("MiBand recarregada para " + percentual + "%.");
		;
	}
}