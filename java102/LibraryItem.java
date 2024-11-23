package java102;

public class LibraryItem {
    public final String title;
    public final String itemId;
    
    protected static boolean isCheckedOut = false;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

	public boolean available() {
		return !isCheckedOut;
	}

    public void checkOut() {
        isCheckedOut = true;
    }

    public static void returnItem() {
        isCheckedOut = false;
    }
    @Override
    public String toString() {
        return "Item " + title + " Item Id " + itemId;
    }
}