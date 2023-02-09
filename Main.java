import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j==i) continue;

                if((arr[i]+arr[j])%5==0){
                    temp = new ArrayList<>(List.of(arr[i],arr[j]));
                    Collections.sort(temp);
                    list.add(new ArrayList<>(temp));
                    temp = null;
                }
            }
        }
        System.out.println(list);
    }

}
