/**
 * 
 */
package pl02;

/**
 * @author David
 *
 */
public class Club {

	/**
	 * Pelotas disponibles para reservas.
	 */
	private int pelotasDisponibles;
	
	/**
	 * Palos disponibles para reservas.
	 */
	private int palosDisponibles;

	/**
	 * Constructor principal.
	 * @param pelotasDisponibles
	 * @param palosDisponibles
	 */
	public Club(int pelotasDisponibles, int palosDisponibles) {
		super();
		this.pelotasDisponibles = pelotasDisponibles;
		this.palosDisponibles = palosDisponibles;
	}
	
	
	public void reservar(int pelotas, int palos) {
		pelotasDisponibles -= pelotas;
		palosDisponibles -= palos;
	}
	
	
	public void devolver(int pelotas, int palos) {
		pelotasDisponibles += pelotas;
		palosDisponibles += palos;
		
	}
	
	
}
