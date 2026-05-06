package br.com.fiapride.main;

import br.com.fiapride.model.Smartwatch;
import br.com.fiapride.model.Bateria;

public class SistemaPrincipal {

	public static void main(String[] args) {

		// Criando bateria
		Bateria bateria = new Bateria(100);

		// Passando objeto bateria
		Smartwatch meuSmartwatch = new Smartwatch("preta", "Huawei", bateria);

		System.out.println("--- Sistema Smartwatch ---");
		System.out.println(
				"Meu smartwatch é da marca: " + meuSmartwatch.getMarca() + " | Cor: " + meuSmartwatch.getCor());

		meuSmartwatch.mostrarCarga();
		meuSmartwatch.receberMensagem("Olá Professor!");
		// meuSmartwatch.cargaBateria = 500;
	}
}
