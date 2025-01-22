package com.walking.lessonEleventh.counterAggregation;

import static com.walking.lessonEleventh.counterAggregation.CounterService.*;

public class Main {
    public static void main(String[] args) {
        Counter gasCounter = new Counter("газ", 0, "кубометров");
        Counter coldWaterCounter = new Counter("холодная вода", 0, "кубометров");
        Counter hotWaterCounter = new Counter("горячая вода", 0, "кубометров");
        Counter electricityCounter = new Counter("электричество", 0, "киловатт");
        Counter[] Counters = new Counter[4];
        Counters[0] = gasCounter;
        Counters[1] = coldWaterCounter;
        Counters[2] = hotWaterCounter;
        Counters[3] = electricityCounter;
        CounterService counterService = new CounterService(Counters);
        //Counters[0].setCounterValue(25);
        //gasCounter.increment();
        //counterService.increaseValue(25);
        //coldWaterCounter.increment();
        Counters[1].increaseValue(35);
        //hotWaterCounter.increaseValue(85);
        //electricityCounter.increaseValue(123);
        //gasCounter.resetValue();
        printArray();
    }

    private static void printArray() {
        for (Counter i : Counters) {
            System.out.println(i);
        }
    }
}
