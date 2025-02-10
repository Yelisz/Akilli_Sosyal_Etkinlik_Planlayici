//Sinif iliskileri -> aggregation & composition
//Stack (yigin) sinifi
package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 0; i < 10; i++){
            stack.push(i);//push ile bir ogeyi bu yiginin en ustunene iter
        }
        while(!stack.empty()){//empty ile yigin bos degilse calisir
            System.out.println(stack.pop() + " ");//pop ile yigindan elemanlar cikarilir
        }
    }
}