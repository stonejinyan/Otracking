/**
 * DT_Delivery_RespDeliverylist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecc.sd.api.getdelivery;

public class DT_Delivery_RespDeliverylist  implements java.io.Serializable {
    /* Project Def. */
    private java.lang.String PSPID;

    /* Project Des */
    private java.lang.String POST1;

    /* WBS Element */
    private java.lang.String POSID;

    /* WBS Element Des. */
    private java.lang.String POST1_WBS;

    /* Ship-to */
    private java.lang.String KUNNR;

    /* Ship-to Description */
    private java.lang.String TXTWE;

    /* Delivery */
    private java.lang.String VBELN;

    /* Country KEY */
    private java.lang.String COUNTRY;

    /* Street */
    private java.lang.String STREET;

    /* city */
    private java.lang.String CITY1;

    /* Region */
    private java.lang.String REGION;

    /* Picking Date */
    private java.lang.String KODAT;

    /* Packing Date */
    private java.lang.String ERDAT_PAK;

    /* Planned GI date */
    private java.lang.String WADAT;

    /* Actual GI date */
    private java.lang.String WADAT_IST;

    /* Total goods movement status */
    private java.lang.String WBSTK;

    /* Credit Status */
    private java.lang.String CMGST;

    /* Packing Status */
    private java.lang.String PKSTK;

    /* Picking Status */
    private java.lang.String KOSTK;

    /* Billing Status */
    private java.lang.String FKSTK;

    /* Transportation Planning Status */
    private java.lang.String TRSTA;

    /* No.of packages */
    private java.lang.String ANZPK;

    /* Trans. Group */
    private java.lang.String TRAGR;

    /* Warehouse No. */
    private java.lang.String LGNUM;

    /* Shipping Point */
    private java.lang.String VSTEL;

    /* Route */
    private java.lang.String ROUTE;

    /* Route Schedule */
    private java.lang.String AULWE;

    /* Incoterm */
    private java.lang.String INCO1;

    /* Incoterms (Part 2) */
    private java.lang.String INCO2;

    /* BillOfLad. */
    private java.lang.String BOLNR;

    /* GR/GI Slip */
    private java.lang.String XABLN;

    /* MnsTransTy */
    private java.lang.String TRATY;

    /* Shipping type */
    private java.lang.String VSART;

    /* Shipping condition */
    private java.lang.String VSBED;

    /* Total weight */
    private java.lang.String BTGEW;

    /* Net Weight */
    private java.lang.String NTGEW;

    /* Weight Unit */
    private java.lang.String GEWEI;

    /* Volume */
    private java.lang.String VOLUM;

    /* Volume Unit */
    private java.lang.String VOLEH;

    /* Billing Block */
    private java.lang.String FAKSK;

    /* Sales org */
    private java.lang.String VKORG;

    /* Sales office */
    private java.lang.String VKBUR;

    /* Create on */
    private java.lang.String ERDAT;

    /* Entry time */
    private java.lang.String ERZET;

    /* Changed on */
    private java.lang.String AEDAT;

    /* Created by */
    private java.lang.String ERNAM;

    /* Changed by */
    private java.lang.String AENAM;

    /* Delivery priority */
    private java.lang.String LPRIO;

    /* Delivery block */
    private java.lang.String LIFSK;

    /* Delivery type */
    private java.lang.String LFART;

    /* Delivery Category */
    private java.lang.String VBTYP;

    /* Ext.Delivery */
    private java.lang.String LIFEX;

    /* Arrival at customer date */
    private java.lang.String ARRDT;

    /* Shipment complete date */
    private java.lang.String DTABF;

    /* Dlv Item */
    private java.lang.String POSNR;

    /* Material */
    private java.lang.String MATNR;

    /* Material Description */
    private java.lang.String ARKTX;

    /* Actual quantity delivered (in sales units) */
    private java.lang.String LFIMG;

    /* Sales unit */
    private java.lang.String VRKME;

    /* Numerator (factor) for conversion of sales quantity into SKU */
    private java.lang.String UMVKZ;

    /* Denominator (Divisor) for Conversion of Sales Qty into SKU */
    private java.lang.String UMVKN;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    /* Actual quantity delivered in stockkeeping units */
    private java.lang.String LGMNG;

    /* Customer-material */
    private java.lang.String KDMAT;

    /* Loading Group */
    private java.lang.String LADGR;

    /* Stor.conditions */
    private java.lang.String RAUBE;

    /* Pick Quantity */
    private java.lang.String PIKMG;

    /* Moving Average Price/Periodic Unit Price */
    private java.lang.String VERPR;

    /* Standard price */
    private java.lang.String STPRS;

    /* Price Unit */
    private java.lang.String PEINH;

    /* Gross weight */
    private java.lang.String BRGEW;

    /* Plant */
    private java.lang.String WERKS;

    /* Storage location */
    private java.lang.String LGORT;

    /* Item Billing Block */
    private java.lang.String FAKSP;

    /* Cost Center */
    private java.lang.String KOSTL;

    /* Ref. Doc */
    private java.lang.String VGBEL;

    /* Ref.Item */
    private java.lang.String VGPOS;

    /* Ref Document Type */
    private java.lang.String VGTYP;

    /* Distr. Channl */
    private java.lang.String VTWEG;

    /* Division */
    private java.lang.String SPART;

    /* Gross weight */
    private java.lang.String BRGEW_ITM;

    /* Net Weight */
    private java.lang.String NTGEW_ITM;

    /* Weight Unit */
    private java.lang.String GEWEI_ITM;

    /* Volume */
    private java.lang.String VOLUM_ITM;

    /* Volume unit */
    private java.lang.String VOLEH_ITM;

    public DT_Delivery_RespDeliverylist() {
    }

    public DT_Delivery_RespDeliverylist(
           java.lang.String PSPID,
           java.lang.String POST1,
           java.lang.String POSID,
           java.lang.String POST1_WBS,
           java.lang.String KUNNR,
           java.lang.String TXTWE,
           java.lang.String VBELN,
           java.lang.String COUNTRY,
           java.lang.String STREET,
           java.lang.String CITY1,
           java.lang.String REGION,
           java.lang.String KODAT,
           java.lang.String ERDAT_PAK,
           java.lang.String WADAT,
           java.lang.String WADAT_IST,
           java.lang.String WBSTK,
           java.lang.String CMGST,
           java.lang.String PKSTK,
           java.lang.String KOSTK,
           java.lang.String FKSTK,
           java.lang.String TRSTA,
           java.lang.String ANZPK,
           java.lang.String TRAGR,
           java.lang.String LGNUM,
           java.lang.String VSTEL,
           java.lang.String ROUTE,
           java.lang.String AULWE,
           java.lang.String INCO1,
           java.lang.String INCO2,
           java.lang.String BOLNR,
           java.lang.String XABLN,
           java.lang.String TRATY,
           java.lang.String VSART,
           java.lang.String VSBED,
           java.lang.String BTGEW,
           java.lang.String NTGEW,
           java.lang.String GEWEI,
           java.lang.String VOLUM,
           java.lang.String VOLEH,
           java.lang.String FAKSK,
           java.lang.String VKORG,
           java.lang.String VKBUR,
           java.lang.String ERDAT,
           java.lang.String ERZET,
           java.lang.String AEDAT,
           java.lang.String ERNAM,
           java.lang.String AENAM,
           java.lang.String LPRIO,
           java.lang.String LIFSK,
           java.lang.String LFART,
           java.lang.String VBTYP,
           java.lang.String LIFEX,
           java.lang.String ARRDT,
           java.lang.String DTABF,
           java.lang.String POSNR,
           java.lang.String MATNR,
           java.lang.String ARKTX,
           java.lang.String LFIMG,
           java.lang.String VRKME,
           java.lang.String UMVKZ,
           java.lang.String UMVKN,
           java.lang.String MEINS,
           java.lang.String LGMNG,
           java.lang.String KDMAT,
           java.lang.String LADGR,
           java.lang.String RAUBE,
           java.lang.String PIKMG,
           java.lang.String VERPR,
           java.lang.String STPRS,
           java.lang.String PEINH,
           java.lang.String BRGEW,
           java.lang.String WERKS,
           java.lang.String LGORT,
           java.lang.String FAKSP,
           java.lang.String KOSTL,
           java.lang.String VGBEL,
           java.lang.String VGPOS,
           java.lang.String VGTYP,
           java.lang.String VTWEG,
           java.lang.String SPART,
           java.lang.String BRGEW_ITM,
           java.lang.String NTGEW_ITM,
           java.lang.String GEWEI_ITM,
           java.lang.String VOLUM_ITM,
           java.lang.String VOLEH_ITM) {
           this.PSPID = PSPID;
           this.POST1 = POST1;
           this.POSID = POSID;
           this.POST1_WBS = POST1_WBS;
           this.KUNNR = KUNNR;
           this.TXTWE = TXTWE;
           this.VBELN = VBELN;
           this.COUNTRY = COUNTRY;
           this.STREET = STREET;
           this.CITY1 = CITY1;
           this.REGION = REGION;
           this.KODAT = KODAT;
           this.ERDAT_PAK = ERDAT_PAK;
           this.WADAT = WADAT;
           this.WADAT_IST = WADAT_IST;
           this.WBSTK = WBSTK;
           this.CMGST = CMGST;
           this.PKSTK = PKSTK;
           this.KOSTK = KOSTK;
           this.FKSTK = FKSTK;
           this.TRSTA = TRSTA;
           this.ANZPK = ANZPK;
           this.TRAGR = TRAGR;
           this.LGNUM = LGNUM;
           this.VSTEL = VSTEL;
           this.ROUTE = ROUTE;
           this.AULWE = AULWE;
           this.INCO1 = INCO1;
           this.INCO2 = INCO2;
           this.BOLNR = BOLNR;
           this.XABLN = XABLN;
           this.TRATY = TRATY;
           this.VSART = VSART;
           this.VSBED = VSBED;
           this.BTGEW = BTGEW;
           this.NTGEW = NTGEW;
           this.GEWEI = GEWEI;
           this.VOLUM = VOLUM;
           this.VOLEH = VOLEH;
           this.FAKSK = FAKSK;
           this.VKORG = VKORG;
           this.VKBUR = VKBUR;
           this.ERDAT = ERDAT;
           this.ERZET = ERZET;
           this.AEDAT = AEDAT;
           this.ERNAM = ERNAM;
           this.AENAM = AENAM;
           this.LPRIO = LPRIO;
           this.LIFSK = LIFSK;
           this.LFART = LFART;
           this.VBTYP = VBTYP;
           this.LIFEX = LIFEX;
           this.ARRDT = ARRDT;
           this.DTABF = DTABF;
           this.POSNR = POSNR;
           this.MATNR = MATNR;
           this.ARKTX = ARKTX;
           this.LFIMG = LFIMG;
           this.VRKME = VRKME;
           this.UMVKZ = UMVKZ;
           this.UMVKN = UMVKN;
           this.MEINS = MEINS;
           this.LGMNG = LGMNG;
           this.KDMAT = KDMAT;
           this.LADGR = LADGR;
           this.RAUBE = RAUBE;
           this.PIKMG = PIKMG;
           this.VERPR = VERPR;
           this.STPRS = STPRS;
           this.PEINH = PEINH;
           this.BRGEW = BRGEW;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.FAKSP = FAKSP;
           this.KOSTL = KOSTL;
           this.VGBEL = VGBEL;
           this.VGPOS = VGPOS;
           this.VGTYP = VGTYP;
           this.VTWEG = VTWEG;
           this.SPART = SPART;
           this.BRGEW_ITM = BRGEW_ITM;
           this.NTGEW_ITM = NTGEW_ITM;
           this.GEWEI_ITM = GEWEI_ITM;
           this.VOLUM_ITM = VOLUM_ITM;
           this.VOLEH_ITM = VOLEH_ITM;
    }


    /**
     * Gets the PSPID value for this DT_Delivery_RespDeliverylist.
     * 
     * @return PSPID   * Project Def.
     */
    public java.lang.String getPSPID() {
        return PSPID;
    }


    /**
     * Sets the PSPID value for this DT_Delivery_RespDeliverylist.
     * 
     * @param PSPID   * Project Def.
     */
    public void setPSPID(java.lang.String PSPID) {
        this.PSPID = PSPID;
    }


    /**
     * Gets the POST1 value for this DT_Delivery_RespDeliverylist.
     * 
     * @return POST1   * Project Des
     */
    public java.lang.String getPOST1() {
        return POST1;
    }


    /**
     * Sets the POST1 value for this DT_Delivery_RespDeliverylist.
     * 
     * @param POST1   * Project Des
     */
    public void setPOST1(java.lang.String POST1) {
        this.POST1 = POST1;
    }


    /**
     * Gets the POSID value for this DT_Delivery_RespDeliverylist.
     * 
     * @return POSID   * WBS Element
     */
    public java.lang.String getPOSID() {
        return POSID;
    }


    /**
     * Sets the POSID value for this DT_Delivery_RespDeliverylist.
     * 
     * @param POSID   * WBS Element
     */
    public void setPOSID(java.lang.String POSID) {
        this.POSID = POSID;
    }


    /**
     * Gets the POST1_WBS value for this DT_Delivery_RespDeliverylist.
     * 
     * @return POST1_WBS   * WBS Element Des.
     */
    public java.lang.String getPOST1_WBS() {
        return POST1_WBS;
    }


    /**
     * Sets the POST1_WBS value for this DT_Delivery_RespDeliverylist.
     * 
     * @param POST1_WBS   * WBS Element Des.
     */
    public void setPOST1_WBS(java.lang.String POST1_WBS) {
        this.POST1_WBS = POST1_WBS;
    }


    /**
     * Gets the KUNNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return KUNNR   * Ship-to
     */
    public java.lang.String getKUNNR() {
        return KUNNR;
    }


    /**
     * Sets the KUNNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param KUNNR   * Ship-to
     */
    public void setKUNNR(java.lang.String KUNNR) {
        this.KUNNR = KUNNR;
    }


    /**
     * Gets the TXTWE value for this DT_Delivery_RespDeliverylist.
     * 
     * @return TXTWE   * Ship-to Description
     */
    public java.lang.String getTXTWE() {
        return TXTWE;
    }


    /**
     * Sets the TXTWE value for this DT_Delivery_RespDeliverylist.
     * 
     * @param TXTWE   * Ship-to Description
     */
    public void setTXTWE(java.lang.String TXTWE) {
        this.TXTWE = TXTWE;
    }


    /**
     * Gets the VBELN value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VBELN   * Delivery
     */
    public java.lang.String getVBELN() {
        return VBELN;
    }


    /**
     * Sets the VBELN value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VBELN   * Delivery
     */
    public void setVBELN(java.lang.String VBELN) {
        this.VBELN = VBELN;
    }


    /**
     * Gets the COUNTRY value for this DT_Delivery_RespDeliverylist.
     * 
     * @return COUNTRY   * Country KEY
     */
    public java.lang.String getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this DT_Delivery_RespDeliverylist.
     * 
     * @param COUNTRY   * Country KEY
     */
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    /**
     * Gets the STREET value for this DT_Delivery_RespDeliverylist.
     * 
     * @return STREET   * Street
     */
    public java.lang.String getSTREET() {
        return STREET;
    }


    /**
     * Sets the STREET value for this DT_Delivery_RespDeliverylist.
     * 
     * @param STREET   * Street
     */
    public void setSTREET(java.lang.String STREET) {
        this.STREET = STREET;
    }


    /**
     * Gets the CITY1 value for this DT_Delivery_RespDeliverylist.
     * 
     * @return CITY1   * city
     */
    public java.lang.String getCITY1() {
        return CITY1;
    }


    /**
     * Sets the CITY1 value for this DT_Delivery_RespDeliverylist.
     * 
     * @param CITY1   * city
     */
    public void setCITY1(java.lang.String CITY1) {
        this.CITY1 = CITY1;
    }


    /**
     * Gets the REGION value for this DT_Delivery_RespDeliverylist.
     * 
     * @return REGION   * Region
     */
    public java.lang.String getREGION() {
        return REGION;
    }


    /**
     * Sets the REGION value for this DT_Delivery_RespDeliverylist.
     * 
     * @param REGION   * Region
     */
    public void setREGION(java.lang.String REGION) {
        this.REGION = REGION;
    }


    /**
     * Gets the KODAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return KODAT   * Picking Date
     */
    public java.lang.String getKODAT() {
        return KODAT;
    }


    /**
     * Sets the KODAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param KODAT   * Picking Date
     */
    public void setKODAT(java.lang.String KODAT) {
        this.KODAT = KODAT;
    }


    /**
     * Gets the ERDAT_PAK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ERDAT_PAK   * Packing Date
     */
    public java.lang.String getERDAT_PAK() {
        return ERDAT_PAK;
    }


    /**
     * Sets the ERDAT_PAK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ERDAT_PAK   * Packing Date
     */
    public void setERDAT_PAK(java.lang.String ERDAT_PAK) {
        this.ERDAT_PAK = ERDAT_PAK;
    }


    /**
     * Gets the WADAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return WADAT   * Planned GI date
     */
    public java.lang.String getWADAT() {
        return WADAT;
    }


    /**
     * Sets the WADAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param WADAT   * Planned GI date
     */
    public void setWADAT(java.lang.String WADAT) {
        this.WADAT = WADAT;
    }


    /**
     * Gets the WADAT_IST value for this DT_Delivery_RespDeliverylist.
     * 
     * @return WADAT_IST   * Actual GI date
     */
    public java.lang.String getWADAT_IST() {
        return WADAT_IST;
    }


    /**
     * Sets the WADAT_IST value for this DT_Delivery_RespDeliverylist.
     * 
     * @param WADAT_IST   * Actual GI date
     */
    public void setWADAT_IST(java.lang.String WADAT_IST) {
        this.WADAT_IST = WADAT_IST;
    }


    /**
     * Gets the WBSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return WBSTK   * Total goods movement status
     */
    public java.lang.String getWBSTK() {
        return WBSTK;
    }


    /**
     * Sets the WBSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param WBSTK   * Total goods movement status
     */
    public void setWBSTK(java.lang.String WBSTK) {
        this.WBSTK = WBSTK;
    }


    /**
     * Gets the CMGST value for this DT_Delivery_RespDeliverylist.
     * 
     * @return CMGST   * Credit Status
     */
    public java.lang.String getCMGST() {
        return CMGST;
    }


    /**
     * Sets the CMGST value for this DT_Delivery_RespDeliverylist.
     * 
     * @param CMGST   * Credit Status
     */
    public void setCMGST(java.lang.String CMGST) {
        this.CMGST = CMGST;
    }


    /**
     * Gets the PKSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return PKSTK   * Packing Status
     */
    public java.lang.String getPKSTK() {
        return PKSTK;
    }


    /**
     * Sets the PKSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param PKSTK   * Packing Status
     */
    public void setPKSTK(java.lang.String PKSTK) {
        this.PKSTK = PKSTK;
    }


    /**
     * Gets the KOSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return KOSTK   * Picking Status
     */
    public java.lang.String getKOSTK() {
        return KOSTK;
    }


    /**
     * Sets the KOSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param KOSTK   * Picking Status
     */
    public void setKOSTK(java.lang.String KOSTK) {
        this.KOSTK = KOSTK;
    }


    /**
     * Gets the FKSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return FKSTK   * Billing Status
     */
    public java.lang.String getFKSTK() {
        return FKSTK;
    }


    /**
     * Sets the FKSTK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param FKSTK   * Billing Status
     */
    public void setFKSTK(java.lang.String FKSTK) {
        this.FKSTK = FKSTK;
    }


    /**
     * Gets the TRSTA value for this DT_Delivery_RespDeliverylist.
     * 
     * @return TRSTA   * Transportation Planning Status
     */
    public java.lang.String getTRSTA() {
        return TRSTA;
    }


    /**
     * Sets the TRSTA value for this DT_Delivery_RespDeliverylist.
     * 
     * @param TRSTA   * Transportation Planning Status
     */
    public void setTRSTA(java.lang.String TRSTA) {
        this.TRSTA = TRSTA;
    }


    /**
     * Gets the ANZPK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ANZPK   * No.of packages
     */
    public java.lang.String getANZPK() {
        return ANZPK;
    }


    /**
     * Sets the ANZPK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ANZPK   * No.of packages
     */
    public void setANZPK(java.lang.String ANZPK) {
        this.ANZPK = ANZPK;
    }


    /**
     * Gets the TRAGR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return TRAGR   * Trans. Group
     */
    public java.lang.String getTRAGR() {
        return TRAGR;
    }


    /**
     * Sets the TRAGR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param TRAGR   * Trans. Group
     */
    public void setTRAGR(java.lang.String TRAGR) {
        this.TRAGR = TRAGR;
    }


    /**
     * Gets the LGNUM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LGNUM   * Warehouse No.
     */
    public java.lang.String getLGNUM() {
        return LGNUM;
    }


    /**
     * Sets the LGNUM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LGNUM   * Warehouse No.
     */
    public void setLGNUM(java.lang.String LGNUM) {
        this.LGNUM = LGNUM;
    }


    /**
     * Gets the VSTEL value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VSTEL   * Shipping Point
     */
    public java.lang.String getVSTEL() {
        return VSTEL;
    }


    /**
     * Sets the VSTEL value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VSTEL   * Shipping Point
     */
    public void setVSTEL(java.lang.String VSTEL) {
        this.VSTEL = VSTEL;
    }


    /**
     * Gets the ROUTE value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ROUTE   * Route
     */
    public java.lang.String getROUTE() {
        return ROUTE;
    }


    /**
     * Sets the ROUTE value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ROUTE   * Route
     */
    public void setROUTE(java.lang.String ROUTE) {
        this.ROUTE = ROUTE;
    }


    /**
     * Gets the AULWE value for this DT_Delivery_RespDeliverylist.
     * 
     * @return AULWE   * Route Schedule
     */
    public java.lang.String getAULWE() {
        return AULWE;
    }


    /**
     * Sets the AULWE value for this DT_Delivery_RespDeliverylist.
     * 
     * @param AULWE   * Route Schedule
     */
    public void setAULWE(java.lang.String AULWE) {
        this.AULWE = AULWE;
    }


    /**
     * Gets the INCO1 value for this DT_Delivery_RespDeliverylist.
     * 
     * @return INCO1   * Incoterm
     */
    public java.lang.String getINCO1() {
        return INCO1;
    }


    /**
     * Sets the INCO1 value for this DT_Delivery_RespDeliverylist.
     * 
     * @param INCO1   * Incoterm
     */
    public void setINCO1(java.lang.String INCO1) {
        this.INCO1 = INCO1;
    }


    /**
     * Gets the INCO2 value for this DT_Delivery_RespDeliverylist.
     * 
     * @return INCO2   * Incoterms (Part 2)
     */
    public java.lang.String getINCO2() {
        return INCO2;
    }


    /**
     * Sets the INCO2 value for this DT_Delivery_RespDeliverylist.
     * 
     * @param INCO2   * Incoterms (Part 2)
     */
    public void setINCO2(java.lang.String INCO2) {
        this.INCO2 = INCO2;
    }


    /**
     * Gets the BOLNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return BOLNR   * BillOfLad.
     */
    public java.lang.String getBOLNR() {
        return BOLNR;
    }


    /**
     * Sets the BOLNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param BOLNR   * BillOfLad.
     */
    public void setBOLNR(java.lang.String BOLNR) {
        this.BOLNR = BOLNR;
    }


    /**
     * Gets the XABLN value for this DT_Delivery_RespDeliverylist.
     * 
     * @return XABLN   * GR/GI Slip
     */
    public java.lang.String getXABLN() {
        return XABLN;
    }


    /**
     * Sets the XABLN value for this DT_Delivery_RespDeliverylist.
     * 
     * @param XABLN   * GR/GI Slip
     */
    public void setXABLN(java.lang.String XABLN) {
        this.XABLN = XABLN;
    }


    /**
     * Gets the TRATY value for this DT_Delivery_RespDeliverylist.
     * 
     * @return TRATY   * MnsTransTy
     */
    public java.lang.String getTRATY() {
        return TRATY;
    }


    /**
     * Sets the TRATY value for this DT_Delivery_RespDeliverylist.
     * 
     * @param TRATY   * MnsTransTy
     */
    public void setTRATY(java.lang.String TRATY) {
        this.TRATY = TRATY;
    }


    /**
     * Gets the VSART value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VSART   * Shipping type
     */
    public java.lang.String getVSART() {
        return VSART;
    }


    /**
     * Sets the VSART value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VSART   * Shipping type
     */
    public void setVSART(java.lang.String VSART) {
        this.VSART = VSART;
    }


    /**
     * Gets the VSBED value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VSBED   * Shipping condition
     */
    public java.lang.String getVSBED() {
        return VSBED;
    }


    /**
     * Sets the VSBED value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VSBED   * Shipping condition
     */
    public void setVSBED(java.lang.String VSBED) {
        this.VSBED = VSBED;
    }


    /**
     * Gets the BTGEW value for this DT_Delivery_RespDeliverylist.
     * 
     * @return BTGEW   * Total weight
     */
    public java.lang.String getBTGEW() {
        return BTGEW;
    }


    /**
     * Sets the BTGEW value for this DT_Delivery_RespDeliverylist.
     * 
     * @param BTGEW   * Total weight
     */
    public void setBTGEW(java.lang.String BTGEW) {
        this.BTGEW = BTGEW;
    }


    /**
     * Gets the NTGEW value for this DT_Delivery_RespDeliverylist.
     * 
     * @return NTGEW   * Net Weight
     */
    public java.lang.String getNTGEW() {
        return NTGEW;
    }


    /**
     * Sets the NTGEW value for this DT_Delivery_RespDeliverylist.
     * 
     * @param NTGEW   * Net Weight
     */
    public void setNTGEW(java.lang.String NTGEW) {
        this.NTGEW = NTGEW;
    }


    /**
     * Gets the GEWEI value for this DT_Delivery_RespDeliverylist.
     * 
     * @return GEWEI   * Weight Unit
     */
    public java.lang.String getGEWEI() {
        return GEWEI;
    }


    /**
     * Sets the GEWEI value for this DT_Delivery_RespDeliverylist.
     * 
     * @param GEWEI   * Weight Unit
     */
    public void setGEWEI(java.lang.String GEWEI) {
        this.GEWEI = GEWEI;
    }


    /**
     * Gets the VOLUM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VOLUM   * Volume
     */
    public java.lang.String getVOLUM() {
        return VOLUM;
    }


    /**
     * Sets the VOLUM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VOLUM   * Volume
     */
    public void setVOLUM(java.lang.String VOLUM) {
        this.VOLUM = VOLUM;
    }


    /**
     * Gets the VOLEH value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VOLEH   * Volume Unit
     */
    public java.lang.String getVOLEH() {
        return VOLEH;
    }


    /**
     * Sets the VOLEH value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VOLEH   * Volume Unit
     */
    public void setVOLEH(java.lang.String VOLEH) {
        this.VOLEH = VOLEH;
    }


    /**
     * Gets the FAKSK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return FAKSK   * Billing Block
     */
    public java.lang.String getFAKSK() {
        return FAKSK;
    }


    /**
     * Sets the FAKSK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param FAKSK   * Billing Block
     */
    public void setFAKSK(java.lang.String FAKSK) {
        this.FAKSK = FAKSK;
    }


    /**
     * Gets the VKORG value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VKORG   * Sales org
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VKORG   * Sales org
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }


    /**
     * Gets the VKBUR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VKBUR   * Sales office
     */
    public java.lang.String getVKBUR() {
        return VKBUR;
    }


    /**
     * Sets the VKBUR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VKBUR   * Sales office
     */
    public void setVKBUR(java.lang.String VKBUR) {
        this.VKBUR = VKBUR;
    }


    /**
     * Gets the ERDAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ERDAT   * Create on
     */
    public java.lang.String getERDAT() {
        return ERDAT;
    }


    /**
     * Sets the ERDAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ERDAT   * Create on
     */
    public void setERDAT(java.lang.String ERDAT) {
        this.ERDAT = ERDAT;
    }


    /**
     * Gets the ERZET value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ERZET   * Entry time
     */
    public java.lang.String getERZET() {
        return ERZET;
    }


    /**
     * Sets the ERZET value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ERZET   * Entry time
     */
    public void setERZET(java.lang.String ERZET) {
        this.ERZET = ERZET;
    }


    /**
     * Gets the AEDAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return AEDAT   * Changed on
     */
    public java.lang.String getAEDAT() {
        return AEDAT;
    }


    /**
     * Sets the AEDAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param AEDAT   * Changed on
     */
    public void setAEDAT(java.lang.String AEDAT) {
        this.AEDAT = AEDAT;
    }


    /**
     * Gets the ERNAM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ERNAM   * Created by
     */
    public java.lang.String getERNAM() {
        return ERNAM;
    }


    /**
     * Sets the ERNAM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ERNAM   * Created by
     */
    public void setERNAM(java.lang.String ERNAM) {
        this.ERNAM = ERNAM;
    }


    /**
     * Gets the AENAM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return AENAM   * Changed by
     */
    public java.lang.String getAENAM() {
        return AENAM;
    }


    /**
     * Sets the AENAM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param AENAM   * Changed by
     */
    public void setAENAM(java.lang.String AENAM) {
        this.AENAM = AENAM;
    }


    /**
     * Gets the LPRIO value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LPRIO   * Delivery priority
     */
    public java.lang.String getLPRIO() {
        return LPRIO;
    }


    /**
     * Sets the LPRIO value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LPRIO   * Delivery priority
     */
    public void setLPRIO(java.lang.String LPRIO) {
        this.LPRIO = LPRIO;
    }


    /**
     * Gets the LIFSK value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LIFSK   * Delivery block
     */
    public java.lang.String getLIFSK() {
        return LIFSK;
    }


    /**
     * Sets the LIFSK value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LIFSK   * Delivery block
     */
    public void setLIFSK(java.lang.String LIFSK) {
        this.LIFSK = LIFSK;
    }


    /**
     * Gets the LFART value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LFART   * Delivery type
     */
    public java.lang.String getLFART() {
        return LFART;
    }


    /**
     * Sets the LFART value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LFART   * Delivery type
     */
    public void setLFART(java.lang.String LFART) {
        this.LFART = LFART;
    }


    /**
     * Gets the VBTYP value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VBTYP   * Delivery Category
     */
    public java.lang.String getVBTYP() {
        return VBTYP;
    }


    /**
     * Sets the VBTYP value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VBTYP   * Delivery Category
     */
    public void setVBTYP(java.lang.String VBTYP) {
        this.VBTYP = VBTYP;
    }


    /**
     * Gets the LIFEX value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LIFEX   * Ext.Delivery
     */
    public java.lang.String getLIFEX() {
        return LIFEX;
    }


    /**
     * Sets the LIFEX value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LIFEX   * Ext.Delivery
     */
    public void setLIFEX(java.lang.String LIFEX) {
        this.LIFEX = LIFEX;
    }


    /**
     * Gets the ARRDT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ARRDT   * Arrival at customer date
     */
    public java.lang.String getARRDT() {
        return ARRDT;
    }


    /**
     * Sets the ARRDT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ARRDT   * Arrival at customer date
     */
    public void setARRDT(java.lang.String ARRDT) {
        this.ARRDT = ARRDT;
    }


    /**
     * Gets the DTABF value for this DT_Delivery_RespDeliverylist.
     * 
     * @return DTABF   * Shipment complete date
     */
    public java.lang.String getDTABF() {
        return DTABF;
    }


    /**
     * Sets the DTABF value for this DT_Delivery_RespDeliverylist.
     * 
     * @param DTABF   * Shipment complete date
     */
    public void setDTABF(java.lang.String DTABF) {
        this.DTABF = DTABF;
    }


    /**
     * Gets the POSNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return POSNR   * Dlv Item
     */
    public java.lang.String getPOSNR() {
        return POSNR;
    }


    /**
     * Sets the POSNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param POSNR   * Dlv Item
     */
    public void setPOSNR(java.lang.String POSNR) {
        this.POSNR = POSNR;
    }


    /**
     * Gets the MATNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return MATNR   * Material
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param MATNR   * Material
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the ARKTX value for this DT_Delivery_RespDeliverylist.
     * 
     * @return ARKTX   * Material Description
     */
    public java.lang.String getARKTX() {
        return ARKTX;
    }


    /**
     * Sets the ARKTX value for this DT_Delivery_RespDeliverylist.
     * 
     * @param ARKTX   * Material Description
     */
    public void setARKTX(java.lang.String ARKTX) {
        this.ARKTX = ARKTX;
    }


    /**
     * Gets the LFIMG value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LFIMG   * Actual quantity delivered (in sales units)
     */
    public java.lang.String getLFIMG() {
        return LFIMG;
    }


    /**
     * Sets the LFIMG value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LFIMG   * Actual quantity delivered (in sales units)
     */
    public void setLFIMG(java.lang.String LFIMG) {
        this.LFIMG = LFIMG;
    }


    /**
     * Gets the VRKME value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VRKME   * Sales unit
     */
    public java.lang.String getVRKME() {
        return VRKME;
    }


    /**
     * Sets the VRKME value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VRKME   * Sales unit
     */
    public void setVRKME(java.lang.String VRKME) {
        this.VRKME = VRKME;
    }


    /**
     * Gets the UMVKZ value for this DT_Delivery_RespDeliverylist.
     * 
     * @return UMVKZ   * Numerator (factor) for conversion of sales quantity into SKU
     */
    public java.lang.String getUMVKZ() {
        return UMVKZ;
    }


    /**
     * Sets the UMVKZ value for this DT_Delivery_RespDeliverylist.
     * 
     * @param UMVKZ   * Numerator (factor) for conversion of sales quantity into SKU
     */
    public void setUMVKZ(java.lang.String UMVKZ) {
        this.UMVKZ = UMVKZ;
    }


    /**
     * Gets the UMVKN value for this DT_Delivery_RespDeliverylist.
     * 
     * @return UMVKN   * Denominator (Divisor) for Conversion of Sales Qty into SKU
     */
    public java.lang.String getUMVKN() {
        return UMVKN;
    }


    /**
     * Sets the UMVKN value for this DT_Delivery_RespDeliverylist.
     * 
     * @param UMVKN   * Denominator (Divisor) for Conversion of Sales Qty into SKU
     */
    public void setUMVKN(java.lang.String UMVKN) {
        this.UMVKN = UMVKN;
    }


    /**
     * Gets the MEINS value for this DT_Delivery_RespDeliverylist.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this DT_Delivery_RespDeliverylist.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the LGMNG value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LGMNG   * Actual quantity delivered in stockkeeping units
     */
    public java.lang.String getLGMNG() {
        return LGMNG;
    }


    /**
     * Sets the LGMNG value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LGMNG   * Actual quantity delivered in stockkeeping units
     */
    public void setLGMNG(java.lang.String LGMNG) {
        this.LGMNG = LGMNG;
    }


    /**
     * Gets the KDMAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return KDMAT   * Customer-material
     */
    public java.lang.String getKDMAT() {
        return KDMAT;
    }


    /**
     * Sets the KDMAT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param KDMAT   * Customer-material
     */
    public void setKDMAT(java.lang.String KDMAT) {
        this.KDMAT = KDMAT;
    }


    /**
     * Gets the LADGR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LADGR   * Loading Group
     */
    public java.lang.String getLADGR() {
        return LADGR;
    }


    /**
     * Sets the LADGR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LADGR   * Loading Group
     */
    public void setLADGR(java.lang.String LADGR) {
        this.LADGR = LADGR;
    }


    /**
     * Gets the RAUBE value for this DT_Delivery_RespDeliverylist.
     * 
     * @return RAUBE   * Stor.conditions
     */
    public java.lang.String getRAUBE() {
        return RAUBE;
    }


    /**
     * Sets the RAUBE value for this DT_Delivery_RespDeliverylist.
     * 
     * @param RAUBE   * Stor.conditions
     */
    public void setRAUBE(java.lang.String RAUBE) {
        this.RAUBE = RAUBE;
    }


    /**
     * Gets the PIKMG value for this DT_Delivery_RespDeliverylist.
     * 
     * @return PIKMG   * Pick Quantity
     */
    public java.lang.String getPIKMG() {
        return PIKMG;
    }


    /**
     * Sets the PIKMG value for this DT_Delivery_RespDeliverylist.
     * 
     * @param PIKMG   * Pick Quantity
     */
    public void setPIKMG(java.lang.String PIKMG) {
        this.PIKMG = PIKMG;
    }


    /**
     * Gets the VERPR value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VERPR   * Moving Average Price/Periodic Unit Price
     */
    public java.lang.String getVERPR() {
        return VERPR;
    }


    /**
     * Sets the VERPR value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VERPR   * Moving Average Price/Periodic Unit Price
     */
    public void setVERPR(java.lang.String VERPR) {
        this.VERPR = VERPR;
    }


    /**
     * Gets the STPRS value for this DT_Delivery_RespDeliverylist.
     * 
     * @return STPRS   * Standard price
     */
    public java.lang.String getSTPRS() {
        return STPRS;
    }


    /**
     * Sets the STPRS value for this DT_Delivery_RespDeliverylist.
     * 
     * @param STPRS   * Standard price
     */
    public void setSTPRS(java.lang.String STPRS) {
        this.STPRS = STPRS;
    }


    /**
     * Gets the PEINH value for this DT_Delivery_RespDeliverylist.
     * 
     * @return PEINH   * Price Unit
     */
    public java.lang.String getPEINH() {
        return PEINH;
    }


    /**
     * Sets the PEINH value for this DT_Delivery_RespDeliverylist.
     * 
     * @param PEINH   * Price Unit
     */
    public void setPEINH(java.lang.String PEINH) {
        this.PEINH = PEINH;
    }


    /**
     * Gets the BRGEW value for this DT_Delivery_RespDeliverylist.
     * 
     * @return BRGEW   * Gross weight
     */
    public java.lang.String getBRGEW() {
        return BRGEW;
    }


    /**
     * Sets the BRGEW value for this DT_Delivery_RespDeliverylist.
     * 
     * @param BRGEW   * Gross weight
     */
    public void setBRGEW(java.lang.String BRGEW) {
        this.BRGEW = BRGEW;
    }


    /**
     * Gets the WERKS value for this DT_Delivery_RespDeliverylist.
     * 
     * @return WERKS   * Plant
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this DT_Delivery_RespDeliverylist.
     * 
     * @param WERKS   * Plant
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this DT_Delivery_RespDeliverylist.
     * 
     * @return LGORT   * Storage location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this DT_Delivery_RespDeliverylist.
     * 
     * @param LGORT   * Storage location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the FAKSP value for this DT_Delivery_RespDeliverylist.
     * 
     * @return FAKSP   * Item Billing Block
     */
    public java.lang.String getFAKSP() {
        return FAKSP;
    }


    /**
     * Sets the FAKSP value for this DT_Delivery_RespDeliverylist.
     * 
     * @param FAKSP   * Item Billing Block
     */
    public void setFAKSP(java.lang.String FAKSP) {
        this.FAKSP = FAKSP;
    }


    /**
     * Gets the KOSTL value for this DT_Delivery_RespDeliverylist.
     * 
     * @return KOSTL   * Cost Center
     */
    public java.lang.String getKOSTL() {
        return KOSTL;
    }


    /**
     * Sets the KOSTL value for this DT_Delivery_RespDeliverylist.
     * 
     * @param KOSTL   * Cost Center
     */
    public void setKOSTL(java.lang.String KOSTL) {
        this.KOSTL = KOSTL;
    }


    /**
     * Gets the VGBEL value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VGBEL   * Ref. Doc
     */
    public java.lang.String getVGBEL() {
        return VGBEL;
    }


    /**
     * Sets the VGBEL value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VGBEL   * Ref. Doc
     */
    public void setVGBEL(java.lang.String VGBEL) {
        this.VGBEL = VGBEL;
    }


    /**
     * Gets the VGPOS value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VGPOS   * Ref.Item
     */
    public java.lang.String getVGPOS() {
        return VGPOS;
    }


    /**
     * Sets the VGPOS value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VGPOS   * Ref.Item
     */
    public void setVGPOS(java.lang.String VGPOS) {
        this.VGPOS = VGPOS;
    }


    /**
     * Gets the VGTYP value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VGTYP   * Ref Document Type
     */
    public java.lang.String getVGTYP() {
        return VGTYP;
    }


    /**
     * Sets the VGTYP value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VGTYP   * Ref Document Type
     */
    public void setVGTYP(java.lang.String VGTYP) {
        this.VGTYP = VGTYP;
    }


    /**
     * Gets the VTWEG value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VTWEG   * Distr. Channl
     */
    public java.lang.String getVTWEG() {
        return VTWEG;
    }


    /**
     * Sets the VTWEG value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VTWEG   * Distr. Channl
     */
    public void setVTWEG(java.lang.String VTWEG) {
        this.VTWEG = VTWEG;
    }


    /**
     * Gets the SPART value for this DT_Delivery_RespDeliverylist.
     * 
     * @return SPART   * Division
     */
    public java.lang.String getSPART() {
        return SPART;
    }


    /**
     * Sets the SPART value for this DT_Delivery_RespDeliverylist.
     * 
     * @param SPART   * Division
     */
    public void setSPART(java.lang.String SPART) {
        this.SPART = SPART;
    }


    /**
     * Gets the BRGEW_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return BRGEW_ITM   * Gross weight
     */
    public java.lang.String getBRGEW_ITM() {
        return BRGEW_ITM;
    }


    /**
     * Sets the BRGEW_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param BRGEW_ITM   * Gross weight
     */
    public void setBRGEW_ITM(java.lang.String BRGEW_ITM) {
        this.BRGEW_ITM = BRGEW_ITM;
    }


    /**
     * Gets the NTGEW_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return NTGEW_ITM   * Net Weight
     */
    public java.lang.String getNTGEW_ITM() {
        return NTGEW_ITM;
    }


    /**
     * Sets the NTGEW_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param NTGEW_ITM   * Net Weight
     */
    public void setNTGEW_ITM(java.lang.String NTGEW_ITM) {
        this.NTGEW_ITM = NTGEW_ITM;
    }


    /**
     * Gets the GEWEI_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return GEWEI_ITM   * Weight Unit
     */
    public java.lang.String getGEWEI_ITM() {
        return GEWEI_ITM;
    }


    /**
     * Sets the GEWEI_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param GEWEI_ITM   * Weight Unit
     */
    public void setGEWEI_ITM(java.lang.String GEWEI_ITM) {
        this.GEWEI_ITM = GEWEI_ITM;
    }


    /**
     * Gets the VOLUM_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VOLUM_ITM   * Volume
     */
    public java.lang.String getVOLUM_ITM() {
        return VOLUM_ITM;
    }


    /**
     * Sets the VOLUM_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VOLUM_ITM   * Volume
     */
    public void setVOLUM_ITM(java.lang.String VOLUM_ITM) {
        this.VOLUM_ITM = VOLUM_ITM;
    }


    /**
     * Gets the VOLEH_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @return VOLEH_ITM   * Volume unit
     */
    public java.lang.String getVOLEH_ITM() {
        return VOLEH_ITM;
    }


    /**
     * Sets the VOLEH_ITM value for this DT_Delivery_RespDeliverylist.
     * 
     * @param VOLEH_ITM   * Volume unit
     */
    public void setVOLEH_ITM(java.lang.String VOLEH_ITM) {
        this.VOLEH_ITM = VOLEH_ITM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_Delivery_RespDeliverylist)) return false;
        DT_Delivery_RespDeliverylist other = (DT_Delivery_RespDeliverylist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PSPID==null && other.getPSPID()==null) || 
             (this.PSPID!=null &&
              this.PSPID.equals(other.getPSPID()))) &&
            ((this.POST1==null && other.getPOST1()==null) || 
             (this.POST1!=null &&
              this.POST1.equals(other.getPOST1()))) &&
            ((this.POSID==null && other.getPOSID()==null) || 
             (this.POSID!=null &&
              this.POSID.equals(other.getPOSID()))) &&
            ((this.POST1_WBS==null && other.getPOST1_WBS()==null) || 
             (this.POST1_WBS!=null &&
              this.POST1_WBS.equals(other.getPOST1_WBS()))) &&
            ((this.KUNNR==null && other.getKUNNR()==null) || 
             (this.KUNNR!=null &&
              this.KUNNR.equals(other.getKUNNR()))) &&
            ((this.TXTWE==null && other.getTXTWE()==null) || 
             (this.TXTWE!=null &&
              this.TXTWE.equals(other.getTXTWE()))) &&
            ((this.VBELN==null && other.getVBELN()==null) || 
             (this.VBELN!=null &&
              this.VBELN.equals(other.getVBELN()))) &&
            ((this.COUNTRY==null && other.getCOUNTRY()==null) || 
             (this.COUNTRY!=null &&
              this.COUNTRY.equals(other.getCOUNTRY()))) &&
            ((this.STREET==null && other.getSTREET()==null) || 
             (this.STREET!=null &&
              this.STREET.equals(other.getSTREET()))) &&
            ((this.CITY1==null && other.getCITY1()==null) || 
             (this.CITY1!=null &&
              this.CITY1.equals(other.getCITY1()))) &&
            ((this.REGION==null && other.getREGION()==null) || 
             (this.REGION!=null &&
              this.REGION.equals(other.getREGION()))) &&
            ((this.KODAT==null && other.getKODAT()==null) || 
             (this.KODAT!=null &&
              this.KODAT.equals(other.getKODAT()))) &&
            ((this.ERDAT_PAK==null && other.getERDAT_PAK()==null) || 
             (this.ERDAT_PAK!=null &&
              this.ERDAT_PAK.equals(other.getERDAT_PAK()))) &&
            ((this.WADAT==null && other.getWADAT()==null) || 
             (this.WADAT!=null &&
              this.WADAT.equals(other.getWADAT()))) &&
            ((this.WADAT_IST==null && other.getWADAT_IST()==null) || 
             (this.WADAT_IST!=null &&
              this.WADAT_IST.equals(other.getWADAT_IST()))) &&
            ((this.WBSTK==null && other.getWBSTK()==null) || 
             (this.WBSTK!=null &&
              this.WBSTK.equals(other.getWBSTK()))) &&
            ((this.CMGST==null && other.getCMGST()==null) || 
             (this.CMGST!=null &&
              this.CMGST.equals(other.getCMGST()))) &&
            ((this.PKSTK==null && other.getPKSTK()==null) || 
             (this.PKSTK!=null &&
              this.PKSTK.equals(other.getPKSTK()))) &&
            ((this.KOSTK==null && other.getKOSTK()==null) || 
             (this.KOSTK!=null &&
              this.KOSTK.equals(other.getKOSTK()))) &&
            ((this.FKSTK==null && other.getFKSTK()==null) || 
             (this.FKSTK!=null &&
              this.FKSTK.equals(other.getFKSTK()))) &&
            ((this.TRSTA==null && other.getTRSTA()==null) || 
             (this.TRSTA!=null &&
              this.TRSTA.equals(other.getTRSTA()))) &&
            ((this.ANZPK==null && other.getANZPK()==null) || 
             (this.ANZPK!=null &&
              this.ANZPK.equals(other.getANZPK()))) &&
            ((this.TRAGR==null && other.getTRAGR()==null) || 
             (this.TRAGR!=null &&
              this.TRAGR.equals(other.getTRAGR()))) &&
            ((this.LGNUM==null && other.getLGNUM()==null) || 
             (this.LGNUM!=null &&
              this.LGNUM.equals(other.getLGNUM()))) &&
            ((this.VSTEL==null && other.getVSTEL()==null) || 
             (this.VSTEL!=null &&
              this.VSTEL.equals(other.getVSTEL()))) &&
            ((this.ROUTE==null && other.getROUTE()==null) || 
             (this.ROUTE!=null &&
              this.ROUTE.equals(other.getROUTE()))) &&
            ((this.AULWE==null && other.getAULWE()==null) || 
             (this.AULWE!=null &&
              this.AULWE.equals(other.getAULWE()))) &&
            ((this.INCO1==null && other.getINCO1()==null) || 
             (this.INCO1!=null &&
              this.INCO1.equals(other.getINCO1()))) &&
            ((this.INCO2==null && other.getINCO2()==null) || 
             (this.INCO2!=null &&
              this.INCO2.equals(other.getINCO2()))) &&
            ((this.BOLNR==null && other.getBOLNR()==null) || 
             (this.BOLNR!=null &&
              this.BOLNR.equals(other.getBOLNR()))) &&
            ((this.XABLN==null && other.getXABLN()==null) || 
             (this.XABLN!=null &&
              this.XABLN.equals(other.getXABLN()))) &&
            ((this.TRATY==null && other.getTRATY()==null) || 
             (this.TRATY!=null &&
              this.TRATY.equals(other.getTRATY()))) &&
            ((this.VSART==null && other.getVSART()==null) || 
             (this.VSART!=null &&
              this.VSART.equals(other.getVSART()))) &&
            ((this.VSBED==null && other.getVSBED()==null) || 
             (this.VSBED!=null &&
              this.VSBED.equals(other.getVSBED()))) &&
            ((this.BTGEW==null && other.getBTGEW()==null) || 
             (this.BTGEW!=null &&
              this.BTGEW.equals(other.getBTGEW()))) &&
            ((this.NTGEW==null && other.getNTGEW()==null) || 
             (this.NTGEW!=null &&
              this.NTGEW.equals(other.getNTGEW()))) &&
            ((this.GEWEI==null && other.getGEWEI()==null) || 
             (this.GEWEI!=null &&
              this.GEWEI.equals(other.getGEWEI()))) &&
            ((this.VOLUM==null && other.getVOLUM()==null) || 
             (this.VOLUM!=null &&
              this.VOLUM.equals(other.getVOLUM()))) &&
            ((this.VOLEH==null && other.getVOLEH()==null) || 
             (this.VOLEH!=null &&
              this.VOLEH.equals(other.getVOLEH()))) &&
            ((this.FAKSK==null && other.getFAKSK()==null) || 
             (this.FAKSK!=null &&
              this.FAKSK.equals(other.getFAKSK()))) &&
            ((this.VKORG==null && other.getVKORG()==null) || 
             (this.VKORG!=null &&
              this.VKORG.equals(other.getVKORG()))) &&
            ((this.VKBUR==null && other.getVKBUR()==null) || 
             (this.VKBUR!=null &&
              this.VKBUR.equals(other.getVKBUR()))) &&
            ((this.ERDAT==null && other.getERDAT()==null) || 
             (this.ERDAT!=null &&
              this.ERDAT.equals(other.getERDAT()))) &&
            ((this.ERZET==null && other.getERZET()==null) || 
             (this.ERZET!=null &&
              this.ERZET.equals(other.getERZET()))) &&
            ((this.AEDAT==null && other.getAEDAT()==null) || 
             (this.AEDAT!=null &&
              this.AEDAT.equals(other.getAEDAT()))) &&
            ((this.ERNAM==null && other.getERNAM()==null) || 
             (this.ERNAM!=null &&
              this.ERNAM.equals(other.getERNAM()))) &&
            ((this.AENAM==null && other.getAENAM()==null) || 
             (this.AENAM!=null &&
              this.AENAM.equals(other.getAENAM()))) &&
            ((this.LPRIO==null && other.getLPRIO()==null) || 
             (this.LPRIO!=null &&
              this.LPRIO.equals(other.getLPRIO()))) &&
            ((this.LIFSK==null && other.getLIFSK()==null) || 
             (this.LIFSK!=null &&
              this.LIFSK.equals(other.getLIFSK()))) &&
            ((this.LFART==null && other.getLFART()==null) || 
             (this.LFART!=null &&
              this.LFART.equals(other.getLFART()))) &&
            ((this.VBTYP==null && other.getVBTYP()==null) || 
             (this.VBTYP!=null &&
              this.VBTYP.equals(other.getVBTYP()))) &&
            ((this.LIFEX==null && other.getLIFEX()==null) || 
             (this.LIFEX!=null &&
              this.LIFEX.equals(other.getLIFEX()))) &&
            ((this.ARRDT==null && other.getARRDT()==null) || 
             (this.ARRDT!=null &&
              this.ARRDT.equals(other.getARRDT()))) &&
            ((this.DTABF==null && other.getDTABF()==null) || 
             (this.DTABF!=null &&
              this.DTABF.equals(other.getDTABF()))) &&
            ((this.POSNR==null && other.getPOSNR()==null) || 
             (this.POSNR!=null &&
              this.POSNR.equals(other.getPOSNR()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.ARKTX==null && other.getARKTX()==null) || 
             (this.ARKTX!=null &&
              this.ARKTX.equals(other.getARKTX()))) &&
            ((this.LFIMG==null && other.getLFIMG()==null) || 
             (this.LFIMG!=null &&
              this.LFIMG.equals(other.getLFIMG()))) &&
            ((this.VRKME==null && other.getVRKME()==null) || 
             (this.VRKME!=null &&
              this.VRKME.equals(other.getVRKME()))) &&
            ((this.UMVKZ==null && other.getUMVKZ()==null) || 
             (this.UMVKZ!=null &&
              this.UMVKZ.equals(other.getUMVKZ()))) &&
            ((this.UMVKN==null && other.getUMVKN()==null) || 
             (this.UMVKN!=null &&
              this.UMVKN.equals(other.getUMVKN()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.LGMNG==null && other.getLGMNG()==null) || 
             (this.LGMNG!=null &&
              this.LGMNG.equals(other.getLGMNG()))) &&
            ((this.KDMAT==null && other.getKDMAT()==null) || 
             (this.KDMAT!=null &&
              this.KDMAT.equals(other.getKDMAT()))) &&
            ((this.LADGR==null && other.getLADGR()==null) || 
             (this.LADGR!=null &&
              this.LADGR.equals(other.getLADGR()))) &&
            ((this.RAUBE==null && other.getRAUBE()==null) || 
             (this.RAUBE!=null &&
              this.RAUBE.equals(other.getRAUBE()))) &&
            ((this.PIKMG==null && other.getPIKMG()==null) || 
             (this.PIKMG!=null &&
              this.PIKMG.equals(other.getPIKMG()))) &&
            ((this.VERPR==null && other.getVERPR()==null) || 
             (this.VERPR!=null &&
              this.VERPR.equals(other.getVERPR()))) &&
            ((this.STPRS==null && other.getSTPRS()==null) || 
             (this.STPRS!=null &&
              this.STPRS.equals(other.getSTPRS()))) &&
            ((this.PEINH==null && other.getPEINH()==null) || 
             (this.PEINH!=null &&
              this.PEINH.equals(other.getPEINH()))) &&
            ((this.BRGEW==null && other.getBRGEW()==null) || 
             (this.BRGEW!=null &&
              this.BRGEW.equals(other.getBRGEW()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.FAKSP==null && other.getFAKSP()==null) || 
             (this.FAKSP!=null &&
              this.FAKSP.equals(other.getFAKSP()))) &&
            ((this.KOSTL==null && other.getKOSTL()==null) || 
             (this.KOSTL!=null &&
              this.KOSTL.equals(other.getKOSTL()))) &&
            ((this.VGBEL==null && other.getVGBEL()==null) || 
             (this.VGBEL!=null &&
              this.VGBEL.equals(other.getVGBEL()))) &&
            ((this.VGPOS==null && other.getVGPOS()==null) || 
             (this.VGPOS!=null &&
              this.VGPOS.equals(other.getVGPOS()))) &&
            ((this.VGTYP==null && other.getVGTYP()==null) || 
             (this.VGTYP!=null &&
              this.VGTYP.equals(other.getVGTYP()))) &&
            ((this.VTWEG==null && other.getVTWEG()==null) || 
             (this.VTWEG!=null &&
              this.VTWEG.equals(other.getVTWEG()))) &&
            ((this.SPART==null && other.getSPART()==null) || 
             (this.SPART!=null &&
              this.SPART.equals(other.getSPART()))) &&
            ((this.BRGEW_ITM==null && other.getBRGEW_ITM()==null) || 
             (this.BRGEW_ITM!=null &&
              this.BRGEW_ITM.equals(other.getBRGEW_ITM()))) &&
            ((this.NTGEW_ITM==null && other.getNTGEW_ITM()==null) || 
             (this.NTGEW_ITM!=null &&
              this.NTGEW_ITM.equals(other.getNTGEW_ITM()))) &&
            ((this.GEWEI_ITM==null && other.getGEWEI_ITM()==null) || 
             (this.GEWEI_ITM!=null &&
              this.GEWEI_ITM.equals(other.getGEWEI_ITM()))) &&
            ((this.VOLUM_ITM==null && other.getVOLUM_ITM()==null) || 
             (this.VOLUM_ITM!=null &&
              this.VOLUM_ITM.equals(other.getVOLUM_ITM()))) &&
            ((this.VOLEH_ITM==null && other.getVOLEH_ITM()==null) || 
             (this.VOLEH_ITM!=null &&
              this.VOLEH_ITM.equals(other.getVOLEH_ITM())));
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
        if (getPSPID() != null) {
            _hashCode += getPSPID().hashCode();
        }
        if (getPOST1() != null) {
            _hashCode += getPOST1().hashCode();
        }
        if (getPOSID() != null) {
            _hashCode += getPOSID().hashCode();
        }
        if (getPOST1_WBS() != null) {
            _hashCode += getPOST1_WBS().hashCode();
        }
        if (getKUNNR() != null) {
            _hashCode += getKUNNR().hashCode();
        }
        if (getTXTWE() != null) {
            _hashCode += getTXTWE().hashCode();
        }
        if (getVBELN() != null) {
            _hashCode += getVBELN().hashCode();
        }
        if (getCOUNTRY() != null) {
            _hashCode += getCOUNTRY().hashCode();
        }
        if (getSTREET() != null) {
            _hashCode += getSTREET().hashCode();
        }
        if (getCITY1() != null) {
            _hashCode += getCITY1().hashCode();
        }
        if (getREGION() != null) {
            _hashCode += getREGION().hashCode();
        }
        if (getKODAT() != null) {
            _hashCode += getKODAT().hashCode();
        }
        if (getERDAT_PAK() != null) {
            _hashCode += getERDAT_PAK().hashCode();
        }
        if (getWADAT() != null) {
            _hashCode += getWADAT().hashCode();
        }
        if (getWADAT_IST() != null) {
            _hashCode += getWADAT_IST().hashCode();
        }
        if (getWBSTK() != null) {
            _hashCode += getWBSTK().hashCode();
        }
        if (getCMGST() != null) {
            _hashCode += getCMGST().hashCode();
        }
        if (getPKSTK() != null) {
            _hashCode += getPKSTK().hashCode();
        }
        if (getKOSTK() != null) {
            _hashCode += getKOSTK().hashCode();
        }
        if (getFKSTK() != null) {
            _hashCode += getFKSTK().hashCode();
        }
        if (getTRSTA() != null) {
            _hashCode += getTRSTA().hashCode();
        }
        if (getANZPK() != null) {
            _hashCode += getANZPK().hashCode();
        }
        if (getTRAGR() != null) {
            _hashCode += getTRAGR().hashCode();
        }
        if (getLGNUM() != null) {
            _hashCode += getLGNUM().hashCode();
        }
        if (getVSTEL() != null) {
            _hashCode += getVSTEL().hashCode();
        }
        if (getROUTE() != null) {
            _hashCode += getROUTE().hashCode();
        }
        if (getAULWE() != null) {
            _hashCode += getAULWE().hashCode();
        }
        if (getINCO1() != null) {
            _hashCode += getINCO1().hashCode();
        }
        if (getINCO2() != null) {
            _hashCode += getINCO2().hashCode();
        }
        if (getBOLNR() != null) {
            _hashCode += getBOLNR().hashCode();
        }
        if (getXABLN() != null) {
            _hashCode += getXABLN().hashCode();
        }
        if (getTRATY() != null) {
            _hashCode += getTRATY().hashCode();
        }
        if (getVSART() != null) {
            _hashCode += getVSART().hashCode();
        }
        if (getVSBED() != null) {
            _hashCode += getVSBED().hashCode();
        }
        if (getBTGEW() != null) {
            _hashCode += getBTGEW().hashCode();
        }
        if (getNTGEW() != null) {
            _hashCode += getNTGEW().hashCode();
        }
        if (getGEWEI() != null) {
            _hashCode += getGEWEI().hashCode();
        }
        if (getVOLUM() != null) {
            _hashCode += getVOLUM().hashCode();
        }
        if (getVOLEH() != null) {
            _hashCode += getVOLEH().hashCode();
        }
        if (getFAKSK() != null) {
            _hashCode += getFAKSK().hashCode();
        }
        if (getVKORG() != null) {
            _hashCode += getVKORG().hashCode();
        }
        if (getVKBUR() != null) {
            _hashCode += getVKBUR().hashCode();
        }
        if (getERDAT() != null) {
            _hashCode += getERDAT().hashCode();
        }
        if (getERZET() != null) {
            _hashCode += getERZET().hashCode();
        }
        if (getAEDAT() != null) {
            _hashCode += getAEDAT().hashCode();
        }
        if (getERNAM() != null) {
            _hashCode += getERNAM().hashCode();
        }
        if (getAENAM() != null) {
            _hashCode += getAENAM().hashCode();
        }
        if (getLPRIO() != null) {
            _hashCode += getLPRIO().hashCode();
        }
        if (getLIFSK() != null) {
            _hashCode += getLIFSK().hashCode();
        }
        if (getLFART() != null) {
            _hashCode += getLFART().hashCode();
        }
        if (getVBTYP() != null) {
            _hashCode += getVBTYP().hashCode();
        }
        if (getLIFEX() != null) {
            _hashCode += getLIFEX().hashCode();
        }
        if (getARRDT() != null) {
            _hashCode += getARRDT().hashCode();
        }
        if (getDTABF() != null) {
            _hashCode += getDTABF().hashCode();
        }
        if (getPOSNR() != null) {
            _hashCode += getPOSNR().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getARKTX() != null) {
            _hashCode += getARKTX().hashCode();
        }
        if (getLFIMG() != null) {
            _hashCode += getLFIMG().hashCode();
        }
        if (getVRKME() != null) {
            _hashCode += getVRKME().hashCode();
        }
        if (getUMVKZ() != null) {
            _hashCode += getUMVKZ().hashCode();
        }
        if (getUMVKN() != null) {
            _hashCode += getUMVKN().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getLGMNG() != null) {
            _hashCode += getLGMNG().hashCode();
        }
        if (getKDMAT() != null) {
            _hashCode += getKDMAT().hashCode();
        }
        if (getLADGR() != null) {
            _hashCode += getLADGR().hashCode();
        }
        if (getRAUBE() != null) {
            _hashCode += getRAUBE().hashCode();
        }
        if (getPIKMG() != null) {
            _hashCode += getPIKMG().hashCode();
        }
        if (getVERPR() != null) {
            _hashCode += getVERPR().hashCode();
        }
        if (getSTPRS() != null) {
            _hashCode += getSTPRS().hashCode();
        }
        if (getPEINH() != null) {
            _hashCode += getPEINH().hashCode();
        }
        if (getBRGEW() != null) {
            _hashCode += getBRGEW().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getFAKSP() != null) {
            _hashCode += getFAKSP().hashCode();
        }
        if (getKOSTL() != null) {
            _hashCode += getKOSTL().hashCode();
        }
        if (getVGBEL() != null) {
            _hashCode += getVGBEL().hashCode();
        }
        if (getVGPOS() != null) {
            _hashCode += getVGPOS().hashCode();
        }
        if (getVGTYP() != null) {
            _hashCode += getVGTYP().hashCode();
        }
        if (getVTWEG() != null) {
            _hashCode += getVTWEG().hashCode();
        }
        if (getSPART() != null) {
            _hashCode += getSPART().hashCode();
        }
        if (getBRGEW_ITM() != null) {
            _hashCode += getBRGEW_ITM().hashCode();
        }
        if (getNTGEW_ITM() != null) {
            _hashCode += getNTGEW_ITM().hashCode();
        }
        if (getGEWEI_ITM() != null) {
            _hashCode += getGEWEI_ITM().hashCode();
        }
        if (getVOLUM_ITM() != null) {
            _hashCode += getVOLUM_ITM().hashCode();
        }
        if (getVOLEH_ITM() != null) {
            _hashCode += getVOLEH_ITM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_Delivery_RespDeliverylist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ecc/sd/api/getdelivery", ">DT_Delivery_Resp>Deliverylist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSPID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PSPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POST1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POST1"));
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
        elemField.setFieldName("POST1_WBS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POST1_WBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KUNNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KUNNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXTWE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TXTWE"));
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
        elemField.setFieldName("COUNTRY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COUNTRY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STREET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STREET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CITY1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REGION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KODAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KODAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERDAT_PAK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERDAT_PAK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WADAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WADAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WADAT_IST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WADAT_IST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WBSTK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WBSTK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMGST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMGST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKSTK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PKSTK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KOSTK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KOSTK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FKSTK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FKSTK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRSTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRSTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANZPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ANZPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRAGR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRAGR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VSTEL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VSTEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROUTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ROUTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AULWE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AULWE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCO1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INCO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCO2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INCO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BOLNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BOLNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XABLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XABLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRATY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRATY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VSART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VSART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VSBED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VSBED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BTGEW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BTGEW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTGEW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NTGEW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GEWEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GEWEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VOLUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VOLUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VOLEH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VOLEH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAKSK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FAKSK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKBUR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKBUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERZET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERZET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AEDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AEDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERNAM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERNAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AENAM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AENAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LPRIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LPRIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIFSK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LIFSK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LFART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LFART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VBTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VBTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIFEX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LIFEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARRDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ARRDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTABF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DTABF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POSNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARKTX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ARKTX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LFIMG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LFIMG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRKME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VRKME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UMVKZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UMVKZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UMVKN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UMVKN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGMNG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGMNG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KDMAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KDMAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LADGR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LADGR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RAUBE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RAUBE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIKMG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PIKMG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERPR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VERPR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STPRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STPRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PEINH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PEINH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRGEW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRGEW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAKSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FAKSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KOSTL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KOSTL"));
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
        elemField.setFieldName("VGPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VGPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VGTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VGTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTWEG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VTWEG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRGEW_ITM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRGEW_ITM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTGEW_ITM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NTGEW_ITM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GEWEI_ITM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GEWEI_ITM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VOLUM_ITM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VOLUM_ITM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VOLEH_ITM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VOLEH_ITM"));
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
