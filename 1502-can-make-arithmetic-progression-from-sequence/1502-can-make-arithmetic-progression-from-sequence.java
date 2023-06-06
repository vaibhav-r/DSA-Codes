class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==0||arr.length==1) return true;
        Arrays.sort(arr);
        int cnt=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if((arr[i]-arr[i-1])!=cnt) return false;
        }
        return true;
    }
}