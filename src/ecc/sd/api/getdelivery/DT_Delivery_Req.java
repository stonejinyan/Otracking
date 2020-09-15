/**
 * DT_Delivery_Req.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecc.sd.api.getdelivery;

public class DT_Delivery_Req  implements java.io.Serializable {
    /* Consumer System */
    private java.lang.String APPLICATIONNAME;

    /* Message GUID */
    private java.lang.String messageID;

    /* Project Def. */
    private java.lang.String PSPID;

    /* WBS */
    private java.lang.String POSID;

    /* Sales order number */
    private java.lang.String VGBEL;

    /* Delivery number */
    private java.lang.String VBELN;

    /* Item number */
    private java.lang.String VGPOS;

    /* Search Flag: P-Prj,W-WBS,S-SO,D-DN */
    private java.lang.String FLAG;

    public DT_Delivery_Req() {
    }

    public DT_Delivery_Req(
           java.lang.String APPLICATIONNAME,
           java.lang.String messageID,
           java.lang.String PSPID,
           java.lang.String POSID,
           java.lang.String VGBEL,
           java.lang.String VBELN,
           java.lang.String VGPOS,
           java.lang.String FLAG) {
           this.APPLICATIONNAME = APPLICATIONNAME;
           this.messageID = messageID;
           this.PSPID = PSPID;
           this.POSID = POSID;
           this.VGBEL = VGBEL;
           this.VBELN = VBELN;
           this.VGPOS = VGPOS;
           this.FLAG = FLAG;
    }


    /**
     * Gets the APPLICATIONNAME value for this DT_Delivery_Req.
     * 
     * @return APPLICATIONNAME   * Consumer System
     */
    public java.lang.String getAPPLICATIONNAME() {
        return APPLICATIONNAME;
    }


    /**
     * Sets the APPLICATIONNAME value for this DT_Delivery_Req.
     * 
     * @param APPLICATIONNAME   * Consumer System
     */
    public void setAPPLICATIONNAME(java.lang.String APPLICATIONNAME) {
        this.APPLICATIONNAME = APPLICATIONNAME;
    }


    /**
     * Gets the messageID value for this DT_Delivery_Req.
     * 
     * @return messageID   * Message GUID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this DT_Delivery_Req.
     * 
     * @param messageID   * Message GUID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the PSPID value for this DT_Delivery_Req.
     * 
     * @return PSPID   * Project Def.
     */
    public java.lang.String getPSPID() {
        return PSPID;
    }


    /**
     * Sets the PSPID value for this DT_Delivery_Req.
     * 
     * @param PSPID   * Project Def.
     */
    public void setPSPID(java.lang.String PSPID) {
        this.PSPID = PSPID;
    }


    /**
     * Gets the POSID value for this DT_Delivery_Req.
     * 
     * @return POSID   * WBS
     */
    public java.lang.String getPOSID() {
        return POSID;
    }


    /**
     * Sets the POSID value for this DT_Delivery_Req.
     * 
     * @param POSID   * WBS
     */
    public void setPOSID(java.lang.String POSID) {
        this.POSID = POSID;
    }


    /**
     * Gets the VGBEL value for this DT_Delivery_Req.
     * 
     * @return VGBEL   * Sales order number
     */
    public java.lang.String getVGBEL() {
        return VGBEL;
    }


    /**
     * Sets the VGBEL value for this DT_Delivery_Req.
     * 
     * @param VGBEL   * Sales order number
     */
    public void setVGBEL(java.lang.String VGBEL) {
        this.VGBEL = VGBEL;
    }


    /**
     * Gets the VBELN value for this DT_Delivery_Req.
     * 
     * @return VBELN   * Delivery number
     */
    public java.lang.String getVBELN() {
        return VBELN;
    }


    /**
     * Sets the VBELN value for this DT_Delivery_Req.
     * 
     * @param VBELN   * Delivery number
     */
    public void setVBELN(java.lang.String VBELN) {
        this.VBELN = VBELN;
    }


    /**
     * Gets the VGPOS value for this DT_Delivery_Req.
     * 
     * @return VGPOS   * Item number
     */
    public java.lang.String getVGPOS() {
        return VGPOS;
    }


    /**
     * Sets the VGPOS value for this DT_Delivery_Req.
     * 
     * @param VGPOS   * Item number
     */
    public void setVGPOS(java.lang.String VGPOS) {
        this.VGPOS = VGPOS;
    }


    /**
     * Gets the FLAG value for this DT_Delivery_Req.
     * 
     * @return FLAG   * Search Flag: P-Prj,W-WBS,S-SO,D-DN
     */
    public java.lang.String getFLAG() {
        return FLAG;
    }


    /**
     * Sets the FLAG value for this DT_Delivery_Req.
     * 
     * @param FLAG   * Search Flag: P-Prj,W-WBS,S-SO,D-DN
     */
    public void setFLAG(java.lang.String FLAG) {
        this.FLAG = FLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_Delivery_Req)) return false;
        DT_Delivery_Req other = (DT_Delivery_Req) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.APPLICATIONNAME==null && other.getAPPLICATIONNAME()==null) || 
             (this.APPLICATIONNAME!=null &&
              this.APPLICATIONNAME.equals(other.getAPPLICATIONNAME()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.PSPID==null && other.getPSPID()==null) || 
             (this.PSPID!=null &&
              this.PSPID.equals(other.getPSPID()))) &&
            ((this.POSID==null && other.getPOSID()==null) || 
             (this.POSID!=null &&
              this.POSID.equals(other.getPOSID()))) &&
            ((this.VGBEL==null && other.getVGBEL()==null) || 
             (this.VGBEL!=null &&
              this.VGBEL.equals(other.getVGBEL()))) &&
            ((this.VBELN==null && other.getVBELN()==null) || 
             (this.VBELN!=null &&
              this.VBELN.equals(other.getVBELN()))) &&
            ((this.VGPOS==null && other.getVGPOS()==null) || 
             (this.VGPOS!=null &&
              this.VGPOS.equals(other.getVGPOS()))) &&
            ((this.FLAG==null && other.getFLAG()==null) || 
             (this.FLAG!=null &&
              this.FLAG.equals(other.getFLAG())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAPPLICATIONNAME() != null) {
            _hashCode += getAPPLICATIONNAME().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getPSPID() != null) {
            _hashCode += getPSPID().hashCode();
        }
        if (getPOSID() != null) {
            _hashCode += getPOSID().hashCode();
        }
        if (getVGBEL() != null) {
            _hashCode += getVGBEL().hashCode();
        }
        if (getVBELN() != null) {
            _hashCode += getVBELN().hashCode();
        }
        if (getVGPOS() != null) {
            _hashCode += getVGPOS().hashCode();
        }
        if (getFLAG() != null) {
            _hashCode += getFLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_Delivery_Req.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ecc/sd/api/getdelivery", "DT_Delivery_Req"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APPLICATIONNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "APPLICATIONNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSPID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PSPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VGBEL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VGBEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VBELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VBELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VGPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VGPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
