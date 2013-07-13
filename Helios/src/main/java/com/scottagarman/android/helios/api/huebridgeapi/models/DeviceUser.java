package com.scottagarman.android.helios.api.huebridgeapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by scottagarman on 7/12/13.
 */
public class DeviceUser {
    @SerializedName("devicetype") private String deviceType;
    @SerializedName("username") private String userName;

    private DeviceUser(String deviceType, String userName) {
        this.deviceType = deviceType;
        this.userName = userName;
    }

    public static DeviceUser createDeviceUser(String deviceType, String userName) {
        return new DeviceUser(deviceType, userName);
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
