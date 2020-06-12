package diskSuanFa;

/**
 * @author zx
 * @date 2020/6/9
 **/
public class FCFS {
    public void run01(int[] nums,int start){
        int size=nums.length;
//        计数
        double sum = 0.0;
        for (int i = 0; i < nums.length-1; i++) {
            if(i==0){
                sum =sum+Math.abs(start-nums[0]);
            }else {

                sum=sum+Math.abs(nums[i+1]-nums[i]);
            }
            System.out.println(sum);
        }

        double avg=sum/size;
        System.out.println(avg);
    }
}
