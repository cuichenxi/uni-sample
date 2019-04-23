package cn.tt.client;

import android.content.Intent;

import co.bxvip.sdk.ui.BxStartActivityImpl;
import io.dcloud.PandoraEntry;

public class SplashActivity extends BxStartActivityImpl {

    private boolean isStartActivity;

    @Override
    public void toYourMainActivity() {
        if (!isStartActivity) {
            isStartActivity = true;
            startActivity(new Intent(this, PandoraEntry.class));
        }
        finish();
    }

}

