package designPatterns.derekBanas.video17.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Esta classe serve para explicar porque usar o Pattern Iterator.
 * Veja que nessa classe tivemos que duplicar o código para fazer o mesmo tipo de iteração pois cada coleção de musica é de um tipo diferente.
 * Array simple, hashTable e ArrayList
 * 
 * @author EdneyRoldao
 *
 */
public class DiscJockey {

	MusicasAnos70 musicasAnos70;
	MusicasAnos80 musicasAnos80;
	MusicasAnos90 musicasAnos90;
	
	public DiscJockey(MusicasAnos70 musicasAnos70, MusicasAnos80 musicasAnos80, MusicasAnos90 musicasAnos90) {
		this.musicasAnos70 = musicasAnos70;
		this.musicasAnos80 = musicasAnos80;
		this.musicasAnos90 = musicasAnos90;
	}
	
	// este metodo apresenta codigo duplicado. Isso nao e uma boa pratica
	public void showTheSongs() {

		//ArrayList
		@SuppressWarnings("rawtypes")
		ArrayList al70sSongs = musicasAnos70.getBestSongs();
		System.out.println("Songs of the 70s\n");
		for(int i = 0; i < al70sSongs.size();i++) {
			SongInformation bestSong = (SongInformation) al70sSongs.get(i);
			System.out.println(bestSong.getBandName());
			System.out.println(bestSong.getSongName());
			System.out.println(bestSong.getYearReleased());
		}

		System.out.println();
		System.out.println();
		
		//Array
		SongInformation[] array80sSongs = musicasAnos80.getBestSongs();
		System.out.println("Songs of the 80s\n");
		for(int i = 0; i < array80sSongs.length;i++) {
			SongInformation bestSong = array80sSongs[i];
			System.out.println(bestSong.getBandName());
			System.out.println(bestSong.getSongName());
			System.out.println(bestSong.getYearReleased());
		}
		
		System.out.println();
		System.out.println();
		
		//HashTable
		Hashtable<Integer, SongInformation> ht90sSongs = musicasAnos90.getBestSongs();
		System.out.println("Songs of the 90s\n");

		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
			SongInformation bestSong = ht90sSongs.get(e.nextElement());
			System.out.println(bestSong.getBandName());
			System.out.println(bestSong.getSongName());
			System.out.println(bestSong.getYearReleased());
		}
		
	}
	
}
