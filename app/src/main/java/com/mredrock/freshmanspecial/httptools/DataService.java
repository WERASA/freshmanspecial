package com.mredrock.freshmanspecial.httptools;

import com.mredrock.freshmanspecial.data.FailRatio;
import com.mredrock.freshmanspecial.data.QQGroupNumber;
import com.mredrock.freshmanspecial.data.WorkRatio;
import com.mredrock.freshmanspecial.httptools.HttpResult;
import com.mredrock.freshmanspecial.data.SexRatio;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by 700-15isk on 2017/8/6.
 */

public interface DataService<T> {
    @FormUrlEncoded
    @POST("SexRatio")
    Observable<HttpResult<List<SexRatio>>> postSexRatio(@Field("RequestType") String dataName);

    @FormUrlEncoded
    @POST("FailRatio")
    Observable<HttpResult<List<FailRatio>>> postFailRatio(@Field("RequestType") String dataName);

    @FormUrlEncoded
    @POST("QQGroupNumber")
    Observable<HttpResult<List<QQGroupNumber>>> postQQGroupNumber(@Field("RequestType") String dataName);


    @FormUrlEncoded
    @POST("WorkRatio")
    Observable<HttpResult<List<WorkRatio>>> postWorkRatio(@Field("RequestType") String dataName);

}
