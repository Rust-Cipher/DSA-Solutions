class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse= 0;
        int remainder; 
        if(x < 0 ){
            return false;
        }
        while(temp != 0) {
            remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp/10;
        }
        if (reverse == x){
            return true;
        }
        else{
            return false;
        }

    }
}