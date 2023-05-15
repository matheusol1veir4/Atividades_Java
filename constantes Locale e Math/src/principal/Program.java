package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uma constante é quando seu valor não muda
		final double PI = 3.1415;
		int valor1 = 50;
		int valor2 = 65;
		
		//realiza a potencia (o primeiro número é a base o segundo é a potenciação)
		System.out.println(Math.pow(2 , 2));
		
		//passagem de 2 números como parâmetro e retorna o maior deles (vai pegar o maior número inserido)
		System.out.println(Math.max(valor2, valor1));
		
		//é o inverso do max, pega o mínimo
		System.out.println(Math.min(5, 20));
		
		//retorna a raiz quadrada de um numero
		System.out.println(Math.sqrt(18));
		
		//arredonda o número(para mais ou para menos)
		System.out.println(Math.round(25.6578));
		
		//podemos realizar calculos com valores retornados pelo calculo de Math.
		System.out.println(2 + Math.sqrt(18));
		
		Scanner leia =  new Scanner (System.in);
		//Locale ponto = new Locale("en", "us");
		
		/*System.out.println("Entre com o valor do dólar: ");
		double dolar = leia.useLocale(ponto).nextDouble();
		
		System.out.println("Valor dolar digitado: " + dolar);*/
		
		String nome = "Matheus Oliveira";
		char sexo = 'M';
		int idade = 25;
		double altura = 1.65879;
		
		// printf -> é print formatar
		// %s -> String, %c -> char, %d -> int, %f -> double ou float (um número flutuante, posso usar %.2f que quer dizer que quero ver apenas 2 casas decimais depois da vírgula)
		System.out.printf(" O meu nome é %s, sou do sexo %c , tenho %d anos, minha altura %.2f", nome , sexo, idade, altura );
		
		/*
		 * Operadores de comparação
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a
		 * != diferente de 
		 * == igual a
		 */
		
		/*
		 * Operadores lógicos
		 * && = e
		 * || = ou
		 * ! = negação
		 */
	
		
		leia.close();
	}
}
