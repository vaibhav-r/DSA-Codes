class Solution {
    public String kthDistinct(String[] arr, int k) {
        String st=new String("");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int j=0;j<arr.length;j++){
            if(map.get(arr[j])==1){
                if(k==1) st=arr[j];
                k--;
            }
            if(k==0) break;
        }
        return st;
    }
}