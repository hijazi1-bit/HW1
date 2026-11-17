public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        approxPi=app(Integer.parseInt(args[0]))*4;
        
        System.out.println(approxPi + " " + actualPi);
    }
    public static double app(int t){
        double count=0;
        int x =1;
        int z =0;
        while (t !=0){
            
            if(z%2==0){
            count+= 1.0 /x;}
            else{count -= 1.0 /x;}
            x+=2;
            t--;
            z++;
        }
        return count;
    }
}
