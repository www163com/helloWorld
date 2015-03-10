/*
 * www.dyr.com
 * Copyright (c) 2014 All Right Reserved.
 *    版权					                   保留
 */
/**
 * 
 */
package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Project: Hibernte_many_2_mang_have Package: entity FileName: Student.java
 * Comments(意见): JDK Version: Author:谢洪章 Create Date: 2015-3-9下午4:47:40 Modified
 * By(修改人):Casper Modified Time(修改时间): What is Modified: Version(版本):
 */
public class Student {
	private Long id;
	private String name;
	private Set<Score> scores = new HashSet<Score>();

	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

}
