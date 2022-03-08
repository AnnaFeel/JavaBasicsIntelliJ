package com.syntax.class19;

import com.syntax.class20.Task3;

public class Task3FromPackage20 {
    public static void main(String[] args) {
       /* new Task3(10); - private
        new Task3("Haha"); - default
        new Task3(10.2);*/ //- protected
        new Task3(false); //-public

        //private, default and protected are not going to be
        //shown in other package, but public will be
    }
}
