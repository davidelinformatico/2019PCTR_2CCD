package pl02;

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
			System.out.println("Jugador " + id + "["+pelotas+","+palos+"] Reservando pelotas y palos.");
			
			if (experto) {
				elClub.reservar(2, 5);
				pelotas += 2;
				palos += 5;
			} else {
				elClub.reservar(5,  2);
				pelotas += 5;
				palos += 2;
			}
			
			System.out.println("Jugador " + id + "["+pelotas+","+palos+"] Jugando al golf.");
			int tiempoDeJuego = 100 + ThreadLocalRandom.current().nextInt(900);
			try {
				Thread.sleep(tiempoDeJuego);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Jugador " + id + "["+pelotas+","+palos+"] Devolviendo pelotas y palos.");
			
			pelotas = 0;
			palos = 0;
			elClub.devolver(pelotas, palos);
			System.out.println("Jugador " + id + "["+pelotas+","+palos+"] Descansando.");

		}
	}
	
	
}
