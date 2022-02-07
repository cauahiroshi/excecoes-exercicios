import java.util.InputMismatchException;

public class DivideNumeros {

	public static void main(String[] args) {
		
		try {
			
			int primeiroNumero = 25; 
			int segundoNumero = 5; 
			
			String nome = "Nicolas"; 
			
			int resultado = primeiroNumero / segundoNumero ; 
			
			System.out.println(resultado);
			
			throw new InputMismatchException ();
			
		}catch(ArithmeticException ex) {
			System.out.println("Não é possivel dividir um numero por 0");
		}catch(InputMismatchException  ex){
			System.out.println("O caractere informado não é um numero");
		}
	}
}
