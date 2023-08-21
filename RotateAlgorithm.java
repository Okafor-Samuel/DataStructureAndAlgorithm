import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    public static List<Integer> rotateArray (int d, List<Integer> arr){
        List<Integer> rotatedArray = new ArrayList<>(arr);
        for(int i =0; i< arr.size(); i++){
            int index = i <d ? ((d-i)>0 ? (arr.size()-(d-i) ): (d-i)): (i-d);
            rotatedArray.set(index, arr.get(i));
        }
        return rotatedArray;
    }
}
