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
	
	// quando for uma função do tipo de retorno String, preciso mandar imprimir (System.out.println(mensagem3());
	static String mensagem3() {
		return "Aqui é minha função de número 3" ;
	}
	
	// o tipo de parâmetro não precisa ser igual a função uma função String pode receber um parâmetro no valor inteiro.
	// double pode receber um valor int, mas o contrário não pode ocorrer.
	static String mensagem4 (int x) {
		return "Número informado: " + x; }
	
	
	static void resultado (int n1 , int n2) {
		int resultado = n1 + n2;
		
		System.out.println( "o resultado é: " + resultado);
	}

}
