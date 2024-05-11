package com.entity.vo;

import com.entity.JianzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 兼职信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 21:36:12
 */
public class JianzhixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公司类型
	 */
	
	private String gongsileixing;
		
	/**
	 * 成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chenglishijian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 招聘要求
	 */
	
	private String zhaopinyaoqiu;
		
	/**
	 * 招聘人数
	 */
	
	private Integer zhaopinrenshu;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 招聘状态
	 */
	
	private String zhaopinzhuangtai;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：公司类型
	 */
	 
	public void setGongsileixing(String gongsileixing) {
		this.gongsileixing = gongsileixing;
	}
	
	/**
	 * 获取：公司类型
	 */
	public String getGongsileixing() {
		return gongsileixing;
	}
				
	
	/**
	 * 设置：成立时间
	 */
	 
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：招聘要求
	 */
	 
	public void setZhaopinyaoqiu(String zhaopinyaoqiu) {
		this.zhaopinyaoqiu = zhaopinyaoqiu;
	}
	
	/**
	 * 获取：招聘要求
	 */
	public String getZhaopinyaoqiu() {
		return zhaopinyaoqiu;
	}
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：招聘状态
	 */
	 
	public void setZhaopinzhuangtai(String zhaopinzhuangtai) {
		this.zhaopinzhuangtai = zhaopinzhuangtai;
	}
	
	/**
	 * 获取：招聘状态
	 */
	public String getZhaopinzhuangtai() {
		return zhaopinzhuangtai;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
