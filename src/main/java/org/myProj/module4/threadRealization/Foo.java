package org.myProj.module4.threadRealization;

class Foo {

    private volatile int flag = 1;

    synchronized void first() {
        while (flag != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("first");
        flag = 2;
        notifyAll();
    }

    synchronized void second() {
        while (flag != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("second");
        flag = 3;
        notifyAll();
    }

    synchronized void third() {
        while (flag != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            notifyAll();
        }
        System.out.print("third");
        notifyAll();
    }
}
