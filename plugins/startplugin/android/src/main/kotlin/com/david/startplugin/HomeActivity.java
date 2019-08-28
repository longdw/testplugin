package com.david.startplugin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * @author longdw
 * 2019-08-28 15:04
 * www.longdw.com
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_activity);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(200);
                finish();
            }
        });
    }
}
