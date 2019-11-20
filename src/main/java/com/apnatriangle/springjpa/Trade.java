package com.apnatriangle.springjpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trade {

    @Id
    private String id;
    private String bookId;

    public Trade() {
    }

    public Trade(String id, String bookId) {
        this.id = id;
        this.bookId = bookId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", bookId='" + bookId + '\'' +
                '}';
    }
}
