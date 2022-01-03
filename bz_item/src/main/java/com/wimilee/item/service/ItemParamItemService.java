package com.wimilee.item.service;

import com.wimilee.pojo.TbItemParamItem;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface ItemParamItemService {
    Integer insertTbItemParamItem(TbItemParamItem tbItemParamItem);
    Integer upateItemParamItem(TbItemParamItem tbItemParamItem);
    TbItemParamItem selectTbItemParamItemByItemId(Long itemId);
}
