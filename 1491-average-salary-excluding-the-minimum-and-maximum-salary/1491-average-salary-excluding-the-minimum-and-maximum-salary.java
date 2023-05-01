class Solution {
    public double average(int[] salary) {
        int len=salary.length;
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(salary[i]<min) min=salary[i];
            if(salary[i]>max) max=salary[i];
            sum+=salary[i];
        }
        return (double)(sum-min-max)/(double)(len-2);
    }
}