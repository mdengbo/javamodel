package com.example.javaobserver.observer;

import com.example.javaobserver.comm.Subject;

/**
 * @author madengbo
 * @create 2018-11-07 14:51
 * @desc 具体观察者
 * @Version 1.0
 **/

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}

