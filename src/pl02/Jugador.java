package pl02;

public class Jugador extends Thread {

	/**
	 * Identificador del jugador
	 */
	private int id;
	
	/**
	 * Si el jugador es expert o no.
	 */
	private boolean experto;
	
	/**
	 * Número de vueltas que hace el jugador en el club.
	 */
	int numVueltas;
	
	/**
	 * Referencia al objeto Club donde juega el jugador.
	 */
	Club elClub;

	public Jugador(int id, boolean experto, int numVueltas, Club elClub) {
		super();
		this.id = id;
		this.experto = experto;
		this.numVueltas = numVueltas;
		this.elClub = elClub;
	}

	@Override
	public void run() {
		super.run();
		
		// vueltas
	}
	
	
}
