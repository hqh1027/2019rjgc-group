import java.util.ArrayList;

public class Prime {
    public static int[] primeNumber(int length) {
        int temp = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=length;i++) {
            if(i%2!=0) {
                list.add(i);
            }
        }
        int returnArray[] = new int[list.size()];
        for(int t=0;t<list.size();t++) {
            returnArray[t]=list.get(t);
        }
        return returnArray;
    }
}
