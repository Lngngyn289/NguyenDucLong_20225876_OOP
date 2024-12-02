package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private float length;
	private String director;
	
	public float getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
	public Disc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    
    public void setLength(float length) {
        this.length = length;
    }

    public String toString() {
        return "DVD: " +
                " [id = "  + getId() +
                ", title = '" + getTitle() + '\'' +
                ", category = '" + getCategory() + '\'' +
                ", director: " + getDirector() +
                ", length = " + getLength() + ", cost= " + getCost() + "$]";
    }

}
