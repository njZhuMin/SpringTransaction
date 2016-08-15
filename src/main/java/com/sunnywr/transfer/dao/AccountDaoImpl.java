package com.sunnywr.transfer.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账案例DAO层实现类
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     * 转出方法
     * @param out 转出账户
     * @param money 转出金额
     */
    public void outMoney(String out, Double money) {
        String sql = "UPDATE account SET money = money - ? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     * 转入方法
     * @param in 转入账户
     * @param money 转入金额
     */
    public void inMoney(String in, Double money) {
        String sql = "UPDATE account SET money = money + ? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
