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


import com.dao.BiaobaiqiangDao;
import com.entity.BiaobaiqiangEntity;
import com.service.BiaobaiqiangService;
import com.entity.vo.BiaobaiqiangVO;
import com.entity.view.BiaobaiqiangView;

@Service("biaobaiqiangService")
public class BiaobaiqiangServiceImpl extends ServiceImpl<BiaobaiqiangDao, BiaobaiqiangEntity> implements BiaobaiqiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaobaiqiangEntity> page = this.selectPage(
                new Query<BiaobaiqiangEntity>(params).getPage(),
                new EntityWrapper<BiaobaiqiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaobaiqiangEntity> wrapper) {
		  Page<BiaobaiqiangView> page =new Query<BiaobaiqiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaobaiqiangVO> selectListVO(Wrapper<BiaobaiqiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaobaiqiangVO selectVO(Wrapper<BiaobaiqiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaobaiqiangView> selectListView(Wrapper<BiaobaiqiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaobaiqiangView selectView(Wrapper<BiaobaiqiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
