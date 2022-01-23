// My Bruteforce Method
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int[] arr =             {1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,78,89,123,234,345,456,567,678,789,1234,2345,3456,4567,5678,6789,12345,23456,34567,45678,56789,123456,234567,345678,456789,1234567,2345678,3456789,12345678,23456789,123456789};
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<45; i++){
            if(low<=arr[i] && arr[i]<=high){
                list.add(arr[i]);
            }
            if(high<arr[i]){
                break;
            }
        }
        return list;
    }
}

// 2nd Method

class Solution {
public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<Integer>();
        int num = 0;
        for(int i = 1; i<10 ; i++)
        {
            num = i;
            for(int j = i+1;j<10;j++)
            {
                num = num*10 + j;
                if(num >= low && num <= high)
                {
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
};
