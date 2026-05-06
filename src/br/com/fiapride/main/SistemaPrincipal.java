package br.com.fiapride.main;

import br.com.fiapride.model.Smartwatch;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Smartwatch meuSmartwatch = new Smartwatch("Preta", "Huawei", 100, true, false);

		System.out.println("--- Sistema Smartwatch ---");
		System.out.println(
				"Meu smartwatch é da marca: " + meuSmartwatch.getMarca() + " | Cor: " + meuSmartwatch.getCor());

		meuSmartwatch.mostrarCarga();
		meuSmartwatch.receberMensagem("Olá Professor!");
		// meuSmartwatch.cargaBateria = 500;
	}
}