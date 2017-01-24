package com.restaurent.menu;

import com.restaurent.menu.service.MenuService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by prashant on 24/1/17.
 */
@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MainClass.class, args);
        MenuService menuService = ctx.getBean(MenuService.class);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("");
        System.out.println("Maximum Satisfaction is " + menuService.getMaxSatisfaction());
        System.out.print("");
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
