package cn.tt.client;

import android.content.Intent;
import android.widget.Toast;

import co.bxvip.sdk.ui.BxStartActivityImpl;
import io.dcloud.PandoraEntry;
import io.dcloud.PandoraEntryActivity;

public class SplashActivity extends BxStartActivityImpl {

    private boolean isStartActivity;

    @Override
    public void toYourMainActivity() {
        if (!isStartActivity) {
            isStartActivity = true;
            startActivity(new Intent(this, PandoraEntry.class));
        }else {
//            Toast.makeText(this, "进入失败!", Toast.LENGTH_LONG).show();
        }
        finish();
    }

}

