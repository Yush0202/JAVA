public class standard_and_logical_conditional {
    public static void main(String args[]){
        int students=150;
        int rooms=0;
        /*if(rooms!=0 & students/rooms>30)//both condition checked and
        second condition cannot be calculated so raises an error.
            System.out.println("Crowded");*/
        
        if(rooms!=0 && students/rooms>30) //1st condition false so moves to next block
        System.out.println("Crowded");
        System.out.println();
        System.out.println("*** end of program ***");
    }

}