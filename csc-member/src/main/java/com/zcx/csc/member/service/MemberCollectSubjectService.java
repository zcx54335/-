package com.zcx.csc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcx.common.utils.PageUtils;
import com.zcx.csc.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * ??Ա?ղص?ר???
 *
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 11:35:27
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

