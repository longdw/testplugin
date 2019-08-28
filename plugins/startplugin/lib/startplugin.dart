import 'dart:async';

import 'package:flutter/services.dart';

class Startplugin {
  static const MethodChannel _channel =
      const MethodChannel('startplugin');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<String> startActivityForResult() async {
    String str = await _channel.invokeMethod('startActivityForResult');
    return str;
  }
}
