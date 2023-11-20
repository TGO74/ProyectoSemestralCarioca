# ProyectoSemestralCarioca
El proyecto consiste en desarrollar un juego de cartas Carioca en Java, aplicando conceptos de Programación Orientada a Objetos. El enfoque se centra en replicar las reglas específicas del juego, como la formación de tríos y escalas, gestión de comodines y dinámica de juego. 

Repositorio con clases listo - Tomas

Clases y Métodos del Proyecto
JuegoCarioca

Atributos:

jugadores: Lista[Jugador] - Almacena la información de los jugadores participantes en el juego.
baraja: Baraja - Representa la baraja de cartas utilizada en el juego.
Métodos:

iniciarJuego(): void - Inicia una nueva partida, estableciendo las condiciones iniciales del juego.
realizarRonda(): void - Coordina y ejecuta una ronda completa del juego, gestionando las acciones de los jugadores.
finalizarJuego(): void - Concluye el juego, determina al ganador y realiza acciones finales.
Carta

Atributos:

valor: int - Representa el valor numérico de la carta.
pinta: Pinta - Indica la pinta de la carta (corazón, diamante, trébol, espada).
Métodos:

obtenerInfoCarta(): String - Devuelve una cadena informativa sobre la carta, incluyendo valor y pinta.
Baraja

Atributos:

cartas: Lista[Carta] - Almacena todas las cartas de la baraja.
Métodos:

crearBaraja(): void - Crea una nueva baraja de cartas, siguiendo la estructura y reglas del juego.
mezclarBaraja(): void - Mezcla las cartas en la baraja para garantizar aleatoriedad.
repartirCartas(jugadores: Lista[Jugador]): void - Distribuye cartas a los jugadores al inicio del juego.
Jugador

Atributos:

mano: Mano - Representa las cartas en la mano del jugador.
puntos: int - Almacena la puntuación del jugador.
Métodos:

recogerCarta(carta: Carta): void - Permite al jugador recoger una carta del mazo o del pozo.
descartarCarta(carta: Carta): void - Facilita al jugador descartar una carta y añadirla al pozo.
realizarAccion(): void - Ejecuta una acción durante el juego, según las reglas específicas.
Mano

Atributos:

cartas: Lista[Carta] - Almacena las cartas que componen una mano de un jugador.
Métodos:

agregarCarta(carta: Carta): void - Agrega una carta a la mano del jugador.
formarTrío(): void - Implementa la lógica para formar un trío con las cartas de la mano.
formarEscala(): void - Gobierna la formación de una escala con las cartas de la mano.
Pozo

Atributos:

cartasDescartadas: Lista[Carta] - Almacena las cartas descartadas por los jugadores.
Métodos:

añadirCartaAlPozo(carta: Carta): void - Añade una carta al montón de cartas descartadas.
obtenerCartasDescartadas(): Lista[Carta] - Obtiene la lista de cartas descartadas hasta el momento.
Relaciones
Asociación JuegoCarioca y Jugador: El juego contiene jugadores, y la interacción se realiza mediante instancias de la clase Jugador.

Composición Jugador y Mano: Cada jugador tiene una mano que representa las cartas en su posesión, creándose y destruyéndose junto con el jugador.

Asociación Baraja y Carta: La baraja contiene cartas, permitiendo la manipulación de las cartas dentro de la baraja.

Estas clases y métodos constituyen la estructura esencial del juego Carioca, implementando de manera detallada la lógica del juego y siguiendo principios sólidos de Programación Orientada a Objetos.

Se entrego primer informe. 20-11

Faltan todas las interraciones entre clases. 
Falta hacer un menu
Falta tener un prototipo funcional del proyecto

recordatorio: hacer UML completo.

// 
