package somepackage;

import javax.faces.bean.*;

@ManagedBean
public class TestBean {
  private String someProperty = "Five Thousands";
  private static String pageB = "page-b";
  private static String index = "index";
  
  public String getSomeProperty() {
    return someProperty;
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }
  
  public String someActionControllerMethod() {
    return pageB;  // Means to go to page-b.xhtml (since condition is not mapped in faces-config.xml)
  }
  
  public String someOtherActionControllerMethod() {
    return index;  // Means to go to index.xhtml (since condition is not mapped in faces-config.xml)
  }
}
