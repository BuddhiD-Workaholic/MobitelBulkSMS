
package lk.mobitel.esms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://ws.esms.mobitel.lk/}session" minOccurs="0"/>
 *         &lt;element name="smsMessage" type="{http://ws.esms.mobitel.lk/}smsMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessages", propOrder = {
    "session",
    "smsMessage"
})
public class SendMessages {

    protected Session session;
    protected SmsMessage smsMessage;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the smsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SmsMessage }
     *     
     */
    public SmsMessage getSmsMessage() {
        return smsMessage;
    }

    /**
     * Sets the value of the smsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsMessage }
     *     
     */
    public void setSmsMessage(SmsMessage value) {
        this.smsMessage = value;
    }

}
