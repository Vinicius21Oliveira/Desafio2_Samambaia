package principal;

public class FlorSamambaia {
	
	public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        
		double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distanciaCentros + r2 <= r1) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }
	
	/*
	 * Método tentativaDesenhar, Parâmetros:
	 * r1, x1, y1: Definem o raio e as coordenadas do centro do círculo desenhado pelo caçador.
	 * r2, x2, y2: Definem o raio e as coordenadas do centro do círculo da flor.
	 * Cálculo da Distância: Usei a fórmula da distância euclidiana para calcular a distância entre os centros dos círculos.
	 * Verificação da Condição: Comparei a distância entre os centros somada ao raio da flor com o raio do círculo desenhado pelo caçador.
	 * Retorno: Retorna "RICO" se o círculo do caçador contém o círculo da flor, ou "MORTO" caso seja o contrário.
	 */
}
