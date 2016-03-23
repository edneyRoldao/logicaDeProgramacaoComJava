package designPatterns.derekBanas.video17.iterator;

public class MusicasAnos80 {

	SongInformation[] bestSongs;
	
	int arrayValue = 0;
	
	public MusicasAnos80() {
		
		bestSongs = new SongInformation[3];
		
		addSong("Enjoy the Silence", "Depeche Mode", 1989);
		addSong("Head Over heels", "Tears for Fears", 1985);
		addSong("Roam", "852s", 1989);
	}
	
	public void addSong(String name, String band, int yearReleased) {
		SongInformation song = new SongInformation(name, band, yearReleased);
		bestSongs[arrayValue] = song;
		arrayValue++;
	}
	
	public SongInformation[] getBestSongs() {
		return bestSongs;
	}
	
}
