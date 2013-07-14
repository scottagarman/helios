package com.scottagarman.android.helios.api.hueapi;

import android.util.Log;

import retrofit.RestAdapter;

/**
 * Created by scottagarman on 7/12/13.
 */
public class HueApi {
    private static final String API_URL = "http://www.meethue.com/api";

    public static HueApiService getHueApiService() {
        return getHueApiRestAdapter().create(HueApiService.class);
    }

    private static RestAdapter getHueApiRestAdapter() {
        return new RestAdapter.Builder()
                .setServer(HueApi.API_URL) // The base API endpoint.
//                .setDebug(true)
//                .setLog(new RestAdapter.Log() {
//                    @Override
//                    public void log(String s) {
//                        Log.d("Helios/retrofit", s);
//                    }
//                })
                .build();
    }
}
