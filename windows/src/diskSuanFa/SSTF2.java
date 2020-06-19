package diskSuanFa;

import java.util.ArrayList;
import java.util.List;

public class SSTF2 {
    public void run01(int[] nums, int start) {
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

            sum=sum+min;
            start=temp;
//            设置一个尽量较大的数
            min=10000;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == temp) {
                    list.remove(i);
                    newList.add(temp);
                }
            }
        }
        Output output=new Output();


        System.out.println(output.outputList(newList));
        System.out.println("平均寻道长度为"+sum/nums.length);

    }
}
