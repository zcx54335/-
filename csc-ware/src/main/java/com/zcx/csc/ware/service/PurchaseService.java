package com.zcx.csc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * ?ɹ???Ϣ
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 11:37:23
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

