package fatoracao;

import javax.swing.JOptionPane;

public class fatorial {

	public static void main(String[] args) {
		
		// Informa o número que será fatorado.
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Digite o valor que será fatorado: "));
		
		// Chamada do método que realizará a fatoração e atribuição em uma variável.
		// Pega uma exceção caso o usuário informe um número negativo.
		try {
			int resposta = calcularFatorial(valor);
			System.out.println("O fatorial de " + valor + " é igual a " + resposta);
		} catch (NumeroNegativoException e) {
			System.out.println(e.getMessage());
		}
	}
		
	// Método que realizará a fatoração.
	// Caso seja inserido um número negativo é lançado uma exceção.
	static int calcularFatorial(int num) throws NumeroNegativoException {
		if (num < 0) {
			throw new NumeroNegativoException ("Erro: Não é aceito um Valor negativo. "
												+ "Tente novamente!");
		}
		
		if (num == 0){
			return 1;
		}
		
		return num * calcularFatorial(num - 1); // Recursividade
	}
}