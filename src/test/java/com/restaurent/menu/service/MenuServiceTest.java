package com.restaurent.menu.service;

import com.restaurent.menu.MainClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by prashant on 24/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MainClass.class},properties = {"classpath:data.txt"})
public class MenuServiceTest {
    @Autowired
    MenuService menuService;

    @Test
    public void testMaxSatisfaction()
    {
        Assert.assertEquals("Maximum Satisfaction is different Than Expected",3000,menuService.getMaxSatisfaction(50));
    }

    @Test
    public void testTimeIsZero()
    {
        Assert.assertEquals("Time Should be greter than Zero",0,menuService.getMaxSatisfaction(0));
    }

    @Test
    public void testTimeNotPresntInTheMenuAndTooSmall()
    {
        Assert.assertEquals("Time is not present in the menu and too small should return 0 satisfaction",0,menuService.getMaxSatisfaction(5));
    }
    @Test
    public void testTimeNotPresentInMenuAndTooLarge()
    {
        Assert.assertEquals(63074,menuService.getMaxSatisfaction(1059));
    }
}
