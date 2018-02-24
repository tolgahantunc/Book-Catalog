

import java.util.ArrayList;

public class Book {
	private String title;
	private ArrayList<String> authorList;
	private String identifier;
	private boolean borrowed;
	private int[] returnDate ;
	
	public Book(String title, String identifier){
		this.title=title;
		authorList = new ArrayList<String>();
		this.identifier=identifier;
		borrowed=false;
		returnDate = new int[3];
		
	}
	public void print(){
		String bookInfo="Title		:"+title
						+"\nAuthor		:"+authorList
						+"\nID		:"+identifier
						+"\nBorrowed State	:"+ borrowed;
			
		if(borrowed==true)
			bookInfo += "\nReturn Date	:"+returnDate[0]
										  +"/"+returnDate[1]
										  +"/"+returnDate[2];
		System.out.println(bookInfo);
	}
	
	public void addAuthor(String author){
		authorList.add(author);
	}
	
	public void borrow(int day,int month, int year){
		borrowed=true;
		returnDate[0]=day;
		returnDate[1]=month;
		returnDate[2]=year;
	}
	
	public void returnBack(){
		borrowed=false;
		returnDate[0]=0;
		returnDate[1]=0;
		returnDate[2]=0;
	}
}
