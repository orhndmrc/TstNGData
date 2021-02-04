package tests;

import org.testng.annotations.Test;

public class Calculator {
    @Test
    public void addition(){
        int x = 5, y=3;
        System.out.println(x+y);
    }
    @Test
    public void multiplication(){
        int x = 5, y=3;
        System.out.println(x*y);
    }
    @Test
    public void subtraction(){
        int x = 5, y=3;
        System.out.println(x-y);
    }}
