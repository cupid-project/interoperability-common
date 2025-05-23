//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.19 at 12:20:19 PM CET 
//


package ieee.std._2030_5.ns;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Agreement between the customer and the service supplier to pay for service at a specific service location. It records certain billing information about the type of service provided at the service location and is used during charge creation to determine the type of service.
 * 
 * <p>Java class for CustomerAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ieee:std:2030.5:ns}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveBillingPeriodListLink" type="{urn:ieee:std:2030.5:ns}ActiveBillingPeriodListLink" minOccurs="0"/&gt;
 *         &lt;element name="ActiveProjectionReadingListLink" type="{urn:ieee:std:2030.5:ns}ActiveProjectionReadingListLink" minOccurs="0"/&gt;
 *         &lt;element name="ActiveTargetReadingListLink" type="{urn:ieee:std:2030.5:ns}ActiveTargetReadingListLink" minOccurs="0"/&gt;
 *         &lt;element name="BillingPeriodListLink" type="{urn:ieee:std:2030.5:ns}BillingPeriodListLink" minOccurs="0"/&gt;
 *         &lt;element name="HistoricalReadingListLink" type="{urn:ieee:std:2030.5:ns}HistoricalReadingListLink" minOccurs="0"/&gt;
 *         &lt;element name="PrepaymentLink" type="{urn:ieee:std:2030.5:ns}PrepaymentLink" minOccurs="0"/&gt;
 *         &lt;element name="ProjectionReadingListLink" type="{urn:ieee:std:2030.5:ns}ProjectionReadingListLink" minOccurs="0"/&gt;
 *         &lt;element name="serviceAccount" type="{urn:ieee:std:2030.5:ns}String42" minOccurs="0"/&gt;
 *         &lt;element name="serviceLocation" type="{urn:ieee:std:2030.5:ns}String42" minOccurs="0"/&gt;
 *         &lt;element name="TargetReadingListLink" type="{urn:ieee:std:2030.5:ns}TargetReadingListLink" minOccurs="0"/&gt;
 *         &lt;element name="TariffProfileLink" type="{urn:ieee:std:2030.5:ns}TariffProfileLink" minOccurs="0"/&gt;
 *         &lt;element name="UsagePointLink" type="{urn:ieee:std:2030.5:ns}UsagePointLink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAgreement", propOrder = {
    "activeBillingPeriodListLink",
    "activeProjectionReadingListLink",
    "activeTargetReadingListLink",
    "billingPeriodListLink",
    "historicalReadingListLink",
    "prepaymentLink",
    "projectionReadingListLink",
    "serviceAccount",
    "serviceLocation",
    "targetReadingListLink",
    "tariffProfileLink",
    "usagePointLink"
})
public class CustomerAgreement
    extends IdentifiedObject
{

    @XmlElement(name = "ActiveBillingPeriodListLink")
    protected ActiveBillingPeriodListLink activeBillingPeriodListLink;
    @XmlElement(name = "ActiveProjectionReadingListLink")
    protected ActiveProjectionReadingListLink activeProjectionReadingListLink;
    @XmlElement(name = "ActiveTargetReadingListLink")
    protected ActiveTargetReadingListLink activeTargetReadingListLink;
    @XmlElement(name = "BillingPeriodListLink")
    protected BillingPeriodListLink billingPeriodListLink;
    @XmlElement(name = "HistoricalReadingListLink")
    protected HistoricalReadingListLink historicalReadingListLink;
    @XmlElement(name = "PrepaymentLink")
    protected PrepaymentLink prepaymentLink;
    @XmlElement(name = "ProjectionReadingListLink")
    protected ProjectionReadingListLink projectionReadingListLink;
    protected String serviceAccount;
    protected String serviceLocation;
    @XmlElement(name = "TargetReadingListLink")
    protected TargetReadingListLink targetReadingListLink;
    @XmlElement(name = "TariffProfileLink")
    protected TariffProfileLink tariffProfileLink;
    @XmlElement(name = "UsagePointLink")
    protected UsagePointLink usagePointLink;

    /**
     * Gets the value of the activeBillingPeriodListLink property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveBillingPeriodListLink }
     *     
     */
    public ActiveBillingPeriodListLink getActiveBillingPeriodListLink() {
        return activeBillingPeriodListLink;
    }

    /**
     * Sets the value of the activeBillingPeriodListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveBillingPeriodListLink }
     *     
     */
    public void setActiveBillingPeriodListLink(ActiveBillingPeriodListLink value) {
        this.activeBillingPeriodListLink = value;
    }

    /**
     * Gets the value of the activeProjectionReadingListLink property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveProjectionReadingListLink }
     *     
     */
    public ActiveProjectionReadingListLink getActiveProjectionReadingListLink() {
        return activeProjectionReadingListLink;
    }

    /**
     * Sets the value of the activeProjectionReadingListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveProjectionReadingListLink }
     *     
     */
    public void setActiveProjectionReadingListLink(ActiveProjectionReadingListLink value) {
        this.activeProjectionReadingListLink = value;
    }

    /**
     * Gets the value of the activeTargetReadingListLink property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveTargetReadingListLink }
     *     
     */
    public ActiveTargetReadingListLink getActiveTargetReadingListLink() {
        return activeTargetReadingListLink;
    }

    /**
     * Sets the value of the activeTargetReadingListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveTargetReadingListLink }
     *     
     */
    public void setActiveTargetReadingListLink(ActiveTargetReadingListLink value) {
        this.activeTargetReadingListLink = value;
    }

    /**
     * Gets the value of the billingPeriodListLink property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPeriodListLink }
     *     
     */
    public BillingPeriodListLink getBillingPeriodListLink() {
        return billingPeriodListLink;
    }

    /**
     * Sets the value of the billingPeriodListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPeriodListLink }
     *     
     */
    public void setBillingPeriodListLink(BillingPeriodListLink value) {
        this.billingPeriodListLink = value;
    }

    /**
     * Gets the value of the historicalReadingListLink property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalReadingListLink }
     *     
     */
    public HistoricalReadingListLink getHistoricalReadingListLink() {
        return historicalReadingListLink;
    }

    /**
     * Sets the value of the historicalReadingListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalReadingListLink }
     *     
     */
    public void setHistoricalReadingListLink(HistoricalReadingListLink value) {
        this.historicalReadingListLink = value;
    }

    /**
     * Gets the value of the prepaymentLink property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaymentLink }
     *     
     */
    public PrepaymentLink getPrepaymentLink() {
        return prepaymentLink;
    }

    /**
     * Sets the value of the prepaymentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaymentLink }
     *     
     */
    public void setPrepaymentLink(PrepaymentLink value) {
        this.prepaymentLink = value;
    }

    /**
     * Gets the value of the projectionReadingListLink property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectionReadingListLink }
     *     
     */
    public ProjectionReadingListLink getProjectionReadingListLink() {
        return projectionReadingListLink;
    }

    /**
     * Sets the value of the projectionReadingListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectionReadingListLink }
     *     
     */
    public void setProjectionReadingListLink(ProjectionReadingListLink value) {
        this.projectionReadingListLink = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccount(String value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Sets the value of the serviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocation(String value) {
        this.serviceLocation = value;
    }

    /**
     * Gets the value of the targetReadingListLink property.
     * 
     * @return
     *     possible object is
     *     {@link TargetReadingListLink }
     *     
     */
    public TargetReadingListLink getTargetReadingListLink() {
        return targetReadingListLink;
    }

    /**
     * Sets the value of the targetReadingListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetReadingListLink }
     *     
     */
    public void setTargetReadingListLink(TargetReadingListLink value) {
        this.targetReadingListLink = value;
    }

    /**
     * Gets the value of the tariffProfileLink property.
     * 
     * @return
     *     possible object is
     *     {@link TariffProfileLink }
     *     
     */
    public TariffProfileLink getTariffProfileLink() {
        return tariffProfileLink;
    }

    /**
     * Sets the value of the tariffProfileLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffProfileLink }
     *     
     */
    public void setTariffProfileLink(TariffProfileLink value) {
        this.tariffProfileLink = value;
    }

    /**
     * Gets the value of the usagePointLink property.
     * 
     * @return
     *     possible object is
     *     {@link UsagePointLink }
     *     
     */
    public UsagePointLink getUsagePointLink() {
        return usagePointLink;
    }

    /**
     * Sets the value of the usagePointLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsagePointLink }
     *     
     */
    public void setUsagePointLink(UsagePointLink value) {
        this.usagePointLink = value;
    }

}
