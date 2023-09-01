//+------------------------------------------+
//|              GeometricObject             |
//+------------------------------------------+
//| -color: String                           |
//| -filled: boolean                         |
//+------------------------------------------+
//| +GeometricObject()                       |
//| +getColor(): String                      |
//| +setColor(color: String)                 |
//| +isFilled(): boolean                     |
//| +setFilled(filled: boolean)              |
//+------------------------------------------+



public class GeometricObject {
	// declared instance variable for the color and fill properties
    private String color;
    private boolean filled;
    
    // default constructor
    public GeometricObject() {
    	// initiate default values
        color = "white";
        filled = false;
    }
    
    // getter method for color
    public String getColor() {
        return color;
    }
    
    // setter method for color
    public void setColor(String color) {
        this.color = color;
    }
    
    //getter method for fill status
    public boolean isFilled() {
        return filled;
    }
    
    // setter method for fill status
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}