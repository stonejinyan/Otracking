package com.otracking.webservice.client;

import java.rmi.RemoteException;

import ecc.pp.api.mes.DT_SbmlvZ003_ReqRecord;
import ecc.pp.api.mes.DT_SbmlvZ003_Resp;
import ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1BindingStub;
import ecc.pp.api.mes.SI_SbmlvZ003API_Out_V1Proxy;

public class SAPEKittingClient {

	public SAPEKittingClient() {
		// TODO Auto-generated constructor stub
	}

	public String pullMaterial(String mo_name, String sap_method_process_name, String processline_name,
	        String quantity) {
		// TODO Auto-generated method stub
		// 换成对应的proxy类
		String DEVURL = "http://sapdpo00.cn.schneider-electric.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SEEE_MES&receiverParty=&receiverService=&interface=SI_SbmlvZ003API_Out_V1&interfaceNamespace=http://ecc/pp/api/mes";
		String QASURL = "http://sapqpo00.cn.schneider-electric.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SEEE_MES&receiverParty=&receiverService=&interface=SI_SbmlvZ003API_Out_V1&interfaceNamespace=http://ecc/pp/api/mes";
		String PRDURL = "http://ppoweb.cn.schneider-electric.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SEEE_MES&receiverParty=&receiverService=&interface=SI_SbmlvZ003API_Out_V1&interfaceNamespace=http://ecc/pp/api/mes";
		SI_SbmlvZ003API_Out_V1Proxy proxy = new SI_SbmlvZ003API_Out_V1Proxy();
		proxy.setEndpoint(PRDURL);
		// 换成获取对应的serice
		SI_SbmlvZ003API_Out_V1BindingStub service = (SI_SbmlvZ003API_Out_V1BindingStub) proxy
		        .getSI_SbmlvZ003API_Out_V1();
		// 调用web service提供的方法
		try {
			// IMPNO, AUFNR, WKBIN, TICKT, WERKS, PRDLN, IMPUR, IMPDT, IMPTM, EXQTY,
			// ZZONE,SPLTX
			// new DT_SbmlvZ003_ReqRecord("", "124107049", "", "", "XA01", "JAW", "", "",
			// "", "50", "", "")
			DT_SbmlvZ003_ReqRecord dt_SbmlvZ003_ReqRecord = new DT_SbmlvZ003_ReqRecord();
			dt_SbmlvZ003_ReqRecord.setAUFNR("000" + mo_name);
			dt_SbmlvZ003_ReqRecord.setWKBIN(sap_method_process_name);
			dt_SbmlvZ003_ReqRecord.setWERKS("XA01");
			dt_SbmlvZ003_ReqRecord.setPRDLN(processline_name);
			dt_SbmlvZ003_ReqRecord.setEXQTY(quantity + "");
			dt_SbmlvZ003_ReqRecord.setIMPUR("SEEE");
			// System.out.println(processline_name);
			DT_SbmlvZ003_ReqRecord[] dt_SbmlvZ003_ReqRecords = new DT_SbmlvZ003_ReqRecord[] { dt_SbmlvZ003_ReqRecord };
			DT_SbmlvZ003_Resp dt_SbmlvZ003_Resp = service.SI_SbmlvZ003API_Out_V1(dt_SbmlvZ003_ReqRecords);
			System.out.println("ReturnMsg:" + dt_SbmlvZ003_Resp.getReturnMsg().getMessage());
			System.out.println("ReturnCode:" + dt_SbmlvZ003_Resp.getReturnMsg().getCode());
			return dt_SbmlvZ003_Resp.getReturnMsg().getCode();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error";
	}

}
