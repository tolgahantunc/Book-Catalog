import java.util.ArrayList;



public class BookTest {

		
	public static void printBookList(ArrayList<Book> bookList){

		for(int i = 0 ; i <bookList.size() ; i++){
			bookList.get(i).print();					
		}
	}
	public static void main(String[] args) {
		ArrayList<Book> bookList =  new ArrayList<>();
		Book b1 = new Book("Simply Scheme", "Computer Science");
		Book b2 = new Book("Data Structures", "Computer Science");
		Book b3 = new Book("Operating Systems ", "Computer Science");
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		bookList.get(0).addAuthor("Harvey");
		bookList.get(0).addAuthor("Wright");
		bookList.get(1).addAuthor("Sedgewick");
		bookList.get(2).addAuthor("Tannenbaum");
		
		printBookList(bookList);
		bookList.get(1).borrow(13, 11, 2015);
		printBookList(bookList);
		
		
	}

}
