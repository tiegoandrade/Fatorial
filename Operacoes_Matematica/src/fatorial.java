import javax.swing.JOptionPane;

public class fatorial {

	public static void main(String[] args) {
		
		//Entrada de dados
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor que ser� fatorado: "));
		
		// Atribui��o do retorno do m�todo a uma vari�vel.
		int resposta = calcularFatorial(valor);
		System.out.println("O fatorial de " + valor + " � igual a " + resposta);
	}
		
	//in�cio do m�todo
	static int calcularFatorial(int num) {
		if (num == 0){
			return 1;
		}
	return num * calcularFatorial(num-1);
	}
}