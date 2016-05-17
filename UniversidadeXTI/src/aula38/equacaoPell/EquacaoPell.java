package aula38.equacaoPell;

/**
 * 
 * @author edney.souza
 *
 *         - Equacao de Pell e uma forma de calcular o resultado Absoluto da
 *         raiz quadrada simplesmente subtraindo os numeros impares. - Pode ser
 *         visto na aula 038 - universidade XTI - Link do video:
 *         https://www.youtube.com/watch?v=5BuT460Ney8&index=38&list=
 *         PLxQNfKs8YwvGhXHbHtxtoB-tRRv6r3Rlr
 *
 */
public class EquacaoPell {

	public static void main(String[] args) {
		equacaoPellSemRecursao(16);
		System.out.println(equacaoPellComRecursao(1, 16));
	}

	public static void equacaoPellSemRecursao(int valor) {

		int entrada = valor;
		int impar = 1;
		int raizQuadrada = 0;

		while (valor >= impar) {

			System.out.println("valor de impar: " + impar);

			valor = valor - impar;
			impar += 2;
			raizQuadrada = raizQuadrada + 1;

		}

		System.out.println("----------");
		System.out.println("valor absoluto da raiz quadrada de " + entrada + " e = (" + raizQuadrada + ")");
		System.out.println("----------");

	}

	public static int equacaoPellComRecursao(int impar, int valor) {
		if (valor <= 1) {
			return 0;
		} else {
			return 1 + equacaoPellComRecursao(impar + 2, valor - impar);
		}
	}

}
