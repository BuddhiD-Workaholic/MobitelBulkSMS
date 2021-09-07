
package lk.mobitel.esms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessagesMultiLang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessagesMultiLang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://ws.esms.mobitel.lk/}session" minOccurs="0"/>
 *         &lt;element name="smsMessageMultiLang" type="{http://ws.esms.mobitel.lk/}smsMessageMultiLang" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessagesMultiLang", propOrder = {
    "session",
    "smsMessageMultiLang"
})
public class SendMessagesMultiLang {

    protected Session session;
    protected SmsMessageMultiLang smsMessageMultiLang;

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
     * Gets the value of the smsMessageMultiLang property.
     * 
     * @return
     *     possible object is
     *     {@link SmsMessageMultiLang }
     *     
     */
    public SmsMessageMultiLang getSmsMessageMultiLang() {
        return smsMessageMultiLang;
    }

    /**
     * Sets the value of the smsMessageMultiLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsMessageMultiLang }
     *     
     */
    public void setSmsMessageMultiLang(SmsMessageMultiLang value) {
        this.smsMessageMultiLang = value;
    }

}
