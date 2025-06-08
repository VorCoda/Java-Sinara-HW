package com.example.Sinara.Events_and_Listeners;

public class BookDeliveryDto {
    private  String bookTitle;
    private  int editionNumber;
    private  int count;

    public BookDeliveryDto(String bookTitle, int editionNumber,  int count ){
        this.bookTitle = bookTitle;
        this.editionNumber = editionNumber;
        this.count = count;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
