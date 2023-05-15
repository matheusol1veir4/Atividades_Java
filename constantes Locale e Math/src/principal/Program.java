package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uma constante � quando seu valor n�o muda
		final double PI = 3.1415;
		int valor1 = 50;
		int valor2 = 65;
		
		//realiza a potencia (o primeiro n�mero � a base o segundo � a potencia��o)
		System.out.println(Math.pow(2 , 2));
		
		//passagem de 2 n�meros como par�metro e retorna o maior deles (vai pegar o maior n�mero inserido)
		System.out.println(Math.max(valor2, valor1));
		
		//� o inverso do max, pega o m�nimo
		System.out.println(Math.min(5, 20));
		
		//retorna a raiz quadrada de um numero
		System.out.println(Math.sqrt(18));
		
		//arredonda o n�mero(para mais ou para menos)
		System.out.println(Math.round(25.6578));
		
		//podemos realizar calculos com valores retornados pelo calculo de Math.
		System.out.println(2 + Math.sqrt(18));
		
		Scanner leia =  new Scanner (System.in);
		//Locale ponto = new Locale("en", "us");
		
		/*System.out.println("Entre com o valor do d�lar: ");
		double dolar = leia.useLocale(ponto).nextDouble();
		
		System.out.println("Valor dolar digitado: " + dolar);*/
		
		String nome = "Matheus Oliveira";
		char sexo = 'M';
		int idade = 25;
		double altura = 1.65879;
		
		// printf -> � print formatar
		// %s -> String, %c -> char, %d -> int, %f -> double ou float (um n�mero flutuante, posso usar %.2f que quer dizer que quero ver apenas 2 casas decimais depois da v�rgula)
		System.out.printf(" O meu nome � %s, sou do sexo %c , tenho %d anos, minha altura %.2f", nome , sexo, idade, altura );
		
		/*
		 * Operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a
		 * != diferente de 
		 * == igual a
		 */
		
		/*
		 * Operadores l�gicos
		 * && = e
		 * || = ou
		 * ! = nega��o
		 */
	
		
		leia.close();
	}
}
