package diskSuanFa;

import java.util.ArrayList;
import java.util.List;

public class SSTF2 {
    public List<Integer> run01(int[] nums, int start) {
        //新建一个list集合，把nums转换成集合来操作
        List<Integer> list = new ArrayList<>();
//        新的集合
        List<Integer> newList = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int min = Math.abs(list.get(0) - start);
        int x = 0;
        int temp = 0;
        int len = list.size();
        int sum=0;
        for (int j = 0; j < len; j++) {

            for (int i = 0; i < list.size(); i++) {
                x = Math.abs(list.get(i) - start);
                if (x < min) {
                    min = x;
                    temp = list.get(i);
                }
            }
            min=200;
            sum=sum+min;
            start=temp;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == temp) {
                    list.remove(i);
                    newList.add(temp);
                }
            }
        }
        System.out.println(sum/nums.length);
        System.out.println(newList);
        return newList;
    }
}
