package somepackage;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

@ManagedBean
public class SearchController {
	private String word;
	private String searchEngineName;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word.trim();
	}
	public String getSearchEngineName() {
		return searchEngineName;
	}
	public void setSearchEngineName(String searchEngineName){
		this.searchEngineName = searchEngineName;
	}
	
	public List<String> getSearchEngineNames() {
		return SearchUtils.searchEngineNames();
	}
	
	
	public String doSearch() throws IOException{
		 if (word.isEmpty()) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Empty word entry")); // Substitute "action" with real message.
				return null;
		    }
		    word = URLEncoder.encode(word, "utf-8");
		    String searchURL =
		      SearchUtils.makeURL(searchEngineName, word);
		    if (searchURL != null) {
		      ExternalContext context =
		        FacesContext.getCurrentInstance().getExternalContext();
		      HttpServletResponse response =
		        (HttpServletResponse)context.getResponse();
		      response.sendRedirect(searchURL);
		      return null;
		    } else {
		    	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Unknown search engine")); // Substitute "action" with real message.
					return null;
		    } 
		  }
}
