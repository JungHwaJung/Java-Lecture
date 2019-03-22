package sec03;

public class SongLyrics extends Song{
	String lyrics;
	
	
	
	public SongLyrics(String title, String artist, String album, String composer, int year, int track, String lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics = lyrics;
	}	
	
	@Override
	public void show() {
		super.show();
		System.out.println("Lyrics : " + lyrics);
	}

}
