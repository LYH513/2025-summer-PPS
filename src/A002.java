import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A002 {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            int arr[][] = new int [numRows][];

            arr[0] = new int[]{1};
            result.add(Arrays.asList(1));

            if (numRows == 1){
                return result;
            }

            arr[1] = new int[]{1, 1};
            result.add(Arrays.asList(1, 1));

            for (int i=2; i<numRows; i++){
                arr[i] = new int[i+1];

                for (int j=0; j<i+1; j++){
                    if(j==0 || j==i){
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }
                }

                List<Integer> rowList = new ArrayList<>();
                for (int val : arr[i]) {
                    rowList.add(val);
                }
                result.add(rowList);

            }

            return result;

        }
}
