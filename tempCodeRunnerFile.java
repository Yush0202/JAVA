public class Calc_Engine_Using_Switch{
    public static void main(String [] args){
        double val1=100.0d;
        double val2=50.0d;
        double result=0.0d;
        char opCode='d';
        switch (opCode) {
            case 'a':
                result=val1+val2;
                break;
            case 's':
                result=val1-val2;
                break;
            case 'd':
                if(val2!=0){
                    result=val1/val2;
                }
                break;
            case 'm':
                result=val1*val2;
                break;
            default:
                System.out.println("Enter valid opCode:"+opCode);
                break;
        }
        System.out.println(result);
    }
}