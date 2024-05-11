package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshenghuomokuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshenghuomokuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshenghuomokuaiView;


/**
 * 生活模块评论表
 *
 * @author 
 * @email 
 * @date 2021-04-08 21:36:13
 */
public interface DiscussshenghuomokuaiService extends IService<DiscussshenghuomokuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshenghuomokuaiVO> selectListVO(Wrapper<DiscussshenghuomokuaiEntity> wrapper);
   	
   	DiscussshenghuomokuaiVO selectVO(@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);
   	
   	List<DiscussshenghuomokuaiView> selectListView(Wrapper<DiscussshenghuomokuaiEntity> wrapper);
   	
   	DiscussshenghuomokuaiView selectView(@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshenghuomokuaiEntity> wrapper);
   	
}

