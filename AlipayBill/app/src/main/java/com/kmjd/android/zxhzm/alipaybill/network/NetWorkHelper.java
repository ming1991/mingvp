package com.kmjd.android.zxhzm.alipaybill.network;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkHelper {

    public static Retrofit getmRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(NetWorkInterface.HOST)
                .addConverterFactory(StringConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getOkHttpClient())
                .build();
    }

    private static OkHttpClient getOkHttpClient() {

        return new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    Request request = null;

                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        request = chain.request()
                                .newBuilder()
                                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                                .header("Connection", "keep-alive")
                                .header("Accept", "*/*")
                                .build();
                        return chain.proceed(request);
                    }

                }).connectTimeout(3, TimeUnit.SECONDS)
                .build();
    }
}
