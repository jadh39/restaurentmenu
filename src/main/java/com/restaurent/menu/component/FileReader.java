package com.restaurent.menu.component;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by prashant on 24/1/17.
 */
@Component
public class FileReader {

    public List<String> readFile() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ClassPathResource("data.txt").getInputStream()));
        return reader.lines().collect(Collectors.toList());

    }
}



















