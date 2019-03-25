package com.xue.xblog.core.aspects;

import com.xue.xblog.business.entity.ArticleLook;
import com.xue.xblog.business.service.BizArticleLookService;
import com.xue.xblog.business.service.BizArticleService;
import com.xue.xblog.framework.holder.RequestHolder;
import com.xue.xblog.util.IpUtil;
import com.xue.xblog.util.SessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 文章浏览记录aop操作
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/18 11:48
 * @since 1.0
 */
@Slf4j
@Component
@Aspect
@Order(1)
public class ArticleLookAspects {

    @Autowired
    private BizArticleService bizArticleService;
    @Autowired
    private BizArticleLookService articleLookService;

    @Pointcut("execution(* com.xue.xblog.controller.RenderController.article(..))")
    public void pointcut() {
        // 切面切入点
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            String userIp = IpUtil.getRealIp(RequestHolder.getRequest());
            Long articleId = (Long) args[1];
            if (!bizArticleService.isExist(articleId)) {
                log.warn("{}-该文章不存在！", articleId);
                return;
            }
            ArticleLook articleLook = new ArticleLook();
            articleLook.setArticleId(articleId);
            articleLook.setUserIp(userIp);
            articleLook.setLookTime(new Date());
            if (SessionUtil.getUser() != null) {
                articleLook.setUserId(SessionUtil.getUser().getId());
            }
            articleLookService.insert(articleLook);
        }
    }
}