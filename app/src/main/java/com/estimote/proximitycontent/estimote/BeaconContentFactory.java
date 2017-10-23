package com.estimote.proximitycontent.estimote;

public interface BeaconContentFactory {

    void getContent(String deviceID, Callback callback);

    interface Callback {
        void onContentReady(Object content);
    }
}
