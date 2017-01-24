package com.restaurent.menu.service;

import com.restaurent.menu.component.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by prashant on 24/1/17.
 */
@Service
public class MenuService {

    @Autowired
    FileReader fileReader;

    public Long getMaxSatisfaction()
    {
        try {
            return fileReader.getMaxSatisfaction();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
