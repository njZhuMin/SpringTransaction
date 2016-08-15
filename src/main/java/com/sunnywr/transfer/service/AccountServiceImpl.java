package com.sunnywr.transfer.service;

import com.sunnywr.transfer.dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例业务层实现类
 */

/**
 * @Transactional 注解属性
 * propagation：事务传播行为
 * isolation：事务隔离级别
 * readOnly：只读
 * rollbackFor：发生哪些异常回滚
 * noRollbackFor：发生哪些异常不回滚
 */
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
    // 注入转账的DAO类
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i = 1 / 0;
        accountDao.inMoney(in, money);
    }
    // 注入事务管理的模板
//    private TransactionTemplate transactionTemplate;
//
//    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//        this.transactionTemplate = transactionTemplate;
//    }

//    public void transfer(final String out, final String in, final Double money) {
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus status) {
//                accountDao.outMoney(out, money);
//                int i = 1 / 0;
//                accountDao.inMoney(in, money);
//            }
//        });
//    }
}
