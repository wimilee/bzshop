package com.wimilee.item.service.impl;

import com.wimilee.item.service.ItemParamService;
import com.wimilee.mapper.TbItemParamMapper;
import com.wimilee.pojo.TbItemParam;
import com.wimilee.pojo.TbItemParamExample;
import com.wimilee.utils.PageResult;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ItemParamService
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    @Autowired
    private TbItemParamMapper tbItemParamMapper;

    @Override
    public TbItemParam selectItemParamByItemCatId(Long itemCatId) {
        TbItemParamExample example = new TbItemParamExample();
        TbItemParamExample.Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(itemCatId);
        List<TbItemParam> list =  this.tbItemParamMapper.selectByExampleWithBLOBs(example);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    /**
     * 查询所有规格参数模板
     * @param page
     * @param rows
     * @return
     */
    @Override
    public PageResult selectItemParamAll(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        TbItemParamExample example = new TbItemParamExample();
        List<TbItemParam> list = this.tbItemParamMapper.selectByExampleWithBLOBs(example);

        PageInfo<TbItemParam> pageInfo = new PageInfo<>(list);

        PageResult pageResult = new PageResult();
        pageResult.setPageIndex(page);
        pageResult.setResult(pageInfo.getList());
        pageResult.setTotalPage(pageInfo.getTotal());
        return pageResult;
    }

    /**
     * 添加商品分类规格参数模板
     * @param tbItemParam
     * @return
     */
    @Override
    @LcnTransaction
    public Integer insertItemParam(TbItemParam tbItemParam) {
        return this.tbItemParamMapper.insertSelective(tbItemParam);
    }

    /**
     * 根据ID删除规格参数模板
     * @param id
     * @return
     */
    @Override
    public Integer deleteItemParamById(Long id) {
        return this.tbItemParamMapper.deleteByPrimaryKey(id);
    }
}
