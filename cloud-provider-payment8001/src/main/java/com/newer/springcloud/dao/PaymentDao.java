package com.newer.springcloud.dao;

import com.newer.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
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
