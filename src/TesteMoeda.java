import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.printf("informe o valor em reais: R$ ");
        moeda.valorReal = leitor.nextDouble();
        System.out.printf("Informe a cotação comtemporânea: ");
        moeda.cotacaoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar);
        System.out.println(moeda.retornarCalculoConversao());
    }
}
