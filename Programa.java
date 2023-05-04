package Actividad;

public class programa {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.push('e');
        queue.push('q');
        queue.push('d');
        queue.push('p');
        
        
        System.out.println(queue.pull()); 
        System.out.println(queue.pull()); 
        System.out.println(queue.pull()); 
        System.out.println(queue.pull());
        System.out.println(queue.pull()); 
    }
}
