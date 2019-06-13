/**
 * 
 */
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
	}

}
