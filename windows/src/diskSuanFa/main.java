package diskSuanFa;

import java.util.*;

/**
 * @author zx
 * @date 2020/6/9
 **/
public class main {
    public static void main(String[] args) {
//创建对象
        ListToArray listToArray=new ListToArray();
        Output output=new Output();

//        输入
        System.out.println("新建一个单链表，以0作为结束标志：");
        Scanner input=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int inputNum=input.nextInt();
        while (inputNum!=0){
            list.add(inputNum);
            inputNum=input.nextInt();
        }
        System.out.println("从第几号磁道开始：");
        int start=input.nextInt();
//        把集合转换成数组
        int[] ints = listToArray.text01(list);
        String s = output.outputArray(ints);
        System.out.println(s);
        System.out.println("链表长度为:"+list.size());
        System.out.println("1、先来先服务算法FCFS");
        System.out.println("2、最短寻道实践优先算法SSTF");
        System.out.println("3、电梯调度算法<扫描算法SCAN>");
        System.out.println("其他：退出");
        System.out.println("请选择：");
        String choose=input.nextLine();
        System.out.println(choose);
        if(choose=="1"){

        }else if(choose=="2"){

        }else if(choose=="3"){

        }else if(choose=="其他"){

        }else{
            System.out.println("输入有误。程序结束");
        }


//       ================= fcfs算法 ===================
//        FCFS fcfs=new FCFS();
//        fcfs.run01(nums,100);
//        System.out.println("单链表显示"+new Output().outputAaary(nums));
//       ================= SSTF算法 ===================

//        long start=System.currentTimeMillis();
//        System.out.println(start);
//        SSTF2 sstf2=new SSTF2();
//        List<Integer> list = sstf2.run01(nums, 100);
//
//        System.out.println("单链表显示"+new Output().outputList(list));
//        System.out.println(System.currentTimeMillis()-start);

//        ================= SCAN算法 ===================
//        PaiXu paixu=new PaiXu();
//        int[] ints = paixu.orderArrayDesc(nums);
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
//            SCAN scan=new SCAN();
//            scan.text01(nums,100);





    }
}
