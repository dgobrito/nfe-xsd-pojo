//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 11:55:54 AM BRT 
//


package com.jleber.nfeschema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Tipo Pedido de Concessão de Autorização da Nota Fiscal Eletrônica
 * 
 * <p>Java class for TEnviNFe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEnviNFe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idLote" type="{http://www.portalfiscal.inf.br/nfe}TIdLote"/&gt;
 *         &lt;element name="indSinc"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;whiteSpace value="preserve"/&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NFe" type="{http://www.portalfiscal.inf.br/nfe}TNFe" maxOccurs="50"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerNFe" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnviNFe", propOrder = {
    "idLote",
    "indSinc",
    "nFe"
})
public class TEnviNFe
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idLote;
    @XmlElement(required = true)
    protected String indSinc;
    @XmlElement(name = "NFe", required = true)
    protected List<TNFe> nFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the idLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLote() {
        return idLote;
    }

    /**
     * Sets the value of the idLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLote(String value) {
        this.idLote = value;
    }

    /**
     * Gets the value of the indSinc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndSinc() {
        return indSinc;
    }

    /**
     * Sets the value of the indSinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndSinc(String value) {
        this.indSinc = value;
    }

    /**
     * Gets the value of the nFe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nFe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNFe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNFe }
     * 
     * 
     */
    public List<TNFe> getNFe() {
        if (nFe == null) {
            nFe = new ArrayList<TNFe>();
        }
        return this.nFe;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
