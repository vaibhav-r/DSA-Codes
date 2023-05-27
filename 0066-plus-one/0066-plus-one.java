class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length,cnt=0;
        if(digits[n-1]<9) {
            digits[n-1]+=1;
            return digits;
        }
        int c=n;
        while(n>0 && digits[n-1]==9){
            cnt++;
            digits[n-1]=0;
            n--;
        }
        if(c==cnt){
            int[] a=new int[c+1];
            a[0]=1;
            for(int i=1;i<a.length;i++){
                a[i]=0;
            }
            return a;
        }
        else{
            digits[c-cnt-1]+=1;
        }
        return digits;
    }
}