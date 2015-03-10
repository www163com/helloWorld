/*
 * www.dyr.com
 * Copyright (c) 2014 All Right Reserved.
 *    版权					                   保留
 */
/**
 * 
 */
package test;

import org.hibernate.Session;

import entity.Course;
import entity.Score;
import entity.Student;


import util.HibernateUtil;

/**
 * Project: Hibernte_API
 * Package: test
 * FileName: Test1.java 
 * Comments(意见):
 * JDK Version:
 * Author:谢洪章
 * Create Date: 2015-3-6下午5:14:48
 * Modified By(修改人):Casper
 * Modified Time(修改时间):
 * What is Modified:
 * Version(版本):
 */
//添加对象
public class Test1 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student s1 = new Student("张三");
		Course c1 = new Course("语文");
		Score sc1 = new Score(s1, c1, 100.0);
		session.save(s1);
		session.save(c1);
		session.save(sc1);
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		//System.out.println(session);
	}
}
