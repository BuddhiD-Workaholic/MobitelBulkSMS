
package lk.mobitel.esms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMessagesFromLongNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMessagesFromLongNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://ws.esms.mobitel.lk/}session" minOccurs="0"/>
 *         &lt;element name="longNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessagesFromLongNumber", propOrder = {
    "session",
    "longNumber"
})
public class GetMessagesFromLongNumber {

    protected Session session;
    protected String longNumber;

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
     * Gets the value of the longNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongNumber() {
        return longNumber;
    }

    /**
     * Sets the value of the longNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongNumber(String value) {
        this.longNumber = value;
    }

}
