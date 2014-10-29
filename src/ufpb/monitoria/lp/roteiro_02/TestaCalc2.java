/**
 * 
 */
package ufpb.monitoria.lp.roteiro_02;

import javax.swing.JOptionPane;

/**
 * @author joaohelis
 *
 */

/*
 * 
 * 	4. Declare uma outra classe chamada TestaCalc2, com um método main semelhante ao do item 3, só que sem usar argumentos passados pela linha de comando para o programa. Neste novo programa, os 3 números devem ser pedidos ao usuário. Isso pode ser feito abrindo janelas do JOptionPane e convertendo o texto lido para String. Exemplo:

  	String num1String = JOptionPane.showInputDialog("Digite um número");
  	int num1 = Integer.parseInt(num1String);

	ou 
     
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

	A classe JOptionPane é uma classe da biblioteca Java que se encontra no pacote javax.swing. Para poder utilizar essa classe em seu programa, você precisa incluir a seguinte linha no início de sua classe:

	import javax.swing.JOptionPane;

	Depois de ler os 3 números, o programa deverá mostrar o menor deles, obtido chamando CalculadoraGenerica.calculaMenorNumero, através de uma janela do JOptionPane também. Para isso, utilize o comando:

	JOptionPane.showMessageDialog(null, "O menor número é:"+num);  
	
	5. Execute seu programa java passando os números e veja se está sendo mostrado o menor número dentre os 3 ao final da execução do programa.
 */

public class TestaCalc2 {
	
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")),
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")),
			num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		int menorNumero = CalculadoraGenerica.calculaMenorNumero(num1, num2, num3);
		
		JOptionPane.showMessageDialog(null, "O menor número é:"+menorNumero);
	}

}
