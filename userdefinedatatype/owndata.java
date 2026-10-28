package userdefinedatatype;

public class owndata {
    public static void main(String[] args) {
        node a = new node();
        System.out.println(a.data);
        System.out.println(a.next);
        a.data=10;
        
        System.out.println(a.data);
        node n2= new node();
        n2.data=20;
        System.out.println(n2.data);
        node n3 = new node();
        
    }
}
/**
 * node
 */
 class node {
int data;
node next;

    
}