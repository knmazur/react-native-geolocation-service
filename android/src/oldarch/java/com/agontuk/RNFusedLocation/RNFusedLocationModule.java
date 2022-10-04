package com.agontuk.RNFusedLocation;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

import java.util.HashMap;
import java.util.Set;

public class RNFusedLocationModule extends ReactContextBaseJavaModule {
  private RNFusedLocationModuleImpl delegate;

  public RNFusedLocationModule(ReactApplicationContext reactContext) {
    super(reactContext);
    delegate = new RNFusedLocationModuleImpl(reactContext);
  }

  @NonNull
  @Override
  public String getName() {
    return RNFusedLocationModuleImpl.TAG;
  }

  @ReactMethod
  public void getCurrentPosition(ReadableMap options, final Callback success, final Callback error) {
    delegate.getCurrentPosition(options, success, error);
  }

  @ReactMethod
  public void startObserving(ReadableMap options) {
    delegate.startObserving(options);
  }

  @ReactMethod
  public void stopObserving() {
    delegate.stopObserving();
  }

  @ReactMethod
  public void addListener(String eventName) {
    // Keep: Required for RN built in Event Emitter Calls.
  }

  @ReactMethod
  public void removeListeners(Integer count) {
    // Keep: Required for RN built in Event Emitter Calls.
  }
}
