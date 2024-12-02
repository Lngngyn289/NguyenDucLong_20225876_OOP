package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
//	public CompactDisc(int id, String title, String category, float cost,String artist, ArrayList<Track> tracks) {
//        super(id, title, category, cost);
//        this.tracks = tracks;
//	    this.artist = artist;
//        this.setLength(getLength());
//	}

	public CompactDisc(int id, String title, String category, float cost, int length, String director) {
       super(id, title, category, cost, length, director);
	}
	
	public String getArtist() {
		return artist;
	}
	
    public void addTrack(Track song) {
        if(tracks.contains(song)) {
            System.out.println(song.getTitle() + "is already in the CD");
        } else {
            tracks.add(song);
        }
    }

    public void removeTrack(Track song) {
        if(tracks.contains(song)) {
            tracks.remove(song);
        } else {
            System.out.println(song.getTitle() + "is not in the CD");
        }
    }
    
    @Override
    public float getLength() {
        float sum = 0;
        for(Track song : tracks) {
            sum += song.getLength();
        }
        return sum;
    }
    
    
    public void play() {
        for(Track song : tracks) {
            song.play();
        }
    }
    
}
