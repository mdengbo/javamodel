package com.example.javaobserver.observer;

import com.example.javaobserver.comm.Subject;

/**
 * @author madengbo
 * @create 2018-11-07 14:50
 * @desc 具体观察者
 * @Version 1.0
 **/

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}

