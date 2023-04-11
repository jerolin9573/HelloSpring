package com.jerolin.www.helloboot;

public class Test {
    public static void main(String[] args) {
        Person a = new Person();
        a.setAge(18);
        Test test = new Test();
        test.change(a);
        System.out.printf(a.getAge()+"");
    }

    public void change(Person stu) {
        stu = new Person();
        stu.setAge(15);
    }
}
