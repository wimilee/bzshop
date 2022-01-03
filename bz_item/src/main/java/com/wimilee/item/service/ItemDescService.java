package com.wimilee.item.service;

import com.wimilee.pojo.TbItemDesc;

public interface ItemDescService {
    Integer insertTbitemDesc(TbItemDesc tbItemDesc);
    Integer updateItemDesc(TbItemDesc tbItemDesc);
    TbItemDesc selectItemDescByItemId(Long itemId);
}
