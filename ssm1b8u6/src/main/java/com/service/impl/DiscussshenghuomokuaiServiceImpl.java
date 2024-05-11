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


import com.dao.DiscussshenghuomokuaiDao;
import com.entity.DiscussshenghuomokuaiEntity;
import com.service.DiscussshenghuomokuaiService;
import com.entity.vo.DiscussshenghuomokuaiVO;
import com.entity.view.DiscussshenghuomokuaiView;

@Service("discussshenghuomokuaiService")
public class DiscussshenghuomokuaiServiceImpl extends ServiceImpl<DiscussshenghuomokuaiDao, DiscussshenghuomokuaiEntity> implements DiscussshenghuomokuaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshenghuomokuaiEntity> page = this.selectPage(
                new Query<DiscussshenghuomokuaiEntity>(params).getPage(),
                new EntityWrapper<DiscussshenghuomokuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshenghuomokuaiEntity> wrapper) {
		  Page<DiscussshenghuomokuaiView> page =new Query<DiscussshenghuomokuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshenghuomokuaiVO> selectListVO(Wrapper<DiscussshenghuomokuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshenghuomokuaiVO selectVO(Wrapper<DiscussshenghuomokuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshenghuomokuaiView> selectListView(Wrapper<DiscussshenghuomokuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshenghuomokuaiView selectView(Wrapper<DiscussshenghuomokuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
