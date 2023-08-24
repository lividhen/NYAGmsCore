package com.nyagoogle.android.gms.cast.framework.media;

import com.nyagoogle.android.gms.common.images.WebImage;
import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IImagePicker {
  // WebImage onPickImage(MediaMetadata metadata, int int1) = 0;
  IObjectWrapper getWrappedClientObject() = 1;
  int unknown1() = 2;
  // WebImage onPickImage(MediaMetadata metadata, ImageHints imageHints) = 3;
}
