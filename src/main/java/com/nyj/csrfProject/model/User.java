package com.nyj.csrfProject.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //user 클래스가 MySQL 테이블 자동생성
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//프로젝트에서 연결된 db의 넘버링 전략 따라감 auto increment
	private int id; //auot_increment
	
	@Column(nullable=false ,length=30) //null x
	private String username ; //아이디
	
	
	@Column(nullable=false ,length=100)
	private String password; //비밀번호
	

	@CreationTimestamp
	private Timestamp createDate;
}
