package ejercicio2;

import java.util.ArrayList; //Importa el método ArrayList de la librería util de java

public class DeckCards {

	public static void main(String[] args) {

		// Definición de 2 arrays de Strings con los valores posibles definidos 
		// para los palos(suits) y los valores númericos(values) 
		
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		//Definicion de un ArrayList llamado deck(baraja) 
		
		ArrayList<Card> deck = new ArrayList<Card>();

		//Bucles que genera la baraja completa
		
		//Bucle que impone el palo(suits) del que se van a generar las cartas 
		
		for (int i = 0; i < suits.length; i++) {
			
			//Bucle que genera todos los valores(values) de carta posibles para el palo(suits)
			//que le impone el bucle anterior
			
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]); //Genera el objeto carta con los valores de los indices i y j
				deck.add(card); // Añade la carta generada al ArrayList de baraja(Deck)
			}
		}

		//Bucle que se encarga de "barajar" la baraja creada anteriormente
		
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i); //Crea el int j y genera un indice aleatorio dentro de los limites de la cantidad de cartas de la baraja
			Card tmp = deck.get(i); //Crea un objeto carta temporal para almacenar la carta en la posicion de la baraja igual a i
			deck.set(i, deck.get(j)); //Cambia la carta de la baraja en posicion i por la carta de la baraja en posicion j
			deck.set(j, tmp); //Cambia la carta en posicion j por la carta almacenada en la carta temporal
		}

		//Bucle que muestra las 5 primeras cartas de la baraja
		
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
