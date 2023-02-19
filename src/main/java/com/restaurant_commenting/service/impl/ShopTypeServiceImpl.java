package com.restaurant_commenting.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.restaurant_commenting.entity.ShopType;
import com.restaurant_commenting.mapper.ShopTypeMapper;
import com.restaurant_commenting.service.IShopTypeService;
import org.springframework.stereotype.Service;

@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

}
