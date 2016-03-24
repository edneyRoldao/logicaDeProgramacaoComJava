package designPatterns.derekBanas.video17.iterator;

public class RadioStation {

	public static void main(String[] args) {
		
		MusicasAnos70 songs70 = new MusicasAnos70();
		MusicasAnos80 songs80 = new MusicasAnos80();
		MusicasAnos90 songs90 = new MusicasAnos90();
		
		DiscJockey chris = new DiscJockey(songs70, songs80, songs90);
		
		chris.showTheSongs();
		
	}

}
