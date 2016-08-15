package com.sunnywr.transfer.service;

/**
 * 转账案例业务层接口
 */
public interface AccountService {
    /**
     * 转账接口
     * @param out 转出账户
     * @param in 转入账户
     * @param money 转账金额
     */
    public void transfer(String out, String in, Double money);
}
