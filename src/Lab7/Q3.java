package Lab7;
import java.util.*;
import java.util.regex.*;
public class Q3 {
    static Queue<Integer> shareQueue=new LinkedList<>();
    static Queue<Integer> priceQueue=new LinkedList<>();
    static int totalCapitalGain = 0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String query=sc.nextLine();

            if(query.equals(""))
                break;

            Pattern pattern=Pattern.compile("(Buy|Sell) (\\d+) shares at \\$(\\d+) each");
            Matcher matcher=pattern.matcher(query);

            if(!matcher.find()){
                System.out.println("Invalid query");
                continue;
            }

            boolean isBuying = matcher.group(1).equals("Buy");
            int share = Integer.parseInt(matcher.group(2));
            int price = Integer.parseInt(matcher.group(3));

            if (isBuying) buy(share, price);
            else          sell(share, price);

        }
        System.out.println("Final Capital Gain / Loss: " + totalCapitalGain);
    }

    private static void buy(int shares,int prices){
        System.out.println("Buying now...");
        shareQueue.offer(shares);
        priceQueue.offer(prices);
        System.out.println("Queue for Share: "+shareQueue.toString());
        System.out.println("Queue for Price: "+priceQueue.toString());
    }

    private static void sell(int share, int price) {
        System.out.println("Selling the shares now...");
        while (share > 0) {
            assert shareQueue.size() == priceQueue.size();
            if (shareQueue.isEmpty()) {
                System.out.println("No shares to sell!");
                break;
            }
            if (share >= shareQueue.peek()) {
                totalCapitalGain += shareQueue.peek() * (price - priceQueue.poll());
                share -= shareQueue.poll();
            } else {
                totalCapitalGain += share * (price - priceQueue.peek());
                shareQueue.offer(shareQueue.poll() - share);
                for (int i = shareQueue.size(); i > 1; i--)
                    shareQueue.offer(shareQueue.poll());
                share = 0;
            }
            System.out.println("Total Capital Gain / Loss: " + totalCapitalGain);
        }
        System.out.println("Queue for Share: Queue: " + shareQueue);
        System.out.println("Queue for Price: Queue: " + priceQueue);
    }
}
