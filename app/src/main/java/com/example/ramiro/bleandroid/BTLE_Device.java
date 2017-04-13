package com.example.ramiro.bleandroid;

/**
 * Created by Ramiro on 5-4-2017.
 */

import android.bluetooth.BluetoothDevice;

public class BTLE_Device {

    private BluetoothDevice bluetoothDevice;
    private int rssi;
    private String adv;
    private int distance;

    public BTLE_Device(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public String getAddress() {
        return bluetoothDevice.getAddress();
    }

    public String getName() {
        return bluetoothDevice.getName();
    }

    public void setRSSI(int rssi) {
        this.rssi = rssi;
    }

    public int getRSSI() {
        return rssi;
    }

    public void setDistance(int distance){this.distance = distance;}

    public int getDistance(){ return distance;}

    public String getAdv(){return adv;}

    public void setAdv(String adv){this.adv = adv;}
}