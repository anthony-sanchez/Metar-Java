//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.04.24 � 04:04:42 PM CEST 
//


package fr.epsi.flickr.get_photo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="photos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                           &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="stat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "photos"
})
@XmlRootElement(name = "rsp")
public class Rsp {

    @XmlElement(required = true)
    protected Rsp.Photos photos;
    @XmlAttribute(name = "stat")
    protected String stat;

    /**
     * Obtient la valeur de la propri�t� photos.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photos }
     *     
     */
    public Rsp.Photos getPhotos() {
        return photos;
    }

    /**
     * D�finit la valeur de la propri�t� photos.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photos }
     *     
     */
    public void setPhotos(Rsp.Photos value) {
        this.photos = value;
    }

    /**
     * Obtient la valeur de la propri�t� stat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * D�finit la valeur de la propri�t� stat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                 &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photo"
    })
    public static class Photos {

        protected List<Rsp.Photos.Photo> photo;
        @XmlAttribute(name = "page")
        protected Byte page;
        @XmlAttribute(name = "pages")
        protected Byte pages;
        @XmlAttribute(name = "perpage")
        protected Byte perpage;
        @XmlAttribute(name = "total")
        protected Byte total;

        /**
         * Gets the value of the photo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photos.Photo }
         * 
         * 
         */
        public List<Rsp.Photos.Photo> getPhoto() {
            if (photo == null) {
                photo = new ArrayList<Rsp.Photos.Photo>();
            }
            return this.photo;
        }

        /**
         * Obtient la valeur de la propri�t� page.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getPage() {
            return page;
        }

        /**
         * D�finit la valeur de la propri�t� page.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setPage(Byte value) {
            this.page = value;
        }

        /**
         * Obtient la valeur de la propri�t� pages.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getPages() {
            return pages;
        }

        /**
         * D�finit la valeur de la propri�t� pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setPages(Byte value) {
            this.pages = value;
        }

        /**
         * Obtient la valeur de la propri�t� perpage.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getPerpage() {
            return perpage;
        }

        /**
         * D�finit la valeur de la propri�t� perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setPerpage(Byte value) {
            this.perpage = value;
        }

        /**
         * Obtient la valeur de la propri�t� total.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getTotal() {
            return total;
        }

        /**
         * D�finit la valeur de la propri�t� total.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setTotal(Byte value) {
            this.total = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}short" />
         *       &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Photo {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected Long id;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected Short server;
            @XmlAttribute(name = "farm")
            protected Byte farm;
            @XmlAttribute(name = "title")
            protected String title;
            @XmlAttribute(name = "ispublic")
            protected Byte ispublic;
            @XmlAttribute(name = "isfriend")
            protected Byte isfriend;
            @XmlAttribute(name = "isfamily")
            protected Byte isfamily;

            /**
             * Obtient la valeur de la propri�t� value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * D�finit la valeur de la propri�t� value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propri�t� id.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getId() {
                return id;
            }

            /**
             * D�finit la valeur de la propri�t� id.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setId(Long value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propri�t� owner.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * D�finit la valeur de la propri�t� owner.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Obtient la valeur de la propri�t� secret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * D�finit la valeur de la propri�t� secret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * Obtient la valeur de la propri�t� server.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getServer() {
                return server;
            }

            /**
             * D�finit la valeur de la propri�t� server.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setServer(Short value) {
                this.server = value;
            }

            /**
             * Obtient la valeur de la propri�t� farm.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getFarm() {
                return farm;
            }

            /**
             * D�finit la valeur de la propri�t� farm.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setFarm(Byte value) {
                this.farm = value;
            }

            /**
             * Obtient la valeur de la propri�t� title.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * D�finit la valeur de la propri�t� title.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Obtient la valeur de la propri�t� ispublic.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getIspublic() {
                return ispublic;
            }

            /**
             * D�finit la valeur de la propri�t� ispublic.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setIspublic(Byte value) {
                this.ispublic = value;
            }

            /**
             * Obtient la valeur de la propri�t� isfriend.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getIsfriend() {
                return isfriend;
            }

            /**
             * D�finit la valeur de la propri�t� isfriend.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setIsfriend(Byte value) {
                this.isfriend = value;
            }

            /**
             * Obtient la valeur de la propri�t� isfamily.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getIsfamily() {
                return isfamily;
            }

            /**
             * D�finit la valeur de la propri�t� isfamily.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setIsfamily(Byte value) {
                this.isfamily = value;
            }

        }

    }

}
