package cn.tt.client;

import android.content.Intent;
import android.os.Bundle;

import co.bxvip.sdk.ui.BxStartActivityImpl;
import io.dcloud.PandoraEntry;

public class SplashActivity1 extends BxStartActivityImpl {

    private boolean isStartActivity;

    @Override
    public void toYourMainActivity() {
        if (isStartActivity) {
            return;
        }
        isStartActivity = true;
        startActivity(new Intent(this, PandoraEntry.class));
//        boolean startActivity = RePlugin.startActivity(this,
//                RePlugin.createIntent("com.xiaoyong.gjp",
//                        "io.dcloud.PandoraEntryActivity"));
//        if (startActivity) {
//            finish();
//        } else {
//            Toast.makeText(this, "启动失败", Toast.LENGTH_LONG).show();
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 跳转插件
     */

    @Override
    public boolean hideLoadingShow() {
        return super.hideLoadingShow();
    }

    @Override
    public boolean hideVersionShow() {
        return super.hideVersionShow();
    }

    @Override
    public boolean noNetworkJumpYourActivity() {
        return super.noNetworkJumpYourActivity();
    }

    @Override
    public boolean notCheckPermission() {
        return super.notCheckPermission();
    }

}

