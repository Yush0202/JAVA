public class Whileloop{
    public static void main(String [] args){
        int n=4;
        int temp=1;
        while(n>0){
            temp=temp*n;
            n--;
        }
        System.out.println(temp);
    }
}