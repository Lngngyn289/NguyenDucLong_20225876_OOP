package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();


	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public CompactDisc(int id, String title, String category, float cost, int length, String director) {
       super(id, title, category, cost, length, director);
	}
	
//	public CompactDisc(String title, String category, String director, int length, float cost) {
//		super(title, category, director, length, cost);
//	}
	
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
    
    
    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0) {
            java.util.Iterator iterator = tracks.iterator();
            Track nextTrack;
            while (iterator.hasNext()) {
            	nextTrack = (Track) iterator.next();
            	try {
            		nextTrack.play();
            	}
            	catch (PlayerException e) {
					throw e;
				}
            }
        	
        } else {
            throw new PlayerException("ERROR: non-positive length");
        }
    }
}
