package AimsPackage;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc " + disc.getTitle() + " has been added");
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
}
