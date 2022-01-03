package com.wimilee.item.service.impl;

import com.wimilee.item.service.ItemDescService;
import com.wimilee.mapper.TbItemDescMapper;
import com.wimilee.pojo.TbItem;
import com.wimilee.pojo.TbItemDesc;
import com.wimilee.pojo.TbItemDescExample;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemDescServiceImpl implements ItemDescService {

    @Autowired
    private TbItemDescMapper tbItemDescMapper;

    @Override
    @LcnTransaction
    public Integer insertTbitemDesc(TbItemDesc tbItemDesc) {
        return this.tbItemDescMapper.insert(tbItemDesc);
    }

    /**
     * 更新商品描述
     * @param tbItemDesc
     * @return
     */
    @Override
    @LcnTransaction
    public Integer updateItemDesc(TbItemDesc tbItemDesc) {
        tbItemDesc.setUpdated(new Date());
        return this.tbItemDescMapper.updateByPrimaryKeySelective(tbItemDesc);
    }

    /**
     * 根据商品ID查询商品介绍
     * @param itemId
     * @return
     */
    @Override
    public TbItemDesc selectItemDescByItemId(Long itemId) {
        TbItemDescExample example = new TbItemDescExample();
        TbItemDescExample.Criteria criteria = example.createCriteria();
        criteria.andItemIdEqualTo(itemId);
        List<TbItemDesc> list = this.tbItemDescMapper.selectByExampleWithBLOBs(example);
        return list.get(0);
    }
}
