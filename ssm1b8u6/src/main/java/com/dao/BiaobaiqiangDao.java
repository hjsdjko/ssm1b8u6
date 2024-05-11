package com.dao;

import com.entity.BiaobaiqiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaobaiqiangVO;
import com.entity.view.BiaobaiqiangView;


/**
 * 表白墙
 * 
 * @author 
 * @email 
 * @date 2021-04-08 21:36:12
 */
public interface BiaobaiqiangDao extends BaseMapper<BiaobaiqiangEntity> {
	
	List<BiaobaiqiangVO> selectListVO(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
	BiaobaiqiangVO selectVO(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
	List<BiaobaiqiangView> selectListView(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);

	List<BiaobaiqiangView> selectListView(Pagination page,@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
	BiaobaiqiangView selectView(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
}
