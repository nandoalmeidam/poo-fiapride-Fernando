package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Smartwatch;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
    	Smartwatch meuSmartwatch = new Smartwatch();
    	meuSmartwatch.cor = "Preta";
    	meuSmartwatch.marca = "Huawei";
    	meuSmartwatch.cargaBateria = 100;
    	meuSmartwatch.ligado = true;
    	meuSmartwatch.bluetooth = false;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Meu smartwatch é: " + meuSmartwatch.marca + " | Cor: " + meuSmartwatch.cor);
        System.out.println("Carga da bateria: " + meuSmartwatch.cargaBateria);
        System.out.println("Smartwatch ligado ou desligado (true/false): " + meuSmartwatch.ligado);
        System.out.println("Bluetooth ligado ou desligado (true/false)" + meuSmartwatch.bluetooth);

    }
}