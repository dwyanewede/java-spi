package com.sxs.spi;

/**
 * @ClassName OrdinaryMask
 * @Description: 医用口罩实现类
 * @Author sxs
 * @Date 2020/6/23 9:43
 */
public class OrdinaryMask implements MaskInterface{

    @Override
    public String getMask() {

        return "ordinary mask";
    }
}
