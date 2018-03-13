
package com.main;

import com.pro.A;


public class App {
    public static void main(String[] args) {
       Customer c1=new Customer("abc",10000);
       A a=new A();
       a.deposit(c1, 5000);
        System.out.println(c1.getBalance());
    }
}
