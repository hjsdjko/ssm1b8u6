package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaobaiqiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiaobaiqiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaobaiqiangView;


/**
 * 表白墙
 *
 * @author 
 * @email 
 * @date 2021-04-08 21:36:12
 */
public interface BiaobaiqiangService extends IService<BiaobaiqiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiaobaiqiangVO> selectListVO(Wrapper<BiaobaiqiangEntity> wrapper);
   	
   	BiaobaiqiangVO selectVO(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
   	
   	List<BiaobaiqiangView> selectListView(Wrapper<BiaobaiqiangEntity> wrapper);
   	
   	BiaobaiqiangView selectView(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiaobaiqiangEntity> wrapper);
   	
}

