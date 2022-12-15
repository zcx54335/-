package com.zcx.csc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 11:33:09
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

