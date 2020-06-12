package diskSuanFa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SSTF {
    public void sstf(int[] nums,int start){
        int temp=0;
        PaiXu paiXu=new PaiXu();
//新建一个list集合，把最小路径的元素存进来
        List<Integer> newList=new ArrayList<>();
//新建一个Mao集合，用来存放最小的值和索引值
        Map<Integer,Integer> map=new HashMap<>();
        int min=Math.abs(start-nums[0]);
        //新建一个list集合，然后遍历原数组然后把他存入到这个集合中
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int size = list.size();

//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if(Math.abs(list.get(j)-start)<min){
//                    min=Math.abs(list.get(j)-start);
//                    newList.add(list.get(j));
//                    start=list.get(j);
//                    list.remove(j);
//                    flag=j;
//                }
//            }
//            newList.add(list.get(flag));
//                    start=list.get(flag);
//                    list.remove(flag);
//        }
        int j=0;
        boolean flag=true;
        List<Integer> list1=new ArrayList<>();
        for (int i = size; i > 0; i--) {
            for (j = 0; j < list.size(); j++) {
                if (Math.abs(list.get(j) - start) < min) {
//                    System.out.println(map);
                    list.add(list.get(j));
                    min = Math.abs(list.get(j) - start);

//                    map.put(j, list.get(j));
                    flag=false;

                }


//            start=map.get(temp);
            }

            start = list1.get(i);
            if(flag==false){
                list.remove(j-1);
                flag=true;
            }
        }


        System.out.println(newList);
    }
}
