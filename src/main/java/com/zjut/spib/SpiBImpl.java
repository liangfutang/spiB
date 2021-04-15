package com.zjut.spib;

import com.zjut.spiinterface.SpiModelInterface;

public class SpiBImpl implements SpiModelInterface {

    @Override
    public void helloSpi() {
        System.out.println("B============ say hello");
    }
}
