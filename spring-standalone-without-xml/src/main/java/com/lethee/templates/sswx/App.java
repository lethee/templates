package com.lethee.templates.sswx;

import org.springframework.context.annotation.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        System.out.println(ctx.getBean("myBean"));
        System.out.println(ctx.getBean(MyBean.class));
        System.out.println(ctx.getBean(MyBean.class).getHello());
    }

    @Configuration
    //@ComponentScan("com.lethee.templates.sswx")
    public static class AppConfig {

        @Bean
        public MyBean myBean() {
            return new MyBeanImpl();
        }
    }

    public static interface MyBean {
        String getHello();
    }

    public static class MyBeanImpl implements MyBean {
        public String getHello() {
            return "Hello";
        }
    }
}
