package designPatterns.derekBanas.video17.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MusicasAnos70_v2 implements SongIterator {

	ArrayList<SongInformation> bestSongs;
	
	public MusicasAnos70_v2() {
		bestSongs = new ArrayList<>();
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I will survive", "Gloria Gaynor", 1979);
	}
	
	public void addSong(String name, String band, int yearReleased) {
		SongInformation song = new SongInformation(name, band, yearReleased);
		bestSongs.add(song);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator createIterator() {
		return bestSongs.iterator();
	}
	
	
}
