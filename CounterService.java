package com.walking.lessonEleventh.counterAggregation;

import java.util.Arrays;

import com.walking.lessonEleventh.counterAggregation.Main;
import com.walking.lessonEleventh.counterAggregation.Counter;

public class CounterService {
    static Counter[] Counters;

    public CounterService(Counter[] Counters) {
        this.Counters = Counters;
    }
    public int increaseValue(int value) {
        Counter.counterValue += value;
        return Counter.counterValue;
    }
}
