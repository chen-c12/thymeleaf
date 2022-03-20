package com.chenddd.thymeleaf;

/**
 * @author 金鱼
 * @title: junit5Test
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1915:27
 */

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("junit5测试")
public class junit5Test {


    @DisplayName("测试简单断言")
    @Test
    void testSimpleAssertion(){
        int cal = cal(3, 3);
        assertEquals(5, cal,"业务逻辑计算失败");
    }
    int cal(int i,int j){
        return i+j;
    }

    @DisplayName("测试DisplayName")
    @Test
    public void testDisplayName(){
        System.out.println(1);
    }

    @RepeatedTest(3)
    @DisplayName("junit")
    @Test
    public void test(){
        System.out.println(2);
    }


    /**
     * 规定方法的超时时间
     * @throws InterruptedException
     */
    @Disabled
    @Timeout(value = 5,unit = TimeUnit.SECONDS)
    @Test
    void testTimeout() throws InterruptedException {
        Thread.sleep(6000);
    }

    @BeforeEach
    public void testBeforeEach(){
        System.out.println("测试开始前");
    }

    @AfterEach
    public void testAfterEach(){
        System.out.println("测试结束后");
    }

    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有测试之前。。。");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("所有测试之后。。。");
    }

    @ParameterizedTest
    @DisplayName("参数化测试")
    @ValueSource(ints = {1,2,3,4,5})
    void testParameterized(int i){
        System.out.println(i);
    }
}
