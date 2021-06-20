package com.jlc.springboot.Lab11;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
	private Integer bid;
	
	@NotEmpty(message="Book Name is Required")
	@Size(min=5,max=20,message="Name length must be between 5 and 20")
	private String bname;
	
	@NotEmpty(message="Author is Required")
	@Size(min=3,max=10,message="Name length must be between 3 and 10")
	private String author;
	
	@NotNull(message="price is Required")
	@Min(value=500,message="price must be min:500")
	@Max(value=1500,message="price must be max:1500")
	private BigDecimal price;
	
	@NotEmpty(message="pub is Required")
	private String pub;
	public Book(Integer bid, String bname, String author, BigDecimal price, String pub) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.pub = pub;
	}
	public Book(String bname, String author, BigDecimal price, String pub) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.pub = pub;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
   
}
