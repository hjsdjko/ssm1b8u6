package com.entity.view;

import com.entity.DiscussshenghuomokuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生活模块评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 21:36:13
 */
@TableName("discussshenghuomokuai")
public class DiscussshenghuomokuaiView  extends DiscussshenghuomokuaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshenghuomokuaiView(){
	}
 
 	public DiscussshenghuomokuaiView(DiscussshenghuomokuaiEntity discussshenghuomokuaiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshenghuomokuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
