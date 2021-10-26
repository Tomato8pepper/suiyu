package com.gem.day42;

/**
 * 子类：经理 类
 * @author ybgong
 *
 */
public class Manager extends Employee {
	
	public Manager(){
	}
	//添加自己方法
	public void discuss(){
		System.out.println(this.getEmpName()+"经理在开会讨论！");
		
	}
}
