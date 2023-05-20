public class Calc_Engine_Using_Switch{
    public static void main(String [] args){
        double val1=100.0d;
        double val2=0.0d;
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
                result = val2 !=0 ? val1/val2 :0.0d ;//conditional (ternary) operator
                break;
            case 'm':
                result=val1*val2;
                break;
            default:
                System.out.println("Enter valid opCode:"+opCode);
                result=0.0d;
                break;
        }
        System.out.println(result);
    }
}