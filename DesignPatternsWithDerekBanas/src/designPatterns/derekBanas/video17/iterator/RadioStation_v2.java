package designPatterns.derekBanas.video17.iterator;

public class RadioStation_v2 {

	public static void main(String[] args) {
		
		MusicasAnos70_v2 songs70 = new MusicasAnos70_v2();
		MusicasAnos80_v2 songs80 = new MusicasAnos80_v2();
		MusicasAnos90_v2 songs90 = new MusicasAnos90_v2();
		
		DiscJockey_v2 chris = new DiscJockey_v2(songs70, songs80, songs90);
		
		chris.showTheSongs();
		
	}

}
