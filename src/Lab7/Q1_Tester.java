package Lab7;
public class Q1_Tester {
    public static void main(String[] args){
        String[] fruitQ={"Durian","Blueberry"};
        MyQueue<String> fruitQ1=new MyQueue<>(fruitQ);
        fruitQ1.enqueue("Apple");
        fruitQ1.enqueue("Orange");
        fruitQ1.enqueue("Grapes");
        fruitQ1.enqueue("Cherry");
        //display the queue
        System.out.println(fruitQ1.toString());
        //show the top item
        System.out.println("Top item: "+fruitQ1.peek());
        //get the queue size
        System.out.println("The queue size: "+fruitQ1.getSize());
        //Delete durian
        System.out.println(fruitQ1.dequeue()+" deleted");
        //Get the item in index position 2
        System.out.println("The item at position 2: "+fruitQ1.getElement(2));
        System.out.println("Checking whether the queue consists of Cherry: "+fruitQ1.contains("Cherry"));
        System.out.println("Checking whether the queue consists of Durian: "+fruitQ1.contains("Durian"));
        System.out.print("fruitQ: [ ");
        while(!fruitQ1.isEmpty()){
            System.out.print(fruitQ1.dequeue()+" ");
        }
        System.out.println("]");
    }
}
