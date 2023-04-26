class Solution {
    public int addDigits(int num) {
        return num==0 ? 0: 1+(num-1)%9;
    }
}
// other method:
// class Solution {
//     public int addDigits(int num) {
//         if(num<10) return num;
//         int x=0;
//         while(num>0){
//             x+=num%10;
//             num/=10;
//         }
//         return addDigits(x);
//     }
// }