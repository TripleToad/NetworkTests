import java.util.ArrayList;

public class Item {
	
	private String name = null;
	
	public final static int INCOMPLETE = 0;
	public final static int IN_PROGRESS = 1;
	public final static int COMPLETE = 2;
	
	private int status = INCOMPLETE;
	
	private ArrayList<Item> subitems = null;
	
	public Item(String name, int status) {
		this.name = name;
		this.status = status;
	}
}
