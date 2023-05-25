public class ArraysJava{
    public static void main(String[]arge){
        float [] vals=new float[5];
        vals[0]=10.0f; 
        vals[1]=15.0f;
        vals[2]=20.0f;
        vals[3]=25.0f;
        vals[4]=30.0f;
        float sum=0;
        for(int i=0;i<vals.length;i++){
            sum=sum+vals[i];
        }
        System.out.println(sum);
    }

}