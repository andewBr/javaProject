package org.myProj.module4.threadRealization;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();

        Foo foo = new Foo();

        Thread firstThread = new Thread(foo::first);
        Thread secondThread = new Thread(foo::second);
        Thread thirdThread = new Thread(foo::third);

        threads.add(firstThread);
        threads.add(secondThread);
        threads.add(thirdThread);

        threads.forEach(Thread::start);
    }
}