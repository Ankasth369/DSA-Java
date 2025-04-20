import java.util.ArrayList;

public class ActivitySelection {
    // O(N)
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //Activities are sorted w.r.t end time
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        //first activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {   // or if (start[i] >= end[ans.get(maxAct-1)]) 
                //activity selected
                ans.add(i);
                maxAct++;
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activities:" + maxAct);
        System.out.print("Activites: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" A" + ans.get(i));
        }
        System.out.println();
    }
}
