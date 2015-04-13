package helpers;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author Moi
 */
@RequestScoped
@Named
public class MyValidator {
    
    public void validateNoToto(FacesContext facesCont, UIComponent uiComp, Object value) throws ValidatorException{
        
        String s = String.valueOf(value);
        
        if (s.equals("toto")) {
            //HtmlInputText htmlTxt = (HtmlInputText) uiComp;
            //FacesMessage faceMsg = new FacesMessage(htmlTxt.getLabel() + " on prends pas les toto ! ");
            FacesMessage faceMsg = new FacesMessage(" on prends pas les toto ! ");
            
            throw new ValidatorException(faceMsg);
            
        }
        
        
        
    }
    
}
