package com.falldang.developer.video;

import android.app.Application;

import com.tencent.ugc.TXUGCBase;

public class VideoApplication extends Application {

    private final String ugcKey = "bb50727da498314c4b5c865e295cd316";
    private final String ugcLicenceUrl = "http://license.vod2.myqcloud.com/license/v1/06c32f0d4723481185d689bc8c7fbe63/TXUgcSDK.licence";

    @Override
    public void onCreate() {
        super.onCreate();

        // 短视频licence设置
        TXUGCBase.getInstance().setLicence(this, ugcLicenceUrl, ugcKey);
    }
}
