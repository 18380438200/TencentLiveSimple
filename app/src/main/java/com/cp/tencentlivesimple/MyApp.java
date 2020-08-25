package com.cp.tencentlivesimple;

import android.app.Application;
import com.tencent.rtmp.TXLiveBase;

/**
 * create by libo
 * create on 2019-10-29
 * description
 */
public class MyApp extends Application {
    private final String licenseUrl = "https://license.vod2.myqcloud.com/license/v1/efe383ffdf817546f8c063b9d08a6854/TXLiveSDK.licence";
    private final String licenseKey = "c44a5938e501583897ed77f60b2d5690";

    @Override
    public void onCreate() {
        super.onCreate();

        //腾讯云初始化
        TXLiveBase.getInstance().setLicence(this, licenseUrl, licenseKey);
    }

}