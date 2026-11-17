public class Assignment01Q01 {
    public static void main(String[] args) {
        int x = args.length;
        for (int i=0; i<x;i++){
            if(args[i].charAt(0)%5==0){
                System.out.println(args[i].charAt(0));
            }
        }
    }
}
