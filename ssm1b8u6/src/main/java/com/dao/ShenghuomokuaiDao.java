package com.dao;

import com.entity.ShenghuomokuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenghuomokuaiVO;
import com.entity.view.ShenghuomokuaiView;


/**
 * 生活模块
 * 
 * @author 
 * @email 
 * @date 2021-04-08 21:36:12
 */
public interface ShenghuomokuaiDao extends BaseMapper<ShenghuomokuaiEntity> {
	
	List<ShenghuomokuaiVO> selectListVO(@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);
	
	ShenghuomokuaiVO selectVO(@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);
	
	List<ShenghuomokuaiView> selectListView(@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);

	List<ShenghuomokuaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);
	
	ShenghuomokuaiView selectView(@Param("ew") Wrapper<ShenghuomokuaiEntity> wrapper);
	
}
