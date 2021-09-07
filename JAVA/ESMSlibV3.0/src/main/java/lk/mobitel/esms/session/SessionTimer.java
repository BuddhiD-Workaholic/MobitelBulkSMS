package lk.mobitel.esms.session;

import java.util.TimerTask;

/**
 *
 * @author izzathd
 */
public class SessionTimer extends TimerTask 
{	
    private SessionManager sessionManager;

    public SessionTimer(SessionManager sessionManager) 
    {
        this.sessionManager = sessionManager;
    }

    @Override
    public void run() 
    {
        sessionManager.renewSession();
    }	
}
