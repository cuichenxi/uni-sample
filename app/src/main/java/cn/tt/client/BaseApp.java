//package cn.tt.client;
//
//import android.content.Context;
//import android.content.res.Configuration;
//
//import com.HBuilder.integrate.BuildConfig;
//import com.HBuilder.integrate.R;
//import com.qihoo360.replugin.RePlugin;
//
//import cn.jpush.android.api.CustomPushNotificationBuilder;
//import cn.jpush.android.api.JPushInterface;
//import io.dcloud.application.DCloudApplication;
//
//public class BaseApp extends DCloudApplication {
//
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        RePlugin.App.onCreate();
//        JPushInterface.setDebugMode(BuildConfig.DEBUG);    // 设置开启日志,发布时请关闭日志
//        JPushInterface.init(this);                         // 初始化 JPush
//        CustomPushNotificationBuilder builder = new CustomPushNotificationBuilder(this, R.layout.customer_notitfication_layout, R.id.icon, R.id.title, R.id.text);
//        builder.layoutIconDrawable = R.mipmap.logo;
//        builder.developerArg0 = "developerArg2";
//        JPushInterface.setDefaultPushNotificationBuilder(builder);
//
//    }
//
//
//    protected void attachBaseContext(Context var1) {
//        super.attachBaseContext(var1);
//        RePlugin.App.attachBaseContext(this);
//    }
//
//    @Override
//    public void onLowMemory() {
//        super.onLowMemory();
//
//        /* Not need to be called if your application's minSdkVersion > = 14 */
//        RePlugin.App.onLowMemory();
//    }
//
//    @Override
//    public void onTrimMemory(int level) {
//        super.onTrimMemory(level);
//
//        /* Not need to be called if your application's minSdkVersion > = 14 */
//        RePlugin.App.onTrimMemory(level);
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration config) {
//        super.onConfigurationChanged(config);
//
//        /* Not need to be called if your application's minSdkVersion > = 14 */
//        RePlugin.App.onConfigurationChanged(config);
//    }
//}