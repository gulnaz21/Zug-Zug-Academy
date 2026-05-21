package com.academy.zug_zug.Homework16;

public class TrafficAnalyzer {
    int getMaxTraffic(int [] traffic){
        int max = 0;
        for(int i : traffic){
            if(i > max)
                max = i;
        }
        return max;
    }
    public static void main(String[] args){
        int [] number = new int[]{5,4,111,2,6,10,25,0,3,2,1};
        System.out.println(new TrafficAnalyzer().getMaxTraffic(number));
    }
}
