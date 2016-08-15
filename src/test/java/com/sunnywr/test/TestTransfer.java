package com.sunnywr.test;

import com.sunnywr.transfer.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 转账测试案例
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTransfer {

//    @Resource(name = "accountService")

    // 方式1：基于TransactionProxyFactoryBean
//    @Resource(name = "accountServiceProxy")

    // 方式2：基于AspectJ的XML方式
//    @Resource(name = "accountService")

    // 方式3：基于注解的事务管理方式
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void testTransfer() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
