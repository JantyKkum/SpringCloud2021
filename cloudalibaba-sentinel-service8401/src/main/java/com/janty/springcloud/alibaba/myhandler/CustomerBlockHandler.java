package com.janty.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.janty.springcloud.entities.CommonResult;

/**
 * @author: Janty
 * @projectName: Cloud2021
 * @date: 2023/2/24 18:16
 * @description:
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义限流处理信息.... CustomerBlockHandler --- 1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义限流处理信息.... CustomerBlockHandler --- 2");
    }
}
