
public class Exercicio {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public static int proximo(int num1) {
		return (num1 + 1);
		
	}
	public static int dobro(int num1) {
		return num1*2;
		
	}
	
	public static void main(String[] args) {
		int resultadoSoma = somar(10,100);
		System.out.println("A soma é: "+ resultadoSoma);
		int resultadoProximo = proximo(10);
		System.out.println("O proximo nº é: "+ resultadoProximo);
		int resultadoDobro = dobro(4);
		System.out.println("O dobro é: "+ resultadoDobro);
	}
	
	

}
