
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered;
	
	//Hàm thêm đĩa DVD vào giỏ hàng
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more díc");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " have been added!");
            return 1;
        }
    }
    //Hàm thêm đĩa DVD vào giỏ hàng voi dau vao la 1 mang
    // public int addDigitalVideoDisc(DigitalVideoDisc[] dvdArray) {
    //     int addCount = 0;
    //     for(DigitalVideoDisc disc : dvdArray){
    //         if(qtyOrdered == MAX_NUMBERS_ORDERED){
    //             System.out.println("The Cart is almost full. Can't add more discs");
    //             break;
    //         }else{
    //             itemsOrdered[qtyOrdered] = disc;
    //             qtyOrdered++;
    //             System.out.println("The DVD" + '\"' + disc.getTitle() + '\"' + "has been added!");
    //             addCount++;
    //         }
    //     }
    //     return addCount;
    // }


    // Ham them dia vào gio hang theo List voi so luong tuy y
    public int addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
        int addCount = 0;
        for (DigitalVideoDisc disc : dvdArray) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full. Can't add more discs");
                break;
            } else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
                addCount++;
            }
        }
        return addCount;
    }
    //Ham them 2 dia DVD
    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more discs");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + dvd1.getTitle() + '\"' + " has been added!");

            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + dvd2.getTitle() + '\"' + " has been added!");

            return 2; //Tra ve so dia DVD da them duoc
        }
    }

	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(itemsOrdered[0] == null) {
			System.out.println("Your cart is empty!");
			return;
		}
		for(int i =0; i < qtyOrdered;i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(;i<qtyOrdered-1;i++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD " + '\"'+ disc.getTitle() + '\"' + " successfully!");
                return;
            }
        }
        System.out.println("No DVD match!");
        return;
	}
	
    public float totalCost() {
        float sum = 0.00f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.println((i + 1) + ". " + dvd.toString());
            totalCost += dvd.getCost();
        }

        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    // Method to search DVDs by ID and print the result
    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                System.out.println("Found DVD: " + dvd.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        for(int i = 0;i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + itemsOrdered[i].getTitle() +
                        "] - [" + itemsOrdered[i].getCategory() + "] - ["
                        + itemsOrdered[i].getDirector() + "] - ["
                        + itemsOrdered[i].getLength() + "]: " +itemsOrdered[i].getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found !");
    }
}

