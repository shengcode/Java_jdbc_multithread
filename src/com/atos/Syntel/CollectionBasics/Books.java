/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.CollectionBasics;

/**
 *
 * @author syntel
 */
public class Books {

    
    private String bookId;
    private String bookName;
    private int noOfPage;

    public Books() {
        super();
        bookId="NA";
        bookName="NA";
        noOfPage=0;
    }

    public Books(String bookId, String bookName, int noOfPage) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.noOfPage = noOfPage;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfPage() {
        return noOfPage;
    }

    public void setNoOfPage(int noOfPage) {
        this.noOfPage = noOfPage;
    }
    
   /* @Override
    public int compareTo(Books o) {
        //return o.noOfPage.compareTo(this.getNoOfPage());
        return o.bookName.compareTo(bookId);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        
    @Override
    public String toString() {
        return "Books{" + "bookId=" + bookId + ", bookName=" + bookName + ", noOfPage=" + noOfPage + '}';
    }
    
    
}
