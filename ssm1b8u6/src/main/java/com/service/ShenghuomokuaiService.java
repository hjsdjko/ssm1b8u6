package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenghuomokuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenghuomokuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenghuomokuaiView;


/**
 * 生活模块
 *
 * @author 
 * @email 
 * @date 2021-04-08 21:36:12
 */
public interface ShenghuomokuaiService extends IService<ShenghuomokuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenghuomokuaiVO> selectListVO(Wrapper<ShenghuomokuaiEntity> wrapper);
   	
   	ShenghuomokuaiVO selectVO(@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);
   	
   	List<ShenghuomokuaiView> selectListView(Wrapper<ShenghuomokuaiEntity> wrapper);
   	
   	ShenghuomokuaiView selectView(@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenghuomokuaiEntity> wrapper);
   	
}

