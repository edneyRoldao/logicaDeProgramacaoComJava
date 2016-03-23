package designPatterns.derekBanas.video17.iterator;

import java.util.Hashtable;

public class MusicasAnos90 {

	Hashtable<Integer, SongInformation> bestSongs = new Hashtable<>();
	
	int hashKey = 0;
	
	public MusicasAnos90() {
		addSong("Loosing my Religion", "REM", 1981);
		addSong("Keep the Faith", "Bon Jovi", 1992);
		addSong("All I really want", "Alanis Morissette", 1995);
	}
	
	public void addSong(String name, String band, int yearReleased) {
		SongInformation song = new SongInformation(name, band, yearReleased);
		bestSongs.put(hashKey, song);
		hashKey++;
	}
	
	public Hashtable<Integer, SongInformation> getBestSongs() {
		return bestSongs;
	}
	
}
