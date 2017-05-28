
public class Calc {
	PilhaEncadeada pilha = new PilhaEncadeada();
	
	void calculadora(String dado) {
		String[] list = new String[dado.length()];
		list = dado.split(" ");
		double a,b;
		
		for (String x : list) {
			switch (x) {
			case "+":
				a = Double.parseDouble(pilha.pop());
				b = Double.parseDouble(pilha.pop());
				pilha.push(String.valueOf(b+a));
				break;
			case "-":
				a = Double.parseDouble(pilha.pop());
				b = Double.parseDouble(pilha.pop());
				pilha.push(String.valueOf(b-a));
				break;
			case "*":
				a = Double.parseDouble(pilha.pop());
				b = Double.parseDouble(pilha.pop());
				pilha.push(String.valueOf(b*a));
				break;
			case "/":
				a = Double.parseDouble(pilha.pop());
				b = Double.parseDouble(pilha.pop());
				pilha.push(String.valueOf(b/a));
				break;
			default:
				pilha.push(x);
				break;
			}
		}
		pilha.print();
	}
}
