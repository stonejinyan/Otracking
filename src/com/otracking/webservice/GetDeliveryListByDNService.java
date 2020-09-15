package com.otracking.webservice;

import java.rmi.RemoteException;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.otracking.tool.LogUtil;

import ecc.sd.api.getdelivery.DT_Delivery_Req;
import ecc.sd.api.getdelivery.DT_Delivery_Resp;
import ecc.sd.api.getdelivery.DT_Delivery_RespRESULT;
import ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1BindingStub;
import ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1Proxy;
import ecc.sd.api.getdelivery.SI_GetDeliveryAPI_Out_V1ServiceLocator;

public class GetDeliveryListByDNService {

	public GetDeliveryListByDNService() {
		// TODO Auto-generated constructor stub
	}

	public final static String endpointURLQAS = "http://sapqpo00.cn.schneider-electric.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SEEE_MES&receiverParty=&receiverService=&interface=SI_GetDeliveryAPI_Out_V1&interfaceNamespace=http://ecc/sd/api/getdelivery";
	public final static String endpointURLPRD = "http://ppoweb.cn.schneider-electric.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SEEE_MES&receiverParty=&receiverService=&interface=SI_GetDeliveryAPI_Out_V1&interfaceNamespace=http://ecc/sd/api/getdelivery";
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public String getDeliverylistByDN(String dn) {
		LogUtil.RollingFile.info("接收请求(DN:" + dn + ")");
		DT_Delivery_Resp delivery_Resp = getSAPDeliveryListByDN(dn);
		LogUtil.RollingFile.info("发送请求" + gson.toJson(delivery_Resp) + "(DN:" + dn + ")Code："
		        + delivery_Resp.getRESULT().getRETURNCODE());
		return gson.toJson(delivery_Resp);
	}

	public DT_Delivery_Resp getSAPDeliveryListByDN(String dn) {
		// 换成对应的proxy类
		SI_GetDeliveryAPI_Out_V1ServiceLocator si_GetDeliveryAPI_Out_V1ServiceLocator = new SI_GetDeliveryAPI_Out_V1ServiceLocator();
		SI_GetDeliveryAPI_Out_V1Proxy proxy = new SI_GetDeliveryAPI_Out_V1Proxy();
		// proxy.setEndpoint(si_GetDeliveryAPI_Out_V1ServiceLocator.getHTTP_PortAddress()
		// + "?wsdl");
		proxy.setEndpoint(endpointURLPRD);
		// 换成获取对应的serice
		SI_GetDeliveryAPI_Out_V1BindingStub service = (SI_GetDeliveryAPI_Out_V1BindingStub) proxy
		        .getSI_GetDeliveryAPI_Out_V1();
		// 调用web service提供的方法
		DT_Delivery_Resp dt_Delivery_Resp;
		try {
			DT_Delivery_Req dt_Delivery_Req = new DT_Delivery_Req("Order_tracking", "", "", "", "", dn, "", "D-DN");
			dt_Delivery_Resp = service.getDelivery(dt_Delivery_Req);
			return dt_Delivery_Resp;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DT_Delivery_Resp delivery_Resp = new DT_Delivery_Resp();
		delivery_Resp.setRESULT(new DT_Delivery_RespRESULT("400", "SAP ERROR:" + dn));
		return delivery_Resp;
	}

	@Test
	public void testGetDeliverylistByDN() {
		System.out.println(getDeliverylistByDN("820232519"));
	}
}
