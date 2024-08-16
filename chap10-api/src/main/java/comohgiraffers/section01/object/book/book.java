package main.java.comohgiraffers.section01.object.book;

import java.awt.print.Book;

public class book {

    private int number;

    private String title;

    private String author;

    private int price;

    public book() {
    }

    public book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

  //  @Override
    public String toString() {
        return "book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    //오버라이딩
    public boolean equals(Object b) { // 자식이라 오브젝트에도 들어와도된다
        if(this == b){
            return true;
        }
        if(b == null)
        {
            return false;
        }

        book other = (book)b; //g형변환 다시 하는거

        if(this.number != other.number)
        {
            return false;
        }
        if(this.title == null)
        {
            if(other.title != null)
            {
                return false;
            }
        }
        else if(!this.title.equals(other.title))
        {
            return false;
        }

        if(this.author == null)
        {
            if(other.author != null)
                return false;
        }
        else if(!this.author.equals(other.author))
        {
            return false;
        }

        if(this.price != other.price)
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        final int PRIME = 31;//해쉬코드를 쓸때 통상적인 숫자 31 31을 곱    했을때

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}

