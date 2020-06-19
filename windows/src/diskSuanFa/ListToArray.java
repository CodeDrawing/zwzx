package diskSuanFa;

import java.util.List;

/**
 * @author zx
 * @date 2020/6/19
 **/
public class ListToArray {
    public int[] text01(List<Integer> list){
        int[] nums=new int[list.size()];
        int flag=0;
        for (Integer num : list) {
            nums[flag]=num;
            flag++;
        }
        return nums;
    }
}
