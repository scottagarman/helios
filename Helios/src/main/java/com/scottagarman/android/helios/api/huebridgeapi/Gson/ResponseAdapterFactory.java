package com.scottagarman.android.helios.api.huebridgeapi.Gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import retrofit.client.Response;

// http://stackoverflow.com/questions/17627869/simple-way-to-strip-outer-array-of-responses-in-gson
public class ResponseAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        if ((type.getRawType().getSuperclass() != BaseArrayResponse.class)) return null;

        TypeAdapter<T> defaultAdapter = (TypeAdapter<T>) gson.getDelegateAdapter(this, type);
        return (TypeAdapter<T>) new ResponseAdapter<T>(defaultAdapter);
    }

}
