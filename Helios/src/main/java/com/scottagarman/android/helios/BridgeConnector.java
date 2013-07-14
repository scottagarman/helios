package com.scottagarman.android.helios;

import android.util.Log;

import com.scottagarman.android.helios.api.hueapi.models.HueBridgeModel;
import com.scottagarman.android.helios.api.huebridgeapi.BridgeApi;
import com.scottagarman.android.helios.api.huebridgeapi.BridgeApiService;
import com.scottagarman.android.helios.api.huebridgeapi.models.DeviceUser;
import com.scottagarman.android.helios.api.huebridgeapi.models.DeviceUserResponse;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by scottagarman on 7/13/13.
 */
public class BridgeConnector  {

    private static final String DEVICE_TYPE = null;
//    private static final String DEVICE_TYPE = "android";
    private static final String USER_NAME = null;
//    private static final String USER_NAME = "helios";

    public void authenticateToBridge(HueBridgeModel model) {
        BridgeApiService bridgeApiService = BridgeApi.getBridgeApiService(model);
        bridgeApiService.createUser(DeviceUser.createDeviceUser(DEVICE_TYPE, USER_NAME), new Callback<DeviceUserResponse>() {
            @Override
            public void success(DeviceUserResponse deviceUserResponse, Response response) {
                Log.d("Helios/", deviceUserResponse.getError().toString());
            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
    }

    public void checkIfAuthenticatedToBridge(HueBridgeModel model) {

    }
}
