package com.newer.springcloud.service;

import com.newer.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    /**
     * 创建
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
