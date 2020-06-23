package com.sxs.spi;

/**
 * @ClassName MedicalMask
 * @Description: 普通口罩实现类
 * @Author sxs
 * @Date 2020/6/23 9:43
 */
public class MedicalMask implements MaskInterface{

    @Override
    public String getMask() {

        return "medical mask";
    }
}
