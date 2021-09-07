package lk.mobitel.esms.message;

import java.util.List;
import lk.mobitel.esms.ws.SentMessages;
import lk.mobitel.esms.ws.Session;
import lk.mobitel.esms.ws.SmsMessage;
import lk.mobitel.esms.ws.SmsMessageMultiLang;
import lk.mobitel.esms.ws.SmsCampaignMessage;
import lk.mobitel.esms.session.NullSessionException;
import lk.mobitel.esms.session.SessionManager;

/**
 *
 * @author izzathd
 */
public class SMSManager 
{
	
    public int sendMessage(SmsMessage message) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        int result = 0;
        
        try 
        { 
            // Call Web Service Operation
            lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
            lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.sendMessages(session, message);
        } 
        catch (Exception ex) 
        {
            // TODO handle custom exceptions here
        } 
        finally 
        {
            return result;
        }
    }

    public int sendMessagesMultiLang(SmsMessageMultiLang message) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        int result = 0;
        
        try 
        {
            // Call Web Service Operation
            lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
            lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.sendMessagesMultiLang(session, message);
        } 
        catch (Exception ex) 
        {
            // TODO handle custom exceptions here
        } 
        finally 
        {
            return result;
        }
    }
        
    public int sendCampaignMessages(SmsCampaignMessage message) throws NullSessionException 
    {
            Session session = SessionManager.getInstance().getSession();
            int result = 0;
            try 
            {       
                // Call Web Service Operation
                lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
                lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
                // TODO process result here
                result = port.sendCampaignMessages(session, message);
            } 
            catch (Exception ex) 
            {
                // TODO handle custom exceptions here
            } 
            finally 
            {
                return result;
            }
    }

    public List<SmsMessage> getMessagesFromShortcode(String shortcode) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        java.util.List<lk.mobitel.esms.ws.SmsMessage> result = null;
        
        try 
        { 
            // Call Web Service Operation
            lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
            lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.getMessagesFromShortcode(session, shortcode);
        } 
        catch (Exception ex) 
        {
            // TODO handle custom exceptions here
        } 
        finally 
        {
            return result;
        }
    }

    public List<SmsMessage> getMessagesFromLongNumber(String longNumber) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        java.util.List<lk.mobitel.esms.ws.SmsMessage> result = null;

        try 
        { 
            // Call Web Service Operation
            lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
            lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.getMessagesFromLongNumber(session, longNumber);
        } 
        catch (Exception ex) 
        {
            // TODO handle custom exceptions here
        } 
        finally 
        {
            return result;
        }
    }
	
    public List<SmsMessage> getDeliveryReports(String alias) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        java.util.List<lk.mobitel.esms.ws.SmsMessage> result = null;

        try 
        { 
            // Call Web Service Operation
            lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
            lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.getDeliveryReports(session,alias);
        } 
        catch (Exception ex) 
        {
            // TODO handle custom exceptions here
        } 
        finally 
        {
            return result;
        }
    }
          
}