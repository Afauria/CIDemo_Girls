package com.zwy.cidemo.girls;

import android.support.annotation.Keep;

import com.zwy.cidemo.base.base.IApplicationDelegate;
import com.zwy.cidemo.base.base.ViewManager;

@Keep
public class MyDelegate implements IApplicationDelegate {

    @Override
    public void onCreate() {
        //主动添加
        ViewManager.getInstance().addFragment(0, GirlsFragment.newInstance());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
