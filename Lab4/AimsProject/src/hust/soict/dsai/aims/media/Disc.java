package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public float getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
	public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    
//    public void setLength(int length) {
//        this.length = length;
//    }

    public String toString() {
        return "DVD: " +
                " [id = "  + getId() +
                ", title = '" + getTitle() + '\'' +
                ", category = '" + getCategory() + '\'' +
                ", director: " + getDirector() +
                ", length = " + getLength() + ", cost= " + getCost() + "$]";
    }

}
