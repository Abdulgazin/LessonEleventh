package com.walking.lessonEleventh.counterAggregation;

public class Counter {
    public final String counterName;
    public int counterValue;
    public final String unitMeasurement;

    public int getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }

    public Counter(String name, int counter, String measurement) {
        this.counterValue = counter;
        this.counterName = name;
        this.unitMeasurement=measurement;
    }
    public int increaseValue(int value) {
        counterValue += value;
        return counterValue;
    }
    public int increment() {
        counterValue++;
        return counterValue;
    }
    public int resetValue() {
        return counterValue=0;
    }
}