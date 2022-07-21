package com.test.entity;


import java.io.Serializable;
import java.util.Date;

public class Blog{

  private String id;
  private String title;
  private String author;
  private Date createTime;
  private long views;

  @Override
  public String toString() {
    return "Blog{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", createTime=" + createTime +
            ", views=" + views +
            '}';
  }

  public Blog() {
  }

  public Blog(String id, String title, String author, Date createTime, long views) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.createTime = createTime;
    this.views = views;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getViews() {
    return views;
  }

  public void setViews(long views) {
    this.views = views;
  }

}
