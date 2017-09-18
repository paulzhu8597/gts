package com.wf.gts.core.service;
import com.wf.gts.core.bean.TxTransactionInfo;


@FunctionalInterface
public interface TxTransactionFactoryService<T> {

    /**
     * 功能描述: 生成不同实现的 TxTransactionService
     * @author: chenjy
     * @date: 2017年9月18日 下午2:43:46 
     * @param info
     * @return
     * @throws Throwable
     */
    Class<T> factoryOf(TxTransactionInfo info) throws Throwable;
}
