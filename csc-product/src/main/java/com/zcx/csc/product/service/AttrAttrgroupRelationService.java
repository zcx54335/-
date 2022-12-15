package com.zcx.csc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ????&???Է???????
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 10:35:15
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

