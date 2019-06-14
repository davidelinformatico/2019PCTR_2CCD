
package pl02;

/**
 * @author David
 *
 */
public class Simulador {
	
	private static final int NUM_EXPERTOS = 7;
	private static final int NUM_NOVATOS = 7;
	private static final int NUM_PELOTAS = 20;
	private static final int NUM_PALOS = 20;
	private static final int NUM_VUELTAS = 5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Club club = new Club(NUM_PELOTAS, NUM_PALOS);
		Jugador[] expertos = new Jugador[NUM_EXPERTOS];
		Jugador[] novatos = new Jugador[NUM_NOVATOS];
		
		for (int i=0; i<NUM_EXPERTOS; i++) {
			// asignamos ids a partir de 100 a los novatos
			novatos[i] = new Jugador(1 + i, false, NUM_VUELTAS, club);
			novatos[i].start();

			// asignamos ids a partir del 200 a los expertos
			expertos[i] = new Jugador(8 + i, true, NUM_VUELTAS, club);
			expertos[i].start();
		}
		
	}

}
