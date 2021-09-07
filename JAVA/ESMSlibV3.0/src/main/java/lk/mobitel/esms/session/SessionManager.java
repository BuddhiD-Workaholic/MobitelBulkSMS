package lk.mobitel.esms.session;

import java.util.Timer;
import java.util.TimerTask;
import lk.mobitel.esms.ws.Session;
import lk.mobitel.esms.ws.User;

/**
 *
 * @author izzathd
 */
public class SessionManager
{
	private static SessionManager sessionMgr = null;
	private Session session = null;
	private Timer timer;
	private TimerTask sessionTimer;
	
	protected SessionManager() {
		timer = new Timer();
	}
		
	public static SessionManager getInstance() {
		if(sessionMgr == null) {
			sessionMgr = new SessionManager();
		}
		
		return sessionMgr;
	}
	
	public void login(User user) {
		session = createSession(user);
		if(timer == null)
			timer = new Timer();
		sessionTimer = new SessionTimer(this);
		//timer.schedule(sessionTimer, session.getExpiryDate().toGregorianCalendar().getTime());
	}

	public Session getSession() throws NullSessionException {
		if(session == null)
			throw new NullSessionException();
		else
			return session;
	}
	
	public boolean isSession() {
		if(session == null)
			return false;
		else
			return isSession_1(session);
	}
	
	public void renewSession() {
		session = renewSession_1(session);
	//	timer.schedule(sessionTimer, session.getExpiryDate().toGregorianCalendar().getTime());
	}
	
	public void logout() {
		closeSession(session);
		session = null;
		sessionTimer.cancel();
		timer.purge();
//		System.out.println("cancelling timer task : " + sessionTimer.cancel());
//		System.out.println("No. of tasks cancelled : " + timer.purge());
	}
	
	public void exit() {
		timer.cancel();
	}

	private static void closeSession(Session session) {
		try { // Call Web Service Operation
			lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
			lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			port.closeSession(session);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		}
	}

	private static Session createSession(User user) {
		Session session = null;
		try { // Call Web Service Operation
			lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
			lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			// TODO process result here
			session = port.createSession(user);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		} finally {
			return session;
		}
	}

	private static Boolean isSession_1(Session session) {
		Boolean result = null;
		try { // Call Web Service Operation
			lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
			lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			// TODO process result here
			result = port.isSession(session);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		} finally {
			return result;
		}
	}

	private static Session renewSession_1(Session session) {
		Session result = null;
		try { // Call Web Service Operation
			lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
			lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			// TODO process result here
			result = port.renewSession(session);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		} finally {
			return result;
		}
	}
}
