public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.print("The first " + x + " Fibonacci numbers are: 1 ");
        int st=0;
        int sec= 1;
        int temp=0;
        int numOdd=1;
        for(int i=0; i<x-1;i++){
            temp = st+sec;
            if(temp%2!=0){numOdd+=1;}
            System.out.print(temp+" ");
            st=sec;
            sec=temp;
        }
        System.out.println("");
        

        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
