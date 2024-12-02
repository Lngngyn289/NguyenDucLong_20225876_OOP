package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.*;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    
    //Check media 
    private Media checkMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    
    public void removeMedia(String title) {
    	Media media = checkMedia(title);
        if(media != null) {
            itemsInStore.remove(media);
            System.out.println( media.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no" + title + " in the store !");
        }
    }

    public void addMedia(Media media) {
        if(checkMedia(media.getTitle()) == null) {
            itemsInStore.add(media);
            System.out.println( media.getTitle() + " 've been added to the store !");
        } else {
            System.out.println( media.getTitle() + " 'already exists in the store !");
        }

    }
    
    // Method to find media by title
    public Media findMediaByTitle(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
    
    public void printStore() {
    	for(Media item : itemsInStore) {
    		System.out.println(item.getTitle());
    	}
    }

}
