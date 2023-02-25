package com.restaurant_commenting.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.restaurant_commenting.dto.Result;
import com.restaurant_commenting.entity.Shop;


public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);

}
