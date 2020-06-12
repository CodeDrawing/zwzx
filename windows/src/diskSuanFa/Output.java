package diskSuanFa;

/**
 * @author zx
 * @date 2020/6/10
 **/
public class Output {
    public String outPut(int[] nums){
        String str="";
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            if(i==len){
                str=str+nums[i];
            }else if(i==0){
                str=str+nums[i];
            }else{
                str=str+"->"+nums[i];
            }
        }
        return str;
    }
}
