package com.sunnywr.transfer.dao;

/**
 * 转账案例DAO层接口
 */
public interface AccountDao {
    /**
     * 转出方法
     * @param out 转出账户
     * @param money 转出金额
     */
    public void outMoney(String out, Double money);

    /**
     * 转入方法
     * @param in 转入账户
     * @param money 转入金额
     */
    public void inMoney(String in, Double money);
}
