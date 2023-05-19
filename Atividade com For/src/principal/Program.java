package principal;

public class Program {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int contador = 0; contador <= 25; contador++) {
			if( contador %2 != 0 ) {
			System.out.print(contador + "\t");
			 soma = soma +contador;	}	
			 }
			System.out.println("\n a soma dos números impares: " + soma);


	}

}
