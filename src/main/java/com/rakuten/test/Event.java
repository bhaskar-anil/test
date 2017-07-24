package com.rakuten.test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="lt")
	private Double lt;
	
	@Column(name="lg")
	private Double lg;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="uid")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getLt() {
		return lt;
	}

	public void setLt(Double lt) {
		this.lt = lt;
	}

	public Double getLg() {
		return lg;
	}

	public void setLg(Double lg) {
		this.lg = lg;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
