
package org.smpte_ra.schemas.st2067_2_2016;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UUIDType"/>
 *         &lt;element name="TrackId" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UUIDType"/>
 *         &lt;element name="ResourceList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Resource" type="{http://www.smpte-ra.org/schemas/2067-3/2016}BaseResourceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceType", namespace = "http://www.smpte-ra.org/schemas/2067-3/2016", propOrder = {
    "id",
    "trackId",
    "resourceList"
})
@XmlSeeAlso({
    CDPSequence.class
})
public class SequenceType {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(name = "TrackId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String trackId;
    @XmlElement(name = "ResourceList", required = true)
    protected SequenceType.ResourceList resourceList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the trackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackId(String value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the resourceList property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType.ResourceList }
     *     
     */
    public SequenceType.ResourceList getResourceList() {
        return resourceList;
    }

    /**
     * Sets the value of the resourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType.ResourceList }
     *     
     */
    public void setResourceList(SequenceType.ResourceList value) {
        this.resourceList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Resource" type="{http://www.smpte-ra.org/schemas/2067-3/2016}BaseResourceType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resource"
    })
    public static class ResourceList {

        @XmlElement(name = "Resource", namespace = "http://www.smpte-ra.org/schemas/2067-3/2016", required = true)
        protected List<BaseResourceType> resource;

        /**
         * Gets the value of the resource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseResourceType }
         * 
         * 
         */
        public List<BaseResourceType> getResource() {
            if (resource == null) {
                resource = new ArrayList<BaseResourceType>();
            }
            return this.resource;
        }

    }

}
