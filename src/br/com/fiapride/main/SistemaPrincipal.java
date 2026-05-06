package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Smartwatch;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Smartwatch meuSmartwatch = new Smartwatch("Preta", "Huawei", 100, true, false);

		System.out.println("--- Sistema Smartwatch ---");
		System.out.println("Meu smartwatch é: " + meuSmartwatch.marca + " | Cor: " + meuSmartwatch.cor);

		meuSmartwatch.mostrarCarga();
		meuSmartwatch.receberMensagem("Olá Fernando!");
	}
}
