/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.icefaces.application.PushRenderer;

/**
 * Pushes chatusers to a group, updates for everyone in the same group 
 * @author Grupp 17
 */
@Named("pushBean")
@RequestScoped
public class PushBB {
    
    private static final String PUSH_GROUP = "chatPage";
    @Inject
    private StatusManager statusManager;
    
    /**
     * Pushes a user to a group
     */
    @PostConstruct
    public void postConstruct(){
        PushRenderer.addCurrentSession(PUSH_GROUP);
    }
    /**
     * Updates changes to the group
     * @return navigation strings, null- stay on teh same page
     */
    public String push() {
        PushRenderer.render(PUSH_GROUP);
        return null;
    }
    /**
     * Pushes user to a group if login succeded
     * Makes it possible to see the first message in chat
     * @return navigation strings
     */
    public String logInPush() {
        String stat = statusManager.login();
        if(stat.equals("LOGIN_SUCCESS")){
            PushRenderer.render(PUSH_GROUP);
        }
        return stat;
    }
    
}
