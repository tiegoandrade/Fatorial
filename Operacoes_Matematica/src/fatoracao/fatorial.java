package fatoracao;

import javax.swing.JOptionPane;

public class fatorial {

	public static void main(String[] args) {
		
		// Informa o n�mero que ser� fatorado.
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Digite o valor que ser� fatorado: "));
		
		// Chamada do m�todo que realizar� a fatora��o e atribui��o em uma vari�vel.
		// Pega uma exce��o caso o usu�rio informe um n�mero negativo.
		try {
			int resposta = calcularFatorial(valor);
			System.out.println("O fatorial de " + valor + " � igual a " + resposta);
		} catch (NumeroNegativoException e) {
			System.out.println(e.getMessage());
		}
	}
		
	// M�todo que realizar� a fatora��o.
	// Caso seja inserido um n�mero negativo � lan�ado uma exce��o.
	static int calcularFatorial(int num) throws NumeroNegativoException {
		if (num < 0) {
			throw new NumeroNegativoException ("Erro: N�o � aceito um Valor negativo. "
												+ "Tente novamente!");
		}
		
		if (num == 0){
			return 1;
		}
		
		return num * calcularFatorial(num - 1); // Recursividade
	}
}