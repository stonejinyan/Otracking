/**
 * DT_Delivery_Resp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecc.sd.api.getdelivery;

public class DT_Delivery_Resp  implements java.io.Serializable {
    private ecc.sd.api.getdelivery.DT_Delivery_RespDeliverylist[] deliverylist;

    private ecc.sd.api.getdelivery.DT_Delivery_RespRESULT RESULT;

    public DT_Delivery_Resp() {
    }

    public DT_Delivery_Resp(
           ecc.sd.api.getdelivery.DT_Delivery_RespDeliverylist[] deliverylist,
           ecc.sd.api.getdelivery.DT_Delivery_RespRESULT RESULT) {
           this.deliverylist = deliverylist;
           this.RESULT = RESULT;
    }


    /**
     * Gets the deliverylist value for this DT_Delivery_Resp.
     * 
     * @return deliverylist
     */
    public ecc.sd.api.getdelivery.DT_Delivery_RespDeliverylist[] getDeliverylist() {
        return deliverylist;
    }


    /**
     * Sets the deliverylist value for this DT_Delivery_Resp.
     * 
     * @param deliverylist
     */
    public void setDeliverylist(ecc.sd.api.getdelivery.DT_Delivery_RespDeliverylist[] deliverylist) {
        this.deliverylist = deliverylist;
    }

    public ecc.sd.api.getdelivery.DT_Delivery_RespDeliverylist getDeliverylist(int i) {
        return this.deliverylist[i];
    }

    public void setDeliverylist(int i, ecc.sd.api.getdelivery.DT_Delivery_RespDeliverylist _value) {
        this.deliverylist[i] = _value;
    }


    /**
     * Gets the RESULT value for this DT_Delivery_Resp.
     * 
     * @return RESULT
     */
    public ecc.sd.api.getdelivery.DT_Delivery_RespRESULT getRESULT() {
        return RESULT;
    }


    /**
     * Sets the RESULT value for this DT_Delivery_Resp.
     * 
     * @param RESULT
     */
    public void setRESULT(ecc.sd.api.getdelivery.DT_Delivery_RespRESULT RESULT) {
        this.RESULT = RESULT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_Delivery_Resp)) return false;
        DT_Delivery_Resp other = (DT_Delivery_Resp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliverylist==null && other.getDeliverylist()==null) || 
             (this.deliverylist!=null &&
              java.util.Arrays.equals(this.deliverylist, other.getDeliverylist()))) &&
            ((this.RESULT==null && other.getRESULT()==null) || 
             (this.RESULT!=null &&
              this.RESULT.equals(other.getRESULT())));
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
        if (getDeliverylist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliverylist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliverylist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRESULT() != null) {
            _hashCode += getRESULT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_Delivery_Resp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ecc/sd/api/getdelivery", "DT_Delivery_Resp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverylist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deliverylist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ecc/sd/api/getdelivery", ">DT_Delivery_Resp>Deliverylist"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ecc/sd/api/getdelivery", ">DT_Delivery_Resp>RESULT"));
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
