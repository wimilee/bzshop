package com.wimilee.item.controller;


import com.wimilee.item.service.ItemCategoryService;
import com.wimilee.pojo.TbItemCat;
import com.wimilee.utils.CatResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品类目
 */
@RestController
@RequestMapping("/service/itemCategory")
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService itemCategoryService;
    /**
     * 根据父节点查询子节点
     */
    @RequestMapping("/selectItemCategoryByParentId")
    public List<TbItemCat> selectItemCategoryByParentId(@RequestParam Long id){
        return this.itemCategoryService.selectItemCategoryByParentId(id);
    }

    /**
     * 查询首页商品分类
     */
    @RequestMapping("/selectItemCategoryAll")
    public CatResult selectItemCategoryAll(){
        return this.itemCategoryService.selectItemCategoryAll();
    }
}
