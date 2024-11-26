package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	//Attributes
	public static int nbDigitalVideoDiscs = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	//Constructor
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	//get
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
        return id;
    }
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " min: " + cost + " $";
    }
	
	
	// Set
	public void setTitle(String titleSet) {
        title = titleSet;
    }

    public void setCategory(String categorySet) {
        category = categorySet;
    }

    public void setDirector(String directorSet) {
        director = directorSet;
    }

    public void setLength(int lengthSet) {
        length = lengthSet;
    }

    public void setCost(float costSet) {
        cost = costSet;
    }
    
}
