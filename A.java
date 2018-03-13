
package com.pro;

import com.main.Customer;
import com.main.Deposit;


public class A implements Deposit{

    @Override
    public void deposit(Customer c, double amt) {
       c.setBalance(c.getBalance()+amt);
    }
    
}
