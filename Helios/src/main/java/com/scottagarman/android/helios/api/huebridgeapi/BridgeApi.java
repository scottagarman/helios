package com.scottagarman.android.helios.api.huebridgeapi;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.scottagarman.android.helios.api.hueapi.HueApiService;
import com.scottagarman.android.helios.api.hueapi.models.HueBridgeModel;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by scottagarman on 7/12/13.
 */
public class BridgeApi {
    public static BridgeApiService getBridgeApiService(HueBridgeModel bridge) {
        return getBridgeApiRestAdapter(bridge).create(BridgeApiService.class);
    }

    private static RestAdapter getBridgeApiRestAdapter(HueBridgeModel bridge) {
        return new RestAdapter.Builder()
                .setServer(createApiBase(bridge.getInternalipaddress())) // The base API endpoint.
                .setDebug(true)
                .setLog(new RestAdapter.Log() {
                    @Override
                    public void log(String s) {
                        Log.d("Helios/retrofit", s);
                    }
                })
                .build();
    }

    private static String createApiBase(String ipAddress) {
        return "http://" + ipAddress + "/api";
    }
}
