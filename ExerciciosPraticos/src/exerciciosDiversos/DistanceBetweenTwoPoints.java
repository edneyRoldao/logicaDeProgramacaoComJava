package exerciciosDiversos;

/**
 * 
 * @author edneyroldao
 *
 *This exercises were got from this page: 
 *	http://www.inf.pucrs.br/~pinho/LaproI/Exercicios/SeqDecisao/lista1.htm
 *
 */
public class DistanceBetweenTwoPoints {
	
	public static void main(String[] args) {
		calcularDistancia(25, 35, 45, 55);
	}
	
	/**
	 * Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e P(x2,y2), 
	 * escreva a distancia entre eles
	 * @param x1
	 * @param x2
	 * @param y1
	 * @param y2
	 * @return
	 */
	public static void calcularDistancia(double x1, double x2, double y1, double y2) {
		//return Math.sqrt((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2))));
		System.out.println("Calculo pelo objeto Math: " + Math.sqrt((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)))));
		System.out.println("Calculo feito na não, equacao de pell: " + calcularRaizEquacaoPell((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)))));
	}
	
	public static double calcularRaizEquacaoPell(double valor) {
		int impar = 1;
		double raiz = 0;
		while(valor >= impar) {
			valor -= impar;
			impar += 2;
			raiz++;
		}
		return raiz;
	}

}
