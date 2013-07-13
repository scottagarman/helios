package com.scottagarman.android.helios.api.hueapi;

import com.scottagarman.android.helios.api.hueapi.models.HueBridgeModel;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by scottagarman on 7/12/13.
 */
public interface HueApiService {

    /**
     * Get listBridges
     *
     * @return ArrayList<HueBridgeModel> bridges
     */
    @GET("/nupnp")
    void listBridges(Callback<ArrayList<HueBridgeModel>> callback);

}
