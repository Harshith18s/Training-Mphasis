package test;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class GreatUser extends TagSupport{

	private static final long serialVersionUID=1;
    public int doStartTag() {
    	JspWriter out=null;
    	try {
    		out=pageContext.getOut();
    		out.println("Welcome");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return SKIP_BODY;
    }

}
