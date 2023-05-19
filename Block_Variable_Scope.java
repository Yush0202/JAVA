public class Block_Variable_Scope {
    public static void main(String[] args){
        double students=30.0d,rooms=4.0d;
        if(rooms>0.0d){
            System.out.println(students);
            System.out.println(rooms);
            double avg=students/rooms;
            System.out.println(avg);
        }
        //System.out.println(avg);
        //this will raise an error.
        //To solve the issue -> 1. Declare avg outside of block
        //put th print statement inside the block.
    }
}
//variables declared before a block are visible inside that block
//but any variable declared within a block is not visible outside block