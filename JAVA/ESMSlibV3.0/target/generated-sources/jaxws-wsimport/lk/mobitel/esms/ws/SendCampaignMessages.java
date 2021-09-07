
package lk.mobitel.esms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendCampaignMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendCampaignMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://ws.esms.mobitel.lk/}session" minOccurs="0"/>
 *         &lt;element name="smsCampaignMessage" type="{http://ws.esms.mobitel.lk/}smsCampaignMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendCampaignMessages", propOrder = {
    "session",
    "smsCampaignMessage"
})
public class SendCampaignMessages {

    protected Session session;
    protected SmsCampaignMessage smsCampaignMessage;

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
     * Gets the value of the smsCampaignMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SmsCampaignMessage }
     *     
     */
    public SmsCampaignMessage getSmsCampaignMessage() {
        return smsCampaignMessage;
    }

    /**
     * Sets the value of the smsCampaignMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsCampaignMessage }
     *     
     */
    public void setSmsCampaignMessage(SmsCampaignMessage value) {
        this.smsCampaignMessage = value;
    }

}
