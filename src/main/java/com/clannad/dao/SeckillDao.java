package com.clannad.dao;

import com.clannad.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by F_ck on 2016/11/3.
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1,表示更新的记录行数
     */
    int reduceNumber(long seckillId,Date killTime);

    /**
     * 根据Id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param ofset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int ofset,int limit);



}
