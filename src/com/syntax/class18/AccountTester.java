package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {
        Account account=new Account();
        //System.out.println(account.userName); //this would not
        //System.out.println(account.password);
        /*
        accessing a field directly is different from accessing
        the same field with methods having different access modifier
         */
        //account.printUserName(); can't print - private void
        account.printPassword(); //this would work, private access
        account.printAccountNumber();
        account.printBalance();

    }
}
