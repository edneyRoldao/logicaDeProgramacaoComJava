package designPatterns.derekBanas.video17.iterator;

public class SongInformation {

	private String songName;
	private String bandName;
	private int yearReleased;

	public SongInformation(String songName, String bandName, int yearReleased) {
		super();
		this.songName = songName;
		this.bandName = bandName;
		this.yearReleased = yearReleased;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

}
