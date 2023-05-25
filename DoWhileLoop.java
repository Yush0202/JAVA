public class DoWhileLoop {
    public static void main(String[]args){
        int iVal=80;
        do{
            System.out.print(iVal);
            System.out.print("*2=");
            iVal*=2;
            System.out.println(iVal);
        }while(iVal<25);
    }
}