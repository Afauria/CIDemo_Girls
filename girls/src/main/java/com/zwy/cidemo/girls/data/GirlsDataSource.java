package com.zwy.cidemo.girls.data;


import com.zwy.cidemo.girls.data.bean.GirlsParser;

public interface GirlsDataSource {

    interface LoadGirlsCallback {

        void onGirlsLoaded(GirlsParser girlsParser);

        void onDataNotAvailable();
    }

    void getGirls(int size, int page, LoadGirlsCallback callback);

}
