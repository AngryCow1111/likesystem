package com.angrycow1111.likesystem.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
@Aspect
@Slf4j
public class RequestAspect {
    /**
     * 功能描述: 切点表达式
     *
     * @methodname:allMethod
     * @param: []
     * @return: void
     * @author: yanghui
     * @date: 2018/12/12 0012 10:50
     */
    @Pointcut( "execution(public * com.angrycow1111.likesystem.controller.*.*(..))" )
    public void allMethod() {

    }

    /**
     * 功能描述: 环绕增强
     *
     * @methodname:doAround
     * @param: []
     * @return: object
     * @author: yanghui
     * @date: 2018/12/12 0012 10:49
     */
    @Around( "allMethod()" )
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        Field[] declaredFields = proceedingJoinPoint.getTarget().getClass().getDeclaredFields();
        Object[] args = proceedingJoinPoint.getArgs();
        Object proceed = proceedingJoinPoint.proceed();

        return null;
    }
}
