package somepackage;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Color1 {
	private String colour1;
	private String colour2;
	private String colour3;
	private String colour4;
	private List<String> colours = Arrays.asList("red", "green", "orange", "yellow");
	private List<String> ids = Arrays.asList("1", "2", "3", "4");
	private static String displayColourPage = "displayColourPage";
	private static String index = "index";
	
	public List<String> getColours(){
		return colours;
	}
	
	public List<String> getIds(){
		return ids;
	}
	
	public String getColour1(){
		return colour1;
	}
	
	public void setColour1(String colour1){
		this.colour1 = colour1;
	}
	
	public String getColour2(){
		return colour2;
	}
	
	public void setColour2(String colour2){
		this.colour2 = colour2;
	}
	
	public String getColour3(){
		return colour3;
	}
	
	public void setColour3(String colour3){
		this.colour3 = colour3;
	}
	
	public String getColour4(){
		return colour4;
	}
	
	public void setColour4(String colour4){
		this.colour4 = colour4;
	}
	
	public String showColors(){
		return displayColourPage;
	}
	
	public String someActionControllerMethod(){
		return index;
	}
}
