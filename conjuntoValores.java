package atividade;
import java.util.Scanner;

public class conjuntoValores {

	public static void main(String[] args) {
	int valor, maiorValor=0, menorValor=0;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Informe um n�mero inteiro (0 para encerrar): ");
	valor = in.nextInt();
	maiorValor = valor;
	menorValor = valor;

	while (valor!=0) {
		System.out.println("Informe um n�mero inteiro (0 para encerrar): ");
		valor = in.nextInt();
		if (valor<=0) {
			System.out.println("Esses valores n�o entraram nos c�lculos");
		} else {
			if (valor>maiorValor) {
				maiorValor = valor;
			} else if (valor<menorValor) {
				menorValor = valor;
			}
		}
	}
	System.out.println("O maior valor �: "+maiorValor);
	System.out.println("O menor valor �: "+menorValor);
	}

}
"atividade"
