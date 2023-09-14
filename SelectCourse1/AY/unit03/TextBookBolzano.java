public class TextBookBolzano extends TextBook {
    private String faculty;

    public TextBookBolzano() {
        super();
        this.faculty = faculty;
    }

    @Override
    public void printBook() {
        super.printBook();
        System.out.println("Faculty: " + faculty);
    }
}
