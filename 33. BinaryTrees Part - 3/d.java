import java.util.*;
public class d {
    static List<List<Integer>> permutations = new ArrayList<>();
    public static void  swapNums(List<Integer> a, int i, int j) {
        
        int temp;
        temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }
    //Function for generating different permutations of the string  
    public static void generatePermutation(List<Integer> permutation, int start, int end)  
    {  
        //Adds the permutation 
        if (start == end-1)  
            permutations.add(permutation);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the permutation by fixing a number  
                swapNums(permutation, start, i);  
                //Recursively calling function generatePermutation() for rest of the numbers   
                generatePermutation(permutation, start+1, end);  
                //Backtracking and swapping the numbers again.  
                swapNums(permutation, start, i);  
            }  
        }  
    }  
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        List<Integer> n = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            n.add(nums[i]);
        // System.out.println(n);
        generatePermutation(n, 0, 3);
        // System.out.println(permutations);
    }
}
