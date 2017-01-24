package com.restaurent.menu.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by prashant on 24/1/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MenuServiceTest {
    @Autowired
    MenuService menuService;

    @Test
    public void testMaxSatisfaction()
    {
        Assert.assertEquals("Max Satisfaction is different Than Expected",50074,menuService.getMaxSatisfaction().longValue());
    }
}
