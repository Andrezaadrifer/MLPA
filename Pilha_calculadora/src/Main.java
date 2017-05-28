import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Calc calc = new Calc();
		
		System.out.print("Digite a expressão: ");
		String exp = scanf.nextLine();
		calc.calculadora(exp);
		
		scanf.close();
	}
}
