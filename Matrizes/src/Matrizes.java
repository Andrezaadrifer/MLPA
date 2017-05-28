import java.util.Scanner;

public class Matrizes {
	public static void main(String[]args){
	Scanner in= new Scanner(System.in);

	int matriz[][]= new int[3][3];

	for(int linha=0; linha<3;linha++){
		for(int coluna=0; coluna<3; coluna++){
			System.out.print("dig um numº :");
			matriz[linha][coluna]=in.nextInt();
		}
	}
	for (int linha=0; linha<3; linha++){
		for(int coluna=0; coluna<3; coluna++){
			System.out.print(/*linha+"-"+coluna+":"*/+matriz[linha][coluna]);
		}
	}
  }
}