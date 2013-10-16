/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.icefaces.application.PushRenderer;

/**
 *
 * @author Elin
 */
@Named("pushBean")
@RequestScoped
public class PushBB {
    
    @Inject
    private MessageManager messageManager;
    private static final String PUSH_GROUP = "colorPage";
    private String sessionId;
    
     @PostConstruct
    public void postConstruct(){
        PushRenderer.addCurrentSession(PUSH_GROUP);
        FacesContext fcontext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fcontext.getExternalContext().getSession(false);
        sessionId = session.getId();
    }
     
     public void setMessageBean(MessageManager messageManager) {
        this.messageManager = messageManager;
    }
     
    public String push() {
        PushRenderer.render(PUSH_GROUP);
        return null;
    }
    
}
