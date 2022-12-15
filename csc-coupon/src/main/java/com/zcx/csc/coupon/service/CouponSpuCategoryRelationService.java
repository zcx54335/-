package com.zcx.csc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * ?Ż?ȯ????????
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 11:26:34
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

