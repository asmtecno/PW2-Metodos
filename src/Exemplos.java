
public class Exemplos {

	public static void main(String[] args) {
		classificar(-10);

	}

	public static void ehMaiorIdade(int idade) {
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");

		}
	}

	public static void classificar(int num) {
		if (num < 0) {
			System.out.println("Negativo");
		}
		if (num > 0) {
			System.out.println("Positivo");
		} 
		else {
			System.out.println("zero");
		}

	}

}
