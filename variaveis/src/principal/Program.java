package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 variaveis s�o espa�os alocados na memoria que salvam uma informa��o(um dado)
		 
		 o tipo int armazena n�meros inteiros 
		 int s�o n�meros: 1,2,3,10,150...
		 double que s�o n�meros com casas decimais 
		 exemplo: 10.50, 25.99...
		 char � o tipo que armazena um caractere � um tipo "literal" e a sua inicializa��o � 
		 feita com aspas simples
		 exemplos de char: c, d, a, 1, 2...
		 string � uma classe do java utilizada para armazenar cadeias de caracteres (frases por exemplo)
		 sua inicializa��o � feita com aspas duplas
		 exemplos de string: nomes, locais...
		 */
		
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = "Matheus";
		char sexo = 'M';
		
		int num1 = 5;
		int num2 = 10;
		int resultado = num1 + num2;
		
		String nome2 = "Matheus Oliveira";
		int idade = 25;
		String saldo = "5 milh�es";
		
		
		
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		precoDaCamisa = 50.65;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome);
		System.out.print(sexo);
		System.out.print(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome + " " + sexo + " " + " " + precoDaCamisa);
		System.out.println();
		
		System.out.print (nome + " comprou uma camisa com o valor de: " + precoDaCamisa );
		
		precoDaCamisa = 69.99;
		System.out.println(precoDaCamisa);
		
		nome = "Matheus Oliveira";
		System.out.println("Matheus Oliveira");
		System.out.println();
		
		System.out.print(nome + " comprou uma camisa com o valor de: " + precoDaCamisa);
		
		System.out.println();
		
		System.out.println(num1 + num2);
		System.out.println(" o resultado �: " + resultado);
		System.out.println();
		System.out.println(" o resultado �: " + (num1 + num2));
		
		System.out.println();
		/* 
		  crie uma variavel com seu nome
		  crie uma variavel com sua idade
		  crie uma variavel com um saldo de conta
		  mostre na tela a frase
		  Matheus Oliveira tem 25 anos e possui 5.000.000 reais na conta
		 */
		
		System.out.print(nome + " tem " + idade + " anos " + "e possui " + saldo + " na conta");
		
		
	}
	
	
}
