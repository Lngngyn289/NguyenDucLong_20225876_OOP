package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
    public Book(int id, String title, String category, float cost) {
        super(id, title,category,cost);
    }


    public List<String> getAuthors() { return authors; }
    public void setAuthors(List<String> authors) { this.authors = authors; }

    
    public void addAuthor(String authorName) {
        if(authors.contains(authorName)) {
            System.out.println(authorName + "is already in the list !");
        } else {
            authors.add(authorName);
            System.out.println(authorName + "has been added");
        }
    }

    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println(authorName + "has been removed");
        } else {
            System.out.println(authorName + "is not in the list !");
        }
    }
    
    public String toString() {
        return "Book - " + this.getTitle() +
        		" - " + this.getCategory() +
        		" - " + this.getAuthors() +
        		" min: " + this.getCost() +
        		" $";
    
//    @Override
//    public String toString() {
//        StringBuilder print = new StringBuilder("Book: " +
//                " [id=" + getId() +
//                ", title='" + getTitle() + '\'' +
//                ", category='" + getCategory() + '\'' +
//                ", authors: ");
//        for(String a : authors) {
//            print.append(a);
//            print.append(" ");
//        }
//        print.append(", cost: ");
//        print.append(getCost());
//        print.append("$]");
//        return print.toString();
//    }
    }
}
