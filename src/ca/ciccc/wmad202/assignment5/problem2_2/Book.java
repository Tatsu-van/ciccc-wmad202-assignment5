package ca.ciccc.wmad202.assignment5.problem2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private ArrayList<String> book;
    private int page;

    public Book() {
        this.book = new ArrayList<String>();
    }

    public void addPage(String words){
        book.add(words);
    }

    public ArrayList<String> getBook() {
        return book;
    }

    public static void bookReader(ArrayList<String> book){
        int count = 0;
        ArrayList<String> wordsList = new ArrayList<String>();
        String curWord = "";

    }


}
