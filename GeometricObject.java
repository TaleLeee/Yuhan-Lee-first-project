// import java.util.Date;
public class GeometricObject{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject(){
		dateCreated = new java.util.Date();
		System.out.println("G is created");
	}
	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}

	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}

	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	public String toString(){
		return "created on" + getDateCreated() + "\ncolor" + color + 
		"and filled " + filled;
	}
}