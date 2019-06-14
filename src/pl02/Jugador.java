package pl02;

/**
 * @author David
 *
 */

import java.util.concurrent.ThreadLocalRandom;

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
	
	private int pelotas = 0;
	
	private int palos = 0;

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
		for (int vuelta = 0; vuelta < numVueltas; vuelta++) {
			System.out.println(this.toString() + " Reservando pelotas y palos.");
			
			if (experto) {
				pelotas = 1;
				palos = ThreadLocalRandom.current().nextInt(2, 6);
			} else {
				pelotas = ThreadLocalRandom.current().nextInt(1, 6);
				palos = 2;
			}
			
			elClub.reservar(pelotas, palos);
			
			System.out.println(this.toString() + " Jugando al golf.");
			int tiempoDeJuego = ThreadLocalRandom.current().nextInt(100, 1000);
			try {
				Thread.sleep(tiempoDeJuego);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(this.toString() + " Devolviendo pelotas y palos.");

			elClub.devolver(pelotas, palos);
			pelotas = 0;
			palos = 0;
			
			System.out.println(this.toString() + " Descansando.");
			int tiempoDeDescanso = ThreadLocalRandom.current().nextInt(100, 1000);
			try {
				Thread.sleep(tiempoDeDescanso);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		//System.out.println(elClub);

	}

	@Override
	public String toString() {
		char exp = experto? '+' : '-';
		return "Jugador " + id + exp + "["+pelotas+","+palos+"]";
	}
	
	
	
	
	
}
