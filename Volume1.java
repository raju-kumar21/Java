package com.cybrom.pack1;

import com.cybrom.pack.*;


public class Volume1 extends Area1
{
   protected  int h;
    public Volume1(int l, int b , int h) {
        super(l, b);
        this.h=h;
    }
    public int v()
    
    {
        return super.a()*h;
    }
}