package com.dao;

import com.entity.DiscussshenghuomokuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshenghuomokuaiVO;
import com.entity.view.DiscussshenghuomokuaiView;


/**
 * 生活模块评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-08 21:36:13
 */
public interface DiscussshenghuomokuaiDao extends BaseMapper<DiscussshenghuomokuaiEntity> {
	
	List<DiscussshenghuomokuaiVO> selectListVO(@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);
	
	DiscussshenghuomokuaiVO selectVO(@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);
	
	List<DiscussshenghuomokuaiView> selectListView(@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);

	List<DiscussshenghuomokuaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);
	
	DiscussshenghuomokuaiView selectView(@Param("ew") Wrapper<DiscussshenghuomokuaiEntity> wrapper);
	
}
