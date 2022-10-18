public class FloodFill {
    public static void main(String[] args) {
        int[] [] a = {
                {1,1,1,2,1,1,1},
                {2,2,1,2,2,1,1},
                {0,2,2,2,1,1,1},
                {1,1,0,2,1,2,2}
        };
        flood(a,0,4,7 ,1);
        print(a);


    }
    static void print(int a[][]){
        for(int i = 0; i <a.length; i++){
            for(int j = 0 ; j < a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void flood(int a[][] , int r, int c , int toFill, int prevFill){
        int row = a.length;
        int col = a[0].length;

        if(r <0 || r >= row || c < 0 || c >= col)
            return;
        if (a[r][c] != prevFill)
            return;
        a[r][c] = toFill;

        flood(a,r,c-1,toFill,prevFill);
        flood(a,r-1,c,toFill,prevFill);
        flood(a,r,c+1,toFill,prevFill);
        flood(a,r+1,c,toFill,prevFill);
    }
}
