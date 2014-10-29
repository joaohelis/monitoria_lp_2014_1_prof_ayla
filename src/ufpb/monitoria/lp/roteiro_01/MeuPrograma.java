/**
 * 
 */
package ufpb.monitoria.lp.roteiro_01;

/**
 * @author João Helis Bernardo
 *
 */

public class MeuPrograma {

	public static void main(String [] args){

		double preco = 20;
        double valorAPagar = calculaDesconto(preco);
		imprime(valorAPagar);

    } //fim do main


	public static double calculaDesconto(double p) {

		double valorDesconto;
        if (p>=100) {
        	valorDesconto =50;
        } else {
            valorDesconto =20;
        }
        return p - (valorDesconto*p)/100;
    }


	public static void imprime(double valor){
		System.out.println(valor);
    }

} //fim da classe