package lk.mobitel.esms.test;

import lk.mobitel.esms.ws.User;

/**
 *
 * @author izzathd
 */
public class ServiceTest 
{
    public String testService(User user)
    {
        return serviceTest(user);
    }

    private static String serviceTest(User user)
    {
        String result = null;
        try 
        { 
            // Call Web Service Operation
            lk.mobitel.esms.ws.EnterpriseSMSImplService service = new lk.mobitel.esms.ws.EnterpriseSMSImplService();
            lk.mobitel.esms.ws.EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.serviceTest(user);
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
