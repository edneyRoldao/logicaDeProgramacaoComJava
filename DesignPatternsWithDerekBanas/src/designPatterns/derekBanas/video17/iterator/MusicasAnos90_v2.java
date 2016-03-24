package designPatterns.derekBanas.video17.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class MusicasAnos90_v2 implements SongIterator{

	Hashtable<Integer, SongInformation> bestSongs = new Hashtable<>();
	
	int hashKey = 0;
	
	public MusicasAnos90_v2() {
		addSong("Loosing my Religion", "REM", 1981);
		addSong("Keep the Faith", "Bon Jovi", 1992);
		addSong("All I really want", "Alanis Morissette", 1995);
	}
	
	public void addSong(String name, String band, int yearReleased) {
		SongInformation song = new SongInformation(name, band, yearReleased);
		bestSongs.put(hashKey, song);
		hashKey++;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator createIterator() {
		return bestSongs.values().iterator();
	}
	
}
