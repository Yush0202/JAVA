public class Calc_Engine_Using_Block{
    public static void main(String [] args){
        double val1=100.0d;
        double val2=0.0d;
        double result=0.0d;
        char opCode='d';

        if(opCode=='a')
            result=val1+val2;
        else if(opCode=='s')
            result=val1-val2;
        else if(opCode=='m')
            result=val1*val2;
        else if(opCode=='d'){
            if(val2!=0)
                result=val1/val2;
        }
        else{
            System.out.println("Invalid opCode:"+opCode);
            result=0.0d;
        }
        System.out.println(result);
    }
}