package diskSuanFa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2020/6/19
 **/
public class SCAN {
    public void text01(int[] nums, int start) {
//        需要两个新的集合来分成两块
//        小于start的
        List<Integer> minList=new ArrayList<>();
//        大于start的
        List<Integer> maxList=new ArrayList<>();

        for (int num : nums) {
            if(num<start){
                minList.add(num);
            }else{
                maxList.add(num);
            }
        }
        PaiXu paiXu=new PaiXu();
        paiXu.orderListDesc(minList);
        paiXu.orderList(maxList);
        System.out.println(minList);
        System.out.println(maxList);

//        总和
        int sum=0;
//        遍历大的集合
        for (Integer num : maxList) {
            sum=sum+Math.abs(num-start);
            start=num;
        }
        System.out.println(sum);
//遍历小的集合
        for (Integer num : minList) {
            sum=sum+Math.abs(num-start);
            start=num;
        }
        System.out.println(sum);
        for (Integer min : minList) {
            maxList.add(min);
        }
        Output output=new Output();
        String s = output.outputList(maxList);
        System.out.println(s);

        System.out.println("平均寻道长度为："+(float) sum/(float)nums.length);


    }

}