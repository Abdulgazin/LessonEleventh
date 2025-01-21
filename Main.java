package com.walking.lessonEleventh.counterAggregation;

public class Main {
    public static void main(String[] args) {
        Counter gasCounter=new Counter("счетчик газа",0,"кубометров");
        Counter coldWaterCounter=new Counter("счетчик холодной воды",0,"кубометров");
        Counter hotWaterCounter=new Counter("счетчик горячей воды",0,"кубометров");
        Counter electricityCounter=new Counter("счетчик электричества",0,"киловатт");
        Object[]Counters=new Object[4];
        Counters[0]=gasCounter;
        Counters[1]=coldWaterCounter;
        Counters[2]=hotWaterCounter;
        Counters[3]=electricityCounter;
        CounterService counterService=new CounterService(Counters);
    }
}
