package com.scottagarman.android.helios.api.hueapi.models;

/**
 * Created by scottagarman on 7/12/13.
 */
public class HueBridgeModel {
    private String id;
    private String internalipaddress;
    private String macaddress;

    public String getId() {
        return id;
    }

    public String getInternalipaddress() {
        return internalipaddress;
    }

    public String getMacaddress() {
        return macaddress;
    }

    /*
    id: "001788fffe0951b5",
    internalipaddress: "192.168.11.48",
    macaddress: "00:17:88:09:51:b5"
     */
}
