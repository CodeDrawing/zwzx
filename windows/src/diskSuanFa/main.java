package diskSuanFa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2020/6/9
 **/
public class main {
    public static void main(String[] args) {
        int[] nums={18,58,160,38,55,39,90,150,184};
//       ================= fcfs算法 ===================
//        FCFS fcfs=new FCFS();
//        fcfs.run01(nums,100);
//        System.out.println("单链表显示"+new Output().outPut(nums));
//       ================= sstf算法 ===================
//        Map<Integer,Integer> map=new HashMap<>();
//        map.put(1,2);
//        System.out.println(map.get(1));

        SSTF sstf=new SSTF();
        sstf.sstf(nums,100);
    }
}