
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public float totalCost() {
        float sum = 0.00f;
        for(Media item : itemsOrdered) {
        	sum += item.getCost();
        }
        return sum;
    }
	
	public void addMedia(Media item){
    	if (itemsOrdered.contains(item)){
    		System.out.println("Item has already been added");
    	}
    	else {
			itemsOrdered.add(item);
		}
    }
	
    public void removeMedia(String title) {
        Media toRemove = findMediaByTitle(title);
        if (toRemove != null) {
            itemsOrdered.remove(toRemove);
            System.out.println("Removed " + title + " from cart.");
        } else {
            System.out.println("Media not found in cart.");
        }
    }
    public Media findMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
    
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Items in cart");
        for (Media item : itemsOrdered) {
            System.out.println(item);
        }
    }
    
    public void placeOrder() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Cart is empty. Cannot place order.");
        } else {
            System.out.println("Order placed successfully!");
            itemsOrdered.clear();
        }
    }
    
    public void filterCart(Scanner scanner) {
        System.out.println("Filter by: 1. ID 2. Title");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.println("Enter ID to filter:");
            int id = scanner.nextInt();
            scanner.nextLine();
            for (Media media : itemsOrdered) {
                if (media.getId() == id) {
                    System.out.println(media);
                }
            }
        } else if (choice == 2) {
            System.out.println("Enter Title to filter:");
            String title = scanner.nextLine();
            for (Media media : itemsOrdered) {
                if (media.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(media);
                }
            }
        } else {
            System.out.println("Invalid filter option.");
        }
    }
    
    public void sortCart(Scanner sc) {
        System.out.println("Sort by: ----1.Title OR  2.Cost----");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (choice == 1) {
            itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
        } else if (choice == 2) {
            itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
        } else {
            System.out.println("Invalid sort option.");
            return;
        }
        System.out.println("Cart sorted successfully!");
    }
    
    

    // Method to search DVDs by ID and print the result
//    public void searchById(int id) {
//        boolean found = false;
//        for (DigitalVideoDisc dvd : itemsOrdered) {
//            if (dvd.getId() == id) {
//                System.out.println("Found DVD: " + dvd.toString());
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("No DVD found with ID: " + id);
//        }
//    }

//    public void searchByTitle(String title) {
//        for(int i = 0;i < qtyOrdered; i++) {
//            if(itemsOrdered[i].getTitle().equals(title)) {
//                System.out.println("Result: " +  "[" + itemsOrdered[i].getTitle() +
//                        "] - [" + itemsOrdered[i].getCategory() + "] - ["
//                        + itemsOrdered[i].getDirector() + "] - ["
//                        + itemsOrdered[i].getLength() + "]: " +itemsOrdered[i].getCost() + " $\n");
//                return;
//            }
//        }
//        System.out.println("No match found !");
//    }
}

