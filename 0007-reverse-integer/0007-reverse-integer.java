class Solution {
    public int reverse(int x) {
        long rev=0;
        if(x>0){
        while(x>0){
            int Lastdigit=x%10;
            rev=(rev*10)+Lastdigit;
            x=x/10;
        }
        }
        else{
            x*=-1;
            while(x>0){
            int Lastdigit=x%10;
            rev=(rev*10)+Lastdigit;
            x=x/10;
             }
        rev*=-1;
        }
        if( rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}