package ecc.pp.api.mes;

public class SI_SbmlvZ003API_Out_V1Proxy implements ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 {
  private String _endpoint = null;
  private ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 sI_SbmlvZ003API_Out_V1 = null;
  
  public SI_SbmlvZ003API_Out_V1Proxy() {
    _initSI_SbmlvZ003API_Out_V1Proxy();
  }
  
  public SI_SbmlvZ003API_Out_V1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_SbmlvZ003API_Out_V1Proxy();
  }
  
  private void _initSI_SbmlvZ003API_Out_V1Proxy() {
    try {
      sI_SbmlvZ003API_Out_V1 = (new ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1ServiceLocator()).getHTTPS_Port();
      if (sI_SbmlvZ003API_Out_V1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_SbmlvZ003API_Out_V1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_SbmlvZ003API_Out_V1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_SbmlvZ003API_Out_V1 != null)
      ((javax.xml.rpc.Stub)sI_SbmlvZ003API_Out_V1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1 getSI_SbmlvZ003API_Out_V1() {
    if (sI_SbmlvZ003API_Out_V1 == null)
      _initSI_SbmlvZ003API_Out_V1Proxy();
    return sI_SbmlvZ003API_Out_V1;
  }
  
  public ecc.pp.api.mes.DT_SbmlvZ003_Resp SI_SbmlvZ003API_Out_V1(ecc.pp.api.mes.DT_SbmlvZ003_ReqRecord[] MT_SbmlvZ003_Req) throws java.rmi.RemoteException{
    if (sI_SbmlvZ003API_Out_V1 == null)
      _initSI_SbmlvZ003API_Out_V1Proxy();
    return sI_SbmlvZ003API_Out_V1.SI_SbmlvZ003API_Out_V1(MT_SbmlvZ003_Req);
  }
  
  
}