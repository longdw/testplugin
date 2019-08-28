#import "StartpluginPlugin.h"
#import <startplugin/startplugin-Swift.h>

@implementation StartpluginPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftStartpluginPlugin registerWithRegistrar:registrar];
}
@end
