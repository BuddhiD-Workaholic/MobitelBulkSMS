package lk.mobitel.esms.session;

/**
 *
 * @author izzathd
 */
public class NullSessionException extends Exception 
{
    public NullSessionException() 
    {
        super("The session has not been created.");
    }
}
