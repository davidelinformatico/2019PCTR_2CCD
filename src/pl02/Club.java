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
	
	/**
	 * El proceso de reserva gestiona la entrega de material al jugador,
	 * solo un jugador a la vez es atendido (excl. mutua).
	 * 
	 * Si no hay suficientes pelotas o palos, el jugador ha de esperar.
	 * 
	 * @param pelotas
	 * @param palos
	 */
	public synchronized void reservar(int pelotas, int palos) {
		while (pelotasDisponibles<pelotas || palosDisponibles<palos) {
			// hacemos esperar al proceso hasta que haya material
			try {
				System.out.println("No hay material: " + this);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		pelotasDisponibles -= pelotas;
		palosDisponibles -= palos;
	}
	
	
	/**
	 * La devolución de material también debe realizarse de modo que un
	 * único jugador entre en el método.
	 * Como la devolución puede hacerse siempre, independientemente de la
	 * cantidad de material que haya, no se produce ninguna espera.
	 * @param pelotas
	 * @param palos
	 */
	public synchronized void devolver(int pelotas, int palos) {
		pelotasDisponibles += pelotas;
		palosDisponibles += palos;
		notifyAll();
	}

	@Override
	public String toString() {
		return "Club [pelotasDisponibles=" + pelotasDisponibles + ", palosDisponibles=" + palosDisponibles + "]";
	}
	
	
	
}
