package week06CodingProject;

public class Card {
	
	 private int value; // value from 2 to 14 (2 to Ace)
	    private String name; // e.g., "Ace of Diamonds"

	    // Constructor
	    public Card(int value, String name) {
	        this.value = value;
	        this.name = name;
	    }

	    // Getter and Setter for value
	    public int getValue() {
	        return value;
	    }

	    public void setValue(int value) {
	        this.value = value;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Describe method
	    public void describe() {
	        System.out.println(name + " (Value: " + value + ")");
	    }

}
