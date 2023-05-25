public class ForEachLoopArray{
    public static void main(String[]arge){
        float [] vals=new float[5];
        vals[0]=10.0f; 
        vals[1]=15.0f;
        vals[2]=20.0f;
        vals[3]=25.0f;
        vals[4]=30.0f;
        float sum=0;
        for(float i:vals){ // i type is type of each member of the aray
            sum=sum+i;
        }
        System.out.println(sum);
    }

}