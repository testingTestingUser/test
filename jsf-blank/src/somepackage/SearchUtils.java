package somepackage;

import java.util.ArrayList;
import java.util.List;


public class SearchUtils {
	private static SearchObject[] searchObject = {new SearchObject("Google", "https://www.google.com/#q="),
            	new SearchObject("Yahoo", "https://search.yahoo.com/search;?p=")};
	private static List<String> searchEngineNames;
	
	 static { 
		searchEngineNames = new ArrayList<>();
		for(SearchObject searchElement: searchObject)
			searchEngineNames.add(searchElement.getName());
	}
	
	public static List<String> searchEngineNames() {
		    return searchEngineNames;
	}
	
	public static String makeURL(String searchEngine, String word){
		String searchUrl = null;
		for(SearchObject sOb :  searchObject){
			if(sOb.getName().equalsIgnoreCase(searchEngine)){
				searchUrl = sOb.makeURL(word);
				break;
			}
		}
		return searchUrl;
	}
	
	private SearchUtils(){
		//empty
	}
}
