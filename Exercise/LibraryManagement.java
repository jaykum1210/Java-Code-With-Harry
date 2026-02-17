class Library{
    String[] books = new String[100];
    int number_books;

    public Library() {
        this.books = new String[100];
        this.number_books = 0;
    }
    
    public void addbook(String book){
        this.books[number_books] = book;
        number_books++;
        System.out.println(book + " Added");
    }

    public void issuebook(String book){
        int found = 0;
        for(int i = 0;i<books.length;i++){
            if(book.equals(books[i])){
                found = 1;
                books[i] = null;
                System.out.println("Book is issued");
            }
        }
        if(found == 0){
            System.out.println("Book Not Found");
        }
    }

    public void returnbook(String book){
        for(int i = 0;i<books.length;i++){
            if(books[i] == null){
                books[i] = book;
                number_books++;
                return;
            }
        }
    }

    public void ShowAvailable(){
        int num = 1;
        for(String e : books){
            if(e!=null){
                System.out.println((num++) + " : " + e);
            }
        }
    }
}

public class LibraryManagement{
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addbook("Jay");
        lib.addbook("kumawat");
        lib.addbook("Kumawat");
        lib.addbook("Black Holes");
        lib.addbook("Theory of Everything");
        lib.ShowAvailable();
        lib.issuebook("kumawat");
        lib.ShowAvailable();
        lib.issuebook("hoidfh");
        lib.returnbook("kumawat");
        lib.ShowAvailable();
    }
}