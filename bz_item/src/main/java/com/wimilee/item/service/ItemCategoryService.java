package com.wimilee.item.service;



import com.wimilee.pojo.TbItemCat;
import com.wimilee.utils.CatResult;

import java.util.List;


public interface ItemCategoryService {
    List<TbItemCat> selectItemCategoryByParentId(Long id);
    CatResult selectItemCategoryAll();
}
