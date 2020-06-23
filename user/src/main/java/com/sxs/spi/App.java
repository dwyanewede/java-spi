package com.sxs.spi;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App{

    /**
     * 测试口罩种类
     * @param args
     */
    public static void main( String[] args ){

        ServiceLoader<MaskInterface> maskLoader = ServiceLoader.load(MaskInterface.class);
        for (MaskInterface mask : maskLoader) {
            System.err.println(mask.getMask());
        }

    }
}
