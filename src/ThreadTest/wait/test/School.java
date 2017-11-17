package ThreadTest.wait.test;

public class School {

    private IsOk ok = new IsOk(false);

    public class Teacher extends Thread {
        public Teacher(String name) {
            super(name);
        }

        @Override
        public void run() {


            synchronized (ok) {

//                一次性出完
                try {
                    ok.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ok.notifyAll();
                ok.flag = true;
                System.out.println("----通知----");

//                逐个出
//                for (int i = 0; i < 3; i++) {
//                    try {
//                        ok.wait(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    ok.notify();
//                    ok.flag = true;
//                    System.out.println("----通知----");
//                }
            }

        }
    }

    public class Student extends Thread {
        public Student(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (ok) {
                while (!ok.flag) {
                    System.out.println(Thread.currentThread().getName() + "等待");
                    try {
                        ok.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "IsOK");
            }
        }
    }

}
