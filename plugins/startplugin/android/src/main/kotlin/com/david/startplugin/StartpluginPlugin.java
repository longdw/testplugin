package com.david.startplugin;

import android.app.Activity;
import android.content.Intent;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/**
 * @author longdw
 * 2019-08-28 15:00
 * www.longdw.com
 */
public class StartpluginPlugin implements MethodChannel.MethodCallHandler, PluginRegistry.ActivityResultListener {

    Activity mActivity;

    MethodChannel.Result mResult;

    StartpluginPlugin(Activity activity) {
        mActivity = activity;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {

        MethodChannel channel = new MethodChannel(registrar.messenger(), "startplugin");
        StartpluginPlugin plugin = new StartpluginPlugin(registrar.activity());
        registrar.addActivityResultListener(plugin);
        channel.setMethodCallHandler(plugin);
    }

    @Override
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {

        mResult = result;

        if (methodCall.method.equals("startActivityForResult")) {
            mActivity.startActivityForResult(new Intent(mActivity, HomeActivity.class), 100);
        } else {
            result.notImplemented();
        }
    }

    @Override
    public boolean onActivityResult(int requestCode, int resultCode, Intent intent) {

        if (requestCode == 100) {
            mResult.success("123");
        }

        return false;
    }
}
