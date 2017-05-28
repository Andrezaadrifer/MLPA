
public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto("arroz",1,2.50,3.00,50);
		Produto p2 = new Produto("cuscuz",2,1.50,2.00,70);
		Produto p3 = new Produto("feijão",1,2.50,3.00,80);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
