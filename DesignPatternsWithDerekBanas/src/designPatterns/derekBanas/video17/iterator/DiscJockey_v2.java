package designPatterns.derekBanas.video17.iterator;

import java.util.Iterator;

/**
 * Esta classe serve para explicar porque usar o Pattern Iterator.
 * Veja que nessa classe tivemos que duplicar o c�digo para fazer o mesmo tipo de itera��o pois cada cole��o de musica � de um tipo diferente.
 * Array simple, hashTable e ArrayList
 * 
 * @author EdneyRoldao
 *
 */
@SuppressWarnings("rawtypes")
public class DiscJockey_v2 {

	SongIterator iter70;
	SongIterator iter80;
	SongIterator iter90;
	
	public DiscJockey_v2(SongIterator iter70, SongIterator iter80, SongIterator iter90) {
		this.iter70 = iter70;
		this.iter80 = iter80;
		this.iter90 = iter90;
	}
	
	// este metodo apresenta codigo duplicado. Isso nao e uma boa pratica
	public void showTheSongs() {
		Iterator songs70 = iter70.createIterator();
		Iterator songs80 = iter80.createIterator();
		Iterator songs90 = iter90.createIterator();
		
		System.out.println("Songs of 70s \n");
		printTheSongs(songs70);

		System.out.println("Songs of 80s \n");
		printTheSongs(songs80);

		System.out.println("Songs of 90s \n");
		printTheSongs(songs90);

	}

	// Aqui est� a vantagem do Pattern iterator. Temos apenas 1 m�todo
	private void printTheSongs(Iterator iterator) {
		while(iterator.hasNext()) {
			
			SongInformation bestSong = (SongInformation) iterator.next();
			
			System.out.println(bestSong.getBandName());
			System.out.println(bestSong.getSongName());
			System.out.println(bestSong.getYearReleased());
		}
	}
	
}
