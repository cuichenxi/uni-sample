//package cn.tt.client;
//
//import android.content.Context;
//import android.support.multidex.MultiDex;
//
//import com.HBuilder.integrate.BuildConfig;
//import com.HBuilder.integrate.R;
//
//import cn.jpush.android.api.CustomPushNotificationBuilder;
//import cn.jpush.android.api.JPushInterface;
//import co.bxvip.sdk.BxRePluginAppLicationMakeImpl;
//import io.dcloud.common.adapter.util.UEH;
//import io.dcloud.common.util.BaseInfo;
//import io.dcloud.common.util.PdrUtil;
//
//public class BaseApp1 extends BxRePluginAppLicationMakeImpl {
//
//
//    public boolean isQihooTrafficFreeValidate = true;
//    private static BaseApp1 b;
//    private static Context c = null;
//
//    public BaseApp1() {
//    }
//
//    public static Context getInstance() {
//        return c;
//    }
//
//    public static void setInstance(Context var0) {
//        if (c == null) {
//            c = var0;
//        }
//    }
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        PdrUtil.closeAndroidPDialog();
//        BaseInfo.initWeex(this);
//        io.dcloud.a.a(this);
//        BaseInfo.sAppIsTests.init(this.getBaseContext());
//        setInstance(this.getApplicationContext());
//        UEH.catchUncaughtException(this.getApplicationContext());
//    }
//
//    @Override
//    public void initJPushYouNeed() {
//        JPushInterface.setDebugMode(BuildConfig.DEBUG);    // 设置开启日志,发布时请关闭日志
//        JPushInterface.init(this);                         // 初始化 JPush
//        CustomPushNotificationBuilder builder = new CustomPushNotificationBuilder(this, R.layout.customer_notitfication_layout, R.id.icon, R.id.title, R.id.text);
//        builder.layoutIconDrawable = R.mipmap.logo;
//        builder.developerArg0 = "developerArg2";
//        JPushInterface.setDefaultPushNotificationBuilder(builder);
//    }
//
//    @Override
//    public void initRePluginYourNeed() {
//
//    }
//
//    protected void attachBaseContext(Context var1) {
//        super.attachBaseContext(var1);
//        MultiDex.install(this);
//        io.dcloud.a.a(var1);
//    }
//}
//
