class Solution {
    public boolean checkPerfectNumber(int num) {
        int cnt=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                cnt+=i;
                if(i*i!=num) cnt+=num/i;
            }
        }
        return cnt-num==num;
    }
}
// OR
// class Solution {
//     public boolean checkPerfectNumber(int num) {
//         int cnt=0;
//         for(int i=1;i*2<=num;i++){
//             if(num%i==0) cnt+=i;
//             if (cnt>num) return false;
//         }
//         return cnt==num;
//     }
    
// }