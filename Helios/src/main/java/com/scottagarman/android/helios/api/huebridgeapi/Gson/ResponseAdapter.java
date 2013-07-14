package com.scottagarman.android.helios.api.huebridgeapi.Gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

// http://stackoverflow.com/questions/17627869/simple-way-to-strip-outer-array-of-responses-in-gson
public class ResponseAdapter<T> extends TypeAdapter<T> {

    protected TypeAdapter<T> defaultAdapter;

    public ResponseAdapter(TypeAdapter<T> defaultAdapter) {
        this.defaultAdapter = defaultAdapter;
    }

    @Override
    public void write(JsonWriter out, T value) throws IOException {
        defaultAdapter.write(out, value);
    }

    @Override
    public T read(JsonReader in) throws IOException {
        in.beginArray();
        assert(in.hasNext());
        T response = defaultAdapter.read(in);
        in.endArray();
        return response;
    }

}
