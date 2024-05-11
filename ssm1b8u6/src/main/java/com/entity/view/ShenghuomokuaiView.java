package com.entity.view;

import com.entity.ShenghuomokuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生活模块
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 21:36:12
 */
@TableName("shenghuomokuai")
public class ShenghuomokuaiView  extends ShenghuomokuaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenghuomokuaiView(){
	}
 
 	public ShenghuomokuaiView(ShenghuomokuaiEntity shenghuomokuaiEntity){
 	try {
			BeanUtils.copyProperties(this, shenghuomokuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
