package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShenghuomokuaiDao;
import com.entity.ShenghuomokuaiEntity;
import com.service.ShenghuomokuaiService;
import com.entity.vo.ShenghuomokuaiVO;
import com.entity.view.ShenghuomokuaiView;

@Service("shenghuomokuaiService")
public class ShenghuomokuaiServiceImpl extends ServiceImpl<ShenghuomokuaiDao, ShenghuomokuaiEntity> implements ShenghuomokuaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenghuomokuaiEntity> page = this.selectPage(
                new Query<ShenghuomokuaiEntity>(params).getPage(),
                new EntityWrapper<ShenghuomokuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenghuomokuaiEntity> wrapper) {
		  Page<ShenghuomokuaiView> page =new Query<ShenghuomokuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenghuomokuaiVO> selectListVO(Wrapper<ShenghuomokuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenghuomokuaiVO selectVO(Wrapper<ShenghuomokuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenghuomokuaiView> selectListView(Wrapper<ShenghuomokuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenghuomokuaiView selectView(Wrapper<ShenghuomokuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
