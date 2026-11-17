public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
       return rec(m,i,j,0,0);
    }
    public static int rec(int[][]m,int i, int j,int x,int counter){
        if(i==j){
            return 0;
        }
        
        if(x==m.length){return -1;}
        if(counter>m.length*m.length){
            return -1;
        }
        if(m[i][x]==1){
            counter++;
            int p=rec(m,x,j,0,counter);
            int q=rec(m,i,j,x+1,counter);
            if(p==-1 && q==-1){
                return -1;
            }
            if(p==-1){
                return q;
            }
            if(q==-1){
                return p+1;
            }
            return min(p+1,q);
            
        }
        else{
            counter++;
            return rec(m,i,j,x+1,counter);
        }
    }
    public static int min(int x,int y){
        if(x==-1 && y!=-1){return y;}
        if(x==-1 && y==-1){return -1;}
        if(x!=-1 && y!=-1){return Math.min(x,y);}
        else{return x;}
    }
  

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}