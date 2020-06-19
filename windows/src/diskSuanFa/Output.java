package diskSuanFa;

import java.util.List;

/**
 * @author zx
 * @date 2020/6/10
 **/
public class Output {
    public String outputArray(int[] nums){
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
    public String outputList(List<Integer> list){
        String str="";
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()){
                str=str+list.get(i);
            }else if(i==0){
                str=str+list.get(i);
            }else{
                str=str+"->"+list.get(i);
            }
        }

        return str;
    }
}
