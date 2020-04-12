package com.company;

public  class InputClass {

    public int b = 1;
     static int c;



    public void MTest(int b ,int...v){
        for (int a:v) {
            System.out.println(a);
        }
    }

    int Show(){
        return b;
    }
    static void P(){
        System.out.println("Hey!");
    }

     class B {
        int d = c;
        int b = c;
    }
}
