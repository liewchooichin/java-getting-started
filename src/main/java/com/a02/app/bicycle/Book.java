package com.a02.app.bicycle;

import java.util.Objects;

/**
 * Implement hash code and equal
 */

public class Book {
  private String title;
  private String author;

  // getter and setter
  public void setTitle(String title) {
    this.title = title;
  }
  public String getTitle() {
    return title;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getAuthor() {
    return author;
  }
  // constructor
  public Book(String instanceTitle, String instanceAuthor){
    title = instanceTitle;
    author = instanceAuthor;
  }
  @Override
  public String toString(){
    return String.format("%s %s%n", title, author);
  }
  @Override
  public boolean equals(Object obj){
    boolean result = false;
    if(obj instanceof Book){
      String objTitle = ((Book)obj).getTitle();
      String objAuthor = ((Book)obj).getAuthor();
      result = (title.equals(objTitle) && author.equals(objAuthor));
    }
    return result;
  }
  @Override
  public int hashCode() {
    int hashValue = 0;
    if(this instanceof Book){
      hashValue = Objects.hash(this.title, this.author);
    }
    return hashValue;
  }
}
