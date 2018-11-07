package com.example.javaobserver.comm;

import com.example.javaobserver.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author madengbo
 * @create 2018-11-07 14:47
 * @desc 別观察者  加入连接观察者 和 被观察者纽带attach  notifyAllObservers
 * @Version 1.0
 **/
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}