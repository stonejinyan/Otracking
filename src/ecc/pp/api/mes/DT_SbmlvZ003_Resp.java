/**
 * DT_SbmlvZ003_Resp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecc.pp.api.mes;

public class DT_SbmlvZ003_Resp  implements java.io.Serializable {
    private ecc.pp.api.mes.DT_SbmlvZ003_RespReturnMsg returnMsg;

    public DT_SbmlvZ003_Resp() {
    }

    public DT_SbmlvZ003_Resp(
           ecc.pp.api.mes.DT_SbmlvZ003_RespReturnMsg returnMsg) {
           this.returnMsg = returnMsg;
    }


    /**
     * Gets the returnMsg value for this DT_SbmlvZ003_Resp.
     * 
     * @return returnMsg
     */
    public ecc.pp.api.mes.DT_SbmlvZ003_RespReturnMsg getReturnMsg() {
        return returnMsg;
    }


    /**
     * Sets the returnMsg value for this DT_SbmlvZ003_Resp.
     * 
     * @param returnMsg
     */
    public void setReturnMsg(ecc.pp.api.mes.DT_SbmlvZ003_RespReturnMsg returnMsg) {
        this.returnMsg = returnMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_SbmlvZ003_Resp)) return false;
        DT_SbmlvZ003_Resp other = (DT_SbmlvZ003_Resp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnMsg==null && other.getReturnMsg()==null) || 
             (this.returnMsg!=null &&
              this.returnMsg.equals(other.getReturnMsg())));
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
        if (getReturnMsg() != null) {
            _hashCode += getReturnMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_SbmlvZ003_Resp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ecc/pp/api/mes", "DT_SbmlvZ003_Resp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReturnMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ecc/pp/api/mes", ">DT_SbmlvZ003_Resp>ReturnMsg"));
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
