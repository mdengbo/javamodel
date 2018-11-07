package com.example.javaobserver;

import com.example.javaobserver.comm.Subject;
import com.example.javaobserver.observer.BinaryObserver;
import com.example.javaobserver.observer.HexaObserver;
import com.example.javaobserver.observer.OctalObserver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaObserverApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void ObserverPatternDemo() {
            Subject subject = new Subject();
            //对目标函数加入观察者
            new HexaObserver(subject);
            new OctalObserver(subject);
            new BinaryObserver(subject);

            System.out.println("First state change: 15");
            subject.setState(15);
            System.out.println("Second state change: 10");
            subject.setState(10);
            System.out.println("Second state change: 5");
            subject.setState(10);
    }

}
