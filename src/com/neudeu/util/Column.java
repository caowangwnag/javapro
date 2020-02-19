package com.neudeu.util;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value();
}
/*
 *  注解 ：
*       在反射过程中
*       为了让 类 属性 方法 等实现某些特定功能 而诞生的
*       写法 @注解名(注解值) 注解值 可以有一个或者多个
*       如何定义一个注解  其实 注解就是 @接口
*       定义注解名是，注解名上方必须写一个注解 @Traget(ElementType.FIELD)
*                   @Traget(ElementType.FIELD)表示注解只能加在属性上
*                    @Traget(ElementType.TYPE)表示注解只能加在类上
*                     @Traget(ElementType.METHOD)表示注解只能加在方法上
*                     @Retention(RetentionPolicy.RUNTIME)表示生命周期，RUNTIME表示在整个生命周期都有效
* */