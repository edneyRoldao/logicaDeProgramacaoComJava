package designPatterns.derekBanas.video17.iterator;

import java.util.ArrayList;

public class MusicasAnos70 {

	ArrayList<SongInformation> bestSongs;
	
	public MusicasAnos70() {
		bestSongs = new ArrayList<>();
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I will survive", "Gloria Gaynor", 1979);
	}
	
	public void addSong(String name, String band, int yearReleased) {
		SongInformation song = new SongInformation(name, band, yearReleased);
		bestSongs.add(song);
	}
	
	public ArrayList<SongInformation> getBestSongs() {
		return bestSongs;
	}
	
}
