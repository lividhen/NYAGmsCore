package com.nyagoogle.android.gms.maps.model.internal;

import com.nyagoogle.android.gms.maps.model.Tile;

interface ITileProviderDelegate {
    Tile getTile(int x, int y, int zoom);
}
