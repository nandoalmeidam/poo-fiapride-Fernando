package br.com.fiapride.main;

import br.com.fiapride.model.Smartwatch;
import br.com.fiapride.model.Bateria;
import br.com.fiapride.model.MiBand;
import br.com.fiapride.model.Pulseira;

public class SistemaPrincipal {

	public static void main(String[] args) {
		System.out.println("--- Sistema Smartwatch ---");
		// Instanciando os objetos especificos
		MiBand novo = new MiBand("preto", "qualquerum", true);
		MiBand novos = new MiBand("vermelho", "seila", true);

		Pulseira pulseira = new Pulseira("borracha");

		System.out.println("MiBand cor: " + novo.getCor() + " | Modelo: " + novo.getMarca());

		System.out.println("\nMiBand cor: " + novos.getCor() + " | Modelo: " + novos.getMarca());

		if (novo.isRedondo()) {
			System.out.println("\nModelo arredondado");
		}

		novo.setPulseira(pulseira);

		System.out.println("\nCom pulseira de material: " + novo.getPulseira().getMaterial());

	}
}
