# 2019PCTR_2CCD

Este proyecto da respuesta a la práctica de la segunda convocatoria de la Universidad de Burgos, año 2019.

## Objetivos

Se prende crear un jar ejecutable que incluya diferentes hilos con variables aleatorias.

Además:
 - Se reflexiona sobre las ejecuciones no deterministas,
 - Se utilizan mecanismos de sincronización, garantizando la exclusión mutua.
 - Se evitan estados inconsistentes mediante mecanismos de preservación de invariantes de los objetos compartidos en concurrencia.
 - Se aplica la concurrencia sobre el cumplimiento de dependencia de estados.
 - Se sincronizan las respuestas de los hilos, evitando problemas de dependencias de estado.
 
## Enunciado

- Tenemos un club de golf con material limitado : 20 pelotas y 20 palos.

- En el club, hay dos tipos de jugadores, en un total de 14:
	- Novatos(signo'-' y valores 1-7): Solicitan 1-5 pelotas y 2 palos
	- Expertos(sigo'+' y valores 8-14): Solicitan 1 pelota y 2-5 palos
	
- Cada jugador muestra sus acciones:
	- Al realizar la reserva, muestra mensaje mostrando su identidad y los recursos solicitados.
	· Muestra mensaje cuando obtiene el material y 'juega al golf'.
	· Devuelve el material, mostrando que material devuelve.
	· Descansa.
 
 * El proyecto debe incluir, al menos, 10 commits o revisiones de código comentando los objetivos.
 
 **No obstante, tengo comentadas salidas comentadas para comprobar cuando se queda sin material (y por tanto, hace esperar a los procesos) y el material de que dispone el club.
 
## Entrega

La entrega, se compone de un proyecto y tres clases (Simulador, Club y Jugador). El main es parte de Simulador.

Subiendo a la plataforma:
- Nombre del proyecto público en GitHub.
- Distribución ejecutable en un fichero. 



