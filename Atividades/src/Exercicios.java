import java.util.Scanner;
public class Exercicios {
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("dig sua altura:");
		int m = in.nextDouble();
		System.out.println("dig seu peso:");
		double kg = in.nextDouble();
		double imc = kg/(m*m);
		System.out.print("tem IMC igual a "+imc);
	}
	
} 
