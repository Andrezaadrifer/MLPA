import java.util.Scanner;

public class Calcular {
	static Scanner c= new Scanner(System.in);
	public static void main(String[] args) {
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				System.out.println("dig um nº:");
				 a[i][j] = c.nextInt();
				 			}
		}
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				System.out.println("dig um nº:");
				b[i][j] = c.nextInt();
				
	}
  }
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				System.out.println("soma ="+(a[i][j])+(b[i][j]));
	}
  }
 }
}