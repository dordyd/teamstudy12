public class Ex06 {
    public static int longSeq(String s,char c){
        if(s.length()==0)
        return 0;
        else if(s.charAt(0)==c) 
        return longSeq(s.substring(1),c)+1;
        else
        return longSeq(s.substring(1),c);
    }
    public static void main(String[] args) {
        System.out.println(longSeq("dfsjbddds", 'd'));
    }
}
