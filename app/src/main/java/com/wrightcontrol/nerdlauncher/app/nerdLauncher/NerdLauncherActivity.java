package com.wrightcontrol.nerdlauncher.app.nerdLauncher;

import android.support.v4.app.Fragment;
import com.wrightcontrol.nerdlauncher.app.R;
import com.wrightcontrol.nerdlauncher.app.abstractMain.SingleFragmentActivity;

public class NerdLauncherActivity extends SingleFragmentActivity {


    @Override
    protected int getLayout() {
        return R.layout.fragment_container;
    }

    @Override
    protected int getContainerID() {
        return R.id.fragment_container;
    }

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
