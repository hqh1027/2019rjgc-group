public class Sort {
    public static int  MaxArray(int [] array,int length) {
        int max = array[0];
        int total = 0;
        int temp = 0;
        for(int x=0;x<length;x++) {
            total = 0;
            for(int i=x;i<length;i++) {
                total = total+array[i];
                if(max<total) {
                    max = total;
                }
            }
        }
        return max;
    }
}
