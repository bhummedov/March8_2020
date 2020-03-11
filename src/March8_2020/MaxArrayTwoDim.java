package March8_2020;

public class MaxArrayTwoDim {
    public static void main(String[] args) {
        int[][] arrNum = {{1,2,3,},{4,5,6},{5,4,5}};
        System.out.println(arraySquare(arrNum));
    }
    public static boolean arraySquare(int[][] rows){
        boolean result=true;
        int max=1;
        for (int i=0; i<rows.length; i++){
            if (max>rows[i].length){
                result =true;
            }
        }
        return result;

    }
}

