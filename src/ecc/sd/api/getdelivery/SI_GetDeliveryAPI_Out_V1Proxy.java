package ecc.sd.api.getdelivery;

public class SI_GetDeliveryAPI_Out_V1Proxy implements ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1 {
  private String _endpoint = null;
  private ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1 sI_GetDeliveryAPI_Out_V1 = null;
  
  public SI_GetDeliveryAPI_Out_V1Proxy() {
    _initSI_GetDeliveryAPI_Out_V1Proxy();
  }
  
  public SI_GetDeliveryAPI_Out_V1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_GetDeliveryAPI_Out_V1Proxy();
  }
  
  private void _initSI_GetDeliveryAPI_Out_V1Proxy() {
    try {
      sI_GetDeliveryAPI_Out_V1 = (new ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1ServiceLocator()).getHTTPS_Port();
      if (sI_GetDeliveryAPI_Out_V1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_GetDeliveryAPI_Out_V1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_GetDeliveryAPI_Out_V1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_GetDeliveryAPI_Out_V1 != null)
      ((javax.xml.rpc.Stub)sI_GetDeliveryAPI_Out_V1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1 getSI_GetDeliveryAPI_Out_V1() {
    if (sI_GetDeliveryAPI_Out_V1 == null)
      _initSI_GetDeliveryAPI_Out_V1Proxy();
    return sI_GetDeliveryAPI_Out_V1;
  }
  
  public ecc.sd.api.getdelivery.DT_Delivery_Resp getDelivery(ecc.sd.api.getdelivery.DT_Delivery_Req MT_Delivery_Req) throws java.rmi.RemoteException{
    if (sI_GetDeliveryAPI_Out_V1 == null)
      _initSI_GetDeliveryAPI_Out_V1Proxy();
    return sI_GetDeliveryAPI_Out_V1.getDelivery(MT_Delivery_Req);
  }
  
  
}