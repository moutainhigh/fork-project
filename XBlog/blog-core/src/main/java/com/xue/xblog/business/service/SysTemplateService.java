package com.xue.xblog.business.service;


import com.github.pagehelper.PageInfo;
import com.xue.xblog.business.entity.Template;
import com.xue.xblog.business.enums.TemplateKeyEnum;
import com.xue.xblog.business.vo.TemplateConditionVO;
import com.xue.xblog.framework.object.AbstractService;

/**
 * 系统模板
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface SysTemplateService extends AbstractService<Template, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Template> findPageBreakByCondition(TemplateConditionVO vo);

    /**
     * 通过key获取模板信息
     *
     * @param key
     * @return
     */
    Template getTemplate(TemplateKeyEnum key);
}
