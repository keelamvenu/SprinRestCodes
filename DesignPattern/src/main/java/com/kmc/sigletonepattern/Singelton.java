package com.kmc.sigletonepattern;
class Demo
{
    String str;
    static Demo object;
    private Demo(String str)
    {
        this.str=str;
    }
    public static Demo getObject(String str)
    {
        if(object==null)
        {
            object =new Demo(str);
        }
        return object;
    }
}
public class Singelton
{
    public static void main(String[] args)
    {
        Demo demo = Demo.getObject("hi");
        Demo demo1= Demo.getObject("hello");
        System.out.println(demo.str);
        System.out.println(demo1.str);
    }
}