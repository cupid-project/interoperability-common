//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.19 at 12:20:19 PM CET 
//


package ieee.std._2030_5.ns;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Event that can indicate time ranges over which the start time and duration SHALL be randomized.
 * 
 * <p>Java class for RandomizableEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RandomizableEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ieee:std:2030.5:ns}Event"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="randomizeDuration" type="{urn:ieee:std:2030.5:ns}OneHourRangeType" minOccurs="0"/&gt;
 *         &lt;element name="randomizeStart" type="{urn:ieee:std:2030.5:ns}OneHourRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RandomizableEvent", propOrder = {
    "randomizeDuration",
    "randomizeStart"
})
@XmlSeeAlso({
    EndDeviceControl.class,
    TimeTariffInterval.class,
    DERControl.class
})
public class RandomizableEvent
    extends Event
{

    protected OneHourRangeType randomizeDuration;
    protected OneHourRangeType randomizeStart;

    /**
     * Gets the value of the randomizeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link OneHourRangeType }
     *     
     */
    public OneHourRangeType getRandomizeDuration() {
        return randomizeDuration;
    }

    /**
     * Sets the value of the randomizeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneHourRangeType }
     *     
     */
    public void setRandomizeDuration(OneHourRangeType value) {
        this.randomizeDuration = value;
    }

    /**
     * Gets the value of the randomizeStart property.
     * 
     * @return
     *     possible object is
     *     {@link OneHourRangeType }
     *     
     */
    public OneHourRangeType getRandomizeStart() {
        return randomizeStart;
    }

    /**
     * Sets the value of the randomizeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneHourRangeType }
     *     
     */
    public void setRandomizeStart(OneHourRangeType value) {
        this.randomizeStart = value;
    }

}
