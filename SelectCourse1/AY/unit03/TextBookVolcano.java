public class TextBookVolcano extends TextBook {
    private String faculty;

    public TextBookVolcano(){
        super();
    }
    
    public String getFaculty(){
        return this.faculty;
    }
    public void setFaculty(String faculty){
        this.faculty=faculty;
    }

    @Override
    public void printBook() {
        super.printBook();
        System.out.println("Faculty: " + faculty);
    }
    

public static void main(String[] args) {
        TextBookVolcano volcano = new TextBookVolcano();
        volcano.printBook();
    
        
    }
}
    