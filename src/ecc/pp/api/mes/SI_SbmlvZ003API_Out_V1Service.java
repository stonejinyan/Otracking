/**
 * SI_SbmlvZ003API_Out_V1Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecc.pp.api.mes;

public interface SI_SbmlvZ003API_Out_V1Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTPS_PortAddress();

    public ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTP_PortAddress();

    public ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
