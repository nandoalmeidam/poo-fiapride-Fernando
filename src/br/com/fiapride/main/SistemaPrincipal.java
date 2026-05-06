package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiapride.model.*;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Bateria bateria1 = new Bateria(100);
		Bateria bateria2 = new Bateria(80);

		Smartwatch miBand = new MiBand("Preta", "Xiaomi", bateria1, true);
		Smartwatch appleWatch = new AppleWatch("Branco", "Apple", bateria2, true);

		List<Smartwatch> listaSmartwatch = new ArrayList<>();

		listaSmartwatch.add(miBand);
		listaSmartwatch.add(appleWatch);

		System.out.println("--- RELATÓRIO DE SMARTWATCHES ---");

		for (Smartwatch smartwatch : listaSmartwatch) {
			System.out.println("Marca " + smartwatch.getMarca());
			System.out.println("Cor: " + smartwatch.getCor());
			System.out.println(smartwatch.exibirTipoUso());
			System.out.println("--------------------------------");
		}
	}
}
