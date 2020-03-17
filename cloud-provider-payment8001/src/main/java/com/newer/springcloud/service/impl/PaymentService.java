package com.newer.springcloud.service.impl;

import com.newer.springcloud.dao.PaymentDao;
import com.newer.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService implements com.newer.springcloud.service.PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return this.paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentDao.getPaymentById(id);
    }
}
