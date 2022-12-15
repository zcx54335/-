package com.zcx.csc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * ???湤????
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 11:37:23
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

