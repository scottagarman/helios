package com.scottagarman.android.helios.api.huebridgeapi.models;

import com.scottagarman.android.helios.api.huebridgeapi.Gson.BaseArrayResponse;

/**
 * Created by scottagarman on 7/12/13.
 */
public class DeviceUserResponse extends BaseArrayResponse {
    private DeviceUser success;
    private Error error;

    public DeviceUser getSuccess() {
        return success;
    }

    public Error getError() {
        return error;
    }

    public static class Error {
        private int type;
        private String address;
        private String description;

        public int getType() {
            return type;
        }

        public String getAddress() {
            return address;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Type: " + this.type
                    + " Address: " + this.address
                    + " Description: " + this.description;
        }
    }
}
