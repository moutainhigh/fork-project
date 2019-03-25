package com.xue.xblog.business.service;


import com.xue.xblog.business.entity.Type;
import com.xue.xblog.business.vo.TypeConditionVO;
import com.xue.xblog.framework.object.AbstractService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分类
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface BizTypeService extends AbstractService<Type, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Type> findPageBreakByCondition(TypeConditionVO vo);

    List<Type> listParent();

    List<Type> listTypeForMenu();
}
