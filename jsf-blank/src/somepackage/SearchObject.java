package somepackage;

public class SearchObject {
	private String name;
	private String baseUrl;
	
	public SearchObject(String name, String baseUrl){
		this.name = name;
		this.baseUrl = baseUrl;
	}
	
	public String getName() {
		return name;
	}

	public String makeURL(String searchString) {
		return baseUrl + searchString;
	}
	
}
