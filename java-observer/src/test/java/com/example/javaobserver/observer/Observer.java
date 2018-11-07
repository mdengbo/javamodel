package com.example.javaobserver.observer;

import com.example.javaobserver.comm.Subject;

/**
 * @author madengbo
 * @create 2018-11-07 14:48
 * @desc 抽象观察者
 * @Version 1.0
 **/

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

