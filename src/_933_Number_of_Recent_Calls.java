import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {
    class RecentCounter {
        private Queue<Integer> myQueue = new LinkedList<>();
        public RecentCounter() {

        }

        public int ping(int t) {
        myQueue.add(t);

        while(myQueue.peek() < (t-3000)){
            myQueue.remove();
        }
        return myQueue.size();
        }
    }
}
