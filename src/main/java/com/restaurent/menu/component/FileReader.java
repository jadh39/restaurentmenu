package com.restaurent.menu.component;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Created by prashant on 24/1/17.
 */
@Component
public class FileReader {

    //private File file;
    BufferedReader reader;

    public FileReader() throws IOException {
      //  file = new ClassPathResource("data.txt").getFile();
        reader = new BufferedReader(new InputStreamReader(new ClassPathResource("data.txt").getInputStream()));

    }

    public Long getMaxSatisfaction() throws IOException {

         return
                //Files.lines(Paths.get(file.getPath()))
               reader.
                       lines().
                       map(line -> Long.parseLong(line.split(" ")[0])).
                       collect(Collectors.toList()).stream().max(Long::compareTo).get();
    }

}
