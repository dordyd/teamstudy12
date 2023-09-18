public class BolzanoTextBook extends TextBook {
    private String faculty;

    public BolzanoTextBook(String title, String author, String course, String faculty){
        super(title,author,course);
        this.faculty = faculty;
    }


    public void printBook(){
        super.printBook();
        System.out.println("faculty : " + faculty);
    }
}
