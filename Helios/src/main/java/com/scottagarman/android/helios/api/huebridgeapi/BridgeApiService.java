package com.scottagarman.android.helios.api.huebridgeapi;
import com.scottagarman.android.helios.api.huebridgeapi.models.DeviceUser;
import com.scottagarman.android.helios.api.huebridgeapi.models.DeviceUserResponse;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by scottagarman on 7/12/13.
 */
public interface BridgeApiService {

    @POST("/")
    void createUser(@Body DeviceUser deviceUser, Callback<ArrayList<DeviceUserResponse>> callback);
}
