package com.zcx.csc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.product.entity.CategoryEntity;

import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 10:35:15
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

