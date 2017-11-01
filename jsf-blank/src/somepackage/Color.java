package somepackage;

public class Color {
	//Comment
	private final String colorName;
	private final String colorValue;

	  public Color(String colorName, String colorValue) {
	    this.colorName = colorName;
	    this.colorValue = colorValue;
	  }

	  public String getColorName() {
	    return colorName;
	  }

	  public String getColorValue() {
	    return colorValue;
	  }
}
