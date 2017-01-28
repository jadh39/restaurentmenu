package com.restaurent.menu.service;

import com.restaurent.menu.component.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by prashant on 24/1/17.
 */
@Service
public class MenuService {

    @Autowired
    FileReader fileReader;

    public int getMaxSatisfaction(int seconds)
    {
        try {
                if(seconds<=0)return 0;

                List<String> list = fileReader.readFile();

                if(list.isEmpty())
                    throw new RuntimeException("File should not be empty");

                int[]satisFaction =  new int[list.size()];
                int[]time = new int[list.size()];
                int i=0;

                for(String line:list)
                {
                    String[] array = line.split(" ");
                    satisFaction[i]= Integer.parseInt(array[0]);
                    time[i]= Integer.parseInt(array[1]);
                    i++;
                }
                return maxSatisfaction(satisFaction,time,seconds);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
    /*
       Here Consider the Time as a Weight and Satisfaction as a value of the Item
       knapsack Bag capacity is equal to the time provided by the user.
     */
    public int maxSatisfaction(int val[], int wt[], int time) {

        int N = wt.length;

        int[][] V = new int[N + 1][time + 1];

        for (int col = 0; col <= time; col++) {

            V[0][col] = 0;

        }

        for (int row = 0; row <= N; row++) {

            V[row][0] = 0;

        }

        for (int item=1;item<=N;item++){

            //Let's fill the values row by row

            for (int t=1;t<=time;t++){

                //Is the current items weight less than or equal to running weight

                if (wt[item-1]<=t){

                    //Given a weight, check if the value of the current item + value of the item that we could afford with the remaining weight

                    //is greater than the value without the current item itself

                    V[item][t]=Math.max (val[item-1]+V[item-1][t-wt[item-1]], V[item-1][t]);

                }

                else {

                    //If the current item's weight is more than the running weight, just carry forward the value without the current item

                    V[item][t]=V[item-1][t];

                }

            }

        }

        return V[N][time];

    }
}
