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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Indicates current consumption status and ability to shed load.
 * 
 * <p>Java class for LoadShedAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadShedAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ieee:std:2030.5:ns}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availabilityDuration" type="{urn:ieee:std:2030.5:ns}UInt32" minOccurs="0"/&gt;
 *         &lt;element name="DemandResponseProgramLink" type="{urn:ieee:std:2030.5:ns}DemandResponseProgramLink" minOccurs="0"/&gt;
 *         &lt;element name="sheddablePercent" type="{urn:ieee:std:2030.5:ns}PerCent" minOccurs="0"/&gt;
 *         &lt;element name="sheddablePower" type="{urn:ieee:std:2030.5:ns}ActivePower" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadShedAvailability", propOrder = {
    "availabilityDuration",
    "demandResponseProgramLink",
    "sheddablePercent",
    "sheddablePower"
})
public class LoadShedAvailability
    extends Resource
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long availabilityDuration;
    @XmlElement(name = "DemandResponseProgramLink")
    protected DemandResponseProgramLink demandResponseProgramLink;
    protected PerCent sheddablePercent;
    protected ActivePower sheddablePower;

    /**
     * Gets the value of the availabilityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailabilityDuration() {
        return availabilityDuration;
    }

    /**
     * Sets the value of the availabilityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailabilityDuration(Long value) {
        this.availabilityDuration = value;
    }

    /**
     * Gets the value of the demandResponseProgramLink property.
     * 
     * @return
     *     possible object is
     *     {@link DemandResponseProgramLink }
     *     
     */
    public DemandResponseProgramLink getDemandResponseProgramLink() {
        return demandResponseProgramLink;
    }

    /**
     * Sets the value of the demandResponseProgramLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandResponseProgramLink }
     *     
     */
    public void setDemandResponseProgramLink(DemandResponseProgramLink value) {
        this.demandResponseProgramLink = value;
    }

    /**
     * Gets the value of the sheddablePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PerCent }
     *     
     */
    public PerCent getSheddablePercent() {
        return sheddablePercent;
    }

    /**
     * Sets the value of the sheddablePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCent }
     *     
     */
    public void setSheddablePercent(PerCent value) {
        this.sheddablePercent = value;
    }

    /**
     * Gets the value of the sheddablePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getSheddablePower() {
        return sheddablePower;
    }

    /**
     * Sets the value of the sheddablePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setSheddablePower(ActivePower value) {
        this.sheddablePower = value;
    }

}
