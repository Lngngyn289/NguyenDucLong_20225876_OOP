package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
	//Attributes
	public static int nbDigitalVideoDiscs = 0;
//	
	
	public DigitalVideoDisc(int nbDigitalVideoDiscs, String title, String category, float cost, int length, String director) {
		super(++nbDigitalVideoDiscs, title, category, cost, length, director);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(1,title,category,cost,length,director);
	}


//	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.length = length;
//		this.cost = cost;
//		this.id = ++nbDigitalVideoDiscs;
//	}
	
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " min: " + this.getCost() + " $";
    }
	
    
    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: non-positive length");
        }
    }
}
