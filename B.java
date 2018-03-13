
package com.pro;

import com.main.Customer;
import com.main.Withdraw;

public class B implements Withdraw{

    @Override
    public void withDraw(Customer c, double amt) {
      c.setBalance(c.getBalance()-amt);
    }
    
}
