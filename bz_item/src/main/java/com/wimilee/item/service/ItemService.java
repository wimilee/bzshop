package com.wimilee.item.service;

import com.wimilee.pojo.TbItem;
import com.wimilee.pojo.TbItemDesc;
import com.wimilee.utils.PageResult;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface ItemService {

    PageResult selectTbItemAllByPage(Integer page,Integer rows);
    Integer insertTbItem(TbItem tbItem);
    Integer updateItemById(TbItem tbItem);
    Map<String,Object> preUpdateItem(Long itemId);
    TbItem selectItemInfo(Long itemId);
}
