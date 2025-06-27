package me.lxxzdrgnl.springbootdeveloper.controller;

abstract class Student {
    public abstract double getAverage();
}

class Science extends Student {
    private int scienceScore;

    @Override
    public double getAverage() {
        return scienceScore;
    }
}

class Arts extends Student {
    private int socialScore;

    @Override
    public double getAverage() {
        return socialScore;
    }
}

