package principal;

public class Program {

	public static void main(String[] args) { 
		mensagem();
		mensagem2 (20.54);
		System.out.println(mensagem3()); 
		System.out.println(mensagem4(34));
		resultado (5 , 5);
	}
		
	static void mensagem() {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2(double n) {
		System.out.println("O numero informado foi: " + n);
	}
	
	// quando for uma fun��o do tipo de retorno String, preciso mandar imprimir (System.out.println(mensagem3());
	static String mensagem3() {
		return "Aqui � minha fun��o de n�mero 3" ;
	}
	
	// o tipo de par�metro n�o precisa ser igual a fun��o uma fun��o String pode receber um par�metro no valor inteiro.
	// double pode receber um valor int, mas o contr�rio n�o pode ocorrer.
	static String mensagem4 (int x) {
		return "N�mero informado: " + x; }
	
	
	static void resultado (int n1 , int n2) {
		int resultado = n1 + n2;
		
		System.out.println( "o resultado �: " + resultado);
	}

}
