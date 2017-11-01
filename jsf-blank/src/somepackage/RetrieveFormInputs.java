package somepackage;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class RetrieveFormInputs {
	private String name;
	private String bankId;
	private String balance = "500,000 L.E";
	private static String index = "index";
	 
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		//This will be called automatically by JSF when form is submitted
		this.name = name.trim();
	}

	public String getBankId(){
		return bankId;
	}
	
	public void setbankId(String bankId){
		//This will be called automatically by JSF when form is submitted
		this.bankId = bankId.trim();
	}
	
	public String getBalance(){
		return balance;
	}
	
	public void setBalance(String balance){
		//This will be called automatically by JSF when form is submitted
		this.balance = balance.trim();
	}
	
	public String submitForm(){
		if(!isMissing(name) && !isMissing(bankId))
			return "showBankBalance";
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Empty username or bankId")); // Substitute "action" with real message.
		return null;
	}
	
	public String someActionControllerMethod() {
		    return index;  // Means to go to index.xhtml (since condition is not mapped in faces-config.xml)
	}
	
	private boolean isMissing(String value) {
		return(value == null) || (value.trim().isEmpty());
	}
}
