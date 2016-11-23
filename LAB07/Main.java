import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
	public static void main(String[] args) {
		Author a1 = new Author("Ion Creanga", new GregorianCalendar(1850,1,1));
		Author a2 = new Author("Charles Dickens", new GregorianCalendar(1820,1,1));
		Author a3 = new Author("John Doe", new GregorianCalendar(1940,1,1));
		Book b1 = new Book(new Author[]{a1}, "Amintirii din copilarie", 80, 30.0, "memories");
		Book b2 = new Book(new Author[]{a1, a2}, "Romanian school book", 160, 40.0, "school");
		Book b3 = new Book(new Author[]{a3}, "Murder", 30, 50.0, "thriller");
		Library l = new Library();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		System.out.println(l.getTotalStock());
		Book result1[] = l.findByAuthor("Ion Creanga");
		for(int i=0;i<result1.length; i++) System.out.println(result1[i].getTitle());
		Book result2[] = l.findByCategory("thriller");
		for(int i=0;i<result2.length; i++) System.out.println(result2[i].getTitle());
	}
}
class Library {
	private List<Book> books = new ArrayList<Book>();
	private int nrBooks;

	public void add(Book book) {
		books.add(book);
	}
	public double getTotalStock() {
		return books.stream().mapToDouble((x -> x.getPrice())).reduce(0, Double::sum);
	}
	public Book[] findByAuthor(String name) {
		return books.stream().filter((x) -> x.authors.stream().anyMatch(authors -> authors.has(name))).toArray(Book[]::new);
	}
	public Book[] findByCategory(String category) {
		return books.stream().filter((x) -> x.hasCategory(category)).toArray(Book[]::new);
	}

}
class Book {
	public List<Author> authors;
	private int nrAuthor;
	private String title;
	private double price;
	private int pages;
	private String category;
	public Book(Author[] authors, String title, int pages, double price, String category) {
		this.authors = new ArrayList<Author>(Arrays.asList(authors));
		this.title = title;
		this.pages = pages;
		this.price = price;
		this.category = category;
	}
	public double getPrice() {
		return this.price;
	}

	public String getTitle() {
		return this.title;
	}
	public boolean hasCategory(String category) {
		return (this.category == category);
	}

}
class Author {
	private String name;
	private GregorianCalendar birthDate;
	public Author(String name, GregorianCalendar birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	public boolean has(String name) {
		return (this.name == name);

	}
}
