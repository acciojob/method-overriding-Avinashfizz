package com.driver;

public class Main {

      public static class A {

          public String meth(){
              return "Invoking method from class A";
          }
      }

      public static class B extends A {

          public String meth(){
              return "method is overriden in extended class B";
          }

      }

    public static void main(String[] args)
    {
           B obj = new B();
           obj.meth();

           B obj1 = new B();
           obj1.meth();
    }

}