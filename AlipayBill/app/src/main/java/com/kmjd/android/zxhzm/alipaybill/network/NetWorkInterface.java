package com.kmjd.android.zxhzm.alipaybill.network;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface NetWorkInterface {

    String HOST = "";
    @POST("")
    @FormUrlEncoded
    Call<String> toUploadAlipayBill(@FieldMap HashMap<String, String> fieldMap);
}
