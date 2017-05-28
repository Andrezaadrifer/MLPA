import java.util.Scanner;

public class Matriz_2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);

		String letra[][]= new String[4][4];

		for(int linha=0; linha<3;linha++){
			for(int coluna=0; coluna<3; coluna++){
				System.out.print("dig uma letra numº :");
				matriz[linha][coluna]=in.nextInt();
			}
		}
		for (int linha=0; linha<3; linha++){
			for(int coluna=0; coluna<3; coluna++){
				System.out.println(linha+"-"+coluna+":"+matriz[linha][coluna]);
			}
		}
	}

}
