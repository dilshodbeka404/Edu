package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 10:11. 22/11/22
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        else if(n<1 || n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
