package com.wimilee.item.service;

import com.wimilee.pojo.TbItemParam;
import com.wimilee.utils.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface ItemParamService {

    TbItemParam selectItemParamByItemCatId(Long itemCatId);
    PageResult selectItemParamAll(Integer page, Integer rows);
    Integer insertItemParam(TbItemParam tbItemParam);
    Integer deleteItemParamById(Long id);
}
