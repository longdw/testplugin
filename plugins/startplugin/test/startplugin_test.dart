import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:startplugin/startplugin.dart';

void main() {
  const MethodChannel channel = MethodChannel('startplugin');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await Startplugin.platformVersion, '42');
  });
}
