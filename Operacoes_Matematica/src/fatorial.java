import javax.swing.JOptionPane;

public class fatorial {

	public static void main(String[] args) {
		
		//Entrada de dados
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor que será fatorado: "));
		
		// Atribuição do retorno do método a uma variável.
		int resposta = calcularFatorial(valor);
		System.out.println("O fatorial de " + valor + " é igual a " + resposta);
	}
		
	//início do método
	static int calcularFatorial(int num) {
		if (num == 0){
			return 1;
		}
	return num * calcularFatorial(num-1);
	}
}