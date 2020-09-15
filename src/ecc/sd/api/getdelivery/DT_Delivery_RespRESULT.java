/**
 * DT_Delivery_RespRESULT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecc.sd.api.getdelivery;

public class DT_Delivery_RespRESULT  implements java.io.Serializable {
    private java.lang.String RETURNCODE;

    private java.lang.String RETURNMESSAGE;

    public DT_Delivery_RespRESULT() {
    }

    public DT_Delivery_RespRESULT(
           java.lang.String RETURNCODE,
           java.lang.String RETURNMESSAGE) {
           this.RETURNCODE = RETURNCODE;
           this.RETURNMESSAGE = RETURNMESSAGE;
    }


    /**
     * Gets the RETURNCODE value for this DT_Delivery_RespRESULT.
     * 
     * @return RETURNCODE
     */
    public java.lang.String getRETURNCODE() {
        return RETURNCODE;
    }


    /**
     * Sets the RETURNCODE value for this DT_Delivery_RespRESULT.
     * 
     * @param RETURNCODE
     */
    public void setRETURNCODE(java.lang.String RETURNCODE) {
        this.RETURNCODE = RETURNCODE;
    }


    /**
     * Gets the RETURNMESSAGE value for this DT_Delivery_RespRESULT.
     * 
     * @return RETURNMESSAGE
     */
    public java.lang.String getRETURNMESSAGE() {
        return RETURNMESSAGE;
    }


    /**
     * Sets the RETURNMESSAGE value for this DT_Delivery_RespRESULT.
     * 
     * @param RETURNMESSAGE
     */
    public void setRETURNMESSAGE(java.lang.String RETURNMESSAGE) {
        this.RETURNMESSAGE = RETURNMESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_Delivery_RespRESULT)) return false;
        DT_Delivery_RespRESULT other = (DT_Delivery_RespRESULT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RETURNCODE==null && other.getRETURNCODE()==null) || 
             (this.RETURNCODE!=null &&
              this.RETURNCODE.equals(other.getRETURNCODE()))) &&
            ((this.RETURNMESSAGE==null && other.getRETURNMESSAGE()==null) || 
             (this.RETURNMESSAGE!=null &&
              this.RETURNMESSAGE.equals(other.getRETURNMESSAGE())));
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
        if (getRETURNCODE() != null) {
            _hashCode += getRETURNCODE().hashCode();
        }
        if (getRETURNMESSAGE() != null) {
            _hashCode += getRETURNMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_Delivery_RespRESULT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ecc/sd/api/getdelivery", ">DT_Delivery_Resp>RESULT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURNCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETURNCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURNMESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETURNMESSAGE"));
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
