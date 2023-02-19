package com.restaurant_commenting.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.restaurant_commenting.dto.Result;
import com.restaurant_commenting.entity.Voucher;


public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
