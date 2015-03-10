/*
 * www.dyr.com
 * Copyright (c) 2014 All Right Reserved.
 *    版权					                   保留
 */
/**
 * 
 */
package entity;

/**
 * Project: Hibernte_many_2_mang_have Package: entity FileName: Score.java
 * Comments(意见): JDK Version: Author:谢洪章 Create Date: 2015-3-9下午4:51:50 Modified
 * By(修改人):Casper Modified Time(修改时间): What is Modified: Version(版本):
 */
public class Score {
	private Long id;
	private Student student;
	private Course course;
	private Double score;

	public Score() {

	}

	public Score(Student student, Course course, Double score) {
		this.student = student;
		this.course = course;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
}
