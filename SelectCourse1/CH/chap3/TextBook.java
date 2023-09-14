public class TextBook extends Book{
    

    private String course;

    public TextBook(String title, String author, String course){
        super(title,author);
        this.course = course;
    }

    public void printBook(){
        super.printBook();
        System.out.println("course : " + course);
    }


}
