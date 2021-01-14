package com.tencent;

import org.junit.Test;

/**
 * @author 雷斌
 * @version V1.0
 * @Package com.tencent
 * @date 2021/1/10 22:23
 * @Copyright ©  爱雷信息技术有限公司
 */
public class test {

    //需求，对一个数进行运算
    @Test
    public void test1(){
        Integer num = operation(100,x -> x * x);
        System.out.println(num);
    }

     @Test
    public void test2(){
        Integer num = operation(111,x -> x * x);
        System.out.println(num);
    
    public Integer operation(Integer num,MyFun mf){
        return mf.getValue(num);
    }
   
    }

}
