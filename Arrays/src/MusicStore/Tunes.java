package MusicStore;


// Example of array storage

public class Tunes {

	public static void main(String[] args) {
		
		CDCollection music = new CDCollection();
		music.addCD("Storm Front","Billy Joel",14.85,10);
		music.addCD("Come On Over", "Shania Twain", 14.95, 16);
		music.addCD("Soundtrack","Les Miserables", 13.90, 11);
		music.addCD("Graceland", "Paul Simon", 13.90, 11);
		
		System.out.println(music);
		
		music.addCD("Double Live", "Garth Brooks", 19.99, 26);
		music.addCD("Greatest Hits", "Jimmy Buffet", 15.95, 13);
		
		System.out.println(music);

	}

}
