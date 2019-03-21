package sec02;

public class Song {
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println("Title : " + this.title);
		System.out.println("Artist : " + this.artist);
		System.out.println("Album : " + this.album);
		System.out.println("Composer : " + this.composer);
		System.out.println("Year : " + this.year);
		System.out.println("Track : " + this.track);
	}
}
