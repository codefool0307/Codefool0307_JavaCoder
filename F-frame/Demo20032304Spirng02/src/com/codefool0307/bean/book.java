package com.codefool0307.bean;

public class book {
    private String bookName;
    private String author;
    public book() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("book被创建");
    }
    public void myinit(){
        System.out.println("开始卖图书了");
    }
    public void myDestory(){
        System.out.println("jiehsule");
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", author=" + author + "]";
    }

}
