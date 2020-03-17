package com.newer.springcloud.controller;

import com.newer.springcloud.entities.CommonResult;
import com.newer.springcloud.entities.Payment;
import com.newer.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value="/payment/create")
    public CommonResult create(Payment payment)
    {
        new HashMap<>();
        int num = paymentService.create(payment);
        log.info("插入结果:"+num);
        if(num>0){
            return new CommonResult(200,"插入数据库成功",num);
        }
        return new CommonResult(444,"插入数据库失败",null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = this.paymentService.getPaymentById(id);
        log.info("查询到了:"+paymentById);
        if (paymentById!=null){
            return new CommonResult(200,"查询到了",paymentById);
        }
        return new CommonResult(444,"没有编号为:"+id+"的信息哈哈",null);
    }
}
