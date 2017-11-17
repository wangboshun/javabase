package ThreadTest.base;

public class userinfo {
    public int number;
    public String name;

    public userinfo(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(int i) {
        number -= i;
    }

    public void sub(int i) {
        number += i;
    }

}
