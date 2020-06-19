package diskSuanFa;


import java.util.List;

public class PaiXu {
//    数组排序 升序
    public int[] orderArray(int[] nums){

            if (nums.length == 0)
                return nums;
            for (int i = 0; i < nums.length; i++) {
                int minIndex = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] < nums[minIndex]) //找到最小的数
                        minIndex = j; //将最小数的索引保存
                }
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
            return nums;
    }


//    数组排序 降序
    public int[] orderArrayDesc(int[] nums){
        if(nums.length==0){
            return nums;
        }
        for (int i = 0; i <nums.length ; i++) {
            int maxIndex=i;
            for (int j=i;j<nums.length;j++){
                if(nums[j]>nums[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=nums[maxIndex];
            nums[maxIndex]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
//集合排序 升序
    public List<Integer> orderList(List<Integer> list){
        if(list.size()==0){
            return list;
        }
        for (int i = 0; i < list.size(); i++) {
            int minIndex=i;
            for (int j = i; j < list.size(); j++) {
                if(list.get(j)<list.get(minIndex)){
                    minIndex=j;
                }
            }
            int temp=list.get(minIndex);
            list.set(minIndex,list.get(i));
            list.set(i,temp);

        }
        return list;
    }
//    集合排序 降序
    public List<Integer> orderListDesc(List<Integer> list) {
        if (list.size() == 0) {
            return list;
        }
        for (int i = 0; i < list.size(); i++) {
            int maxIndex = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            int temp=list.get(maxIndex);
            list.set(maxIndex,list.get(i));
            list.set(i,temp);

        }
        return list;
    }

}
