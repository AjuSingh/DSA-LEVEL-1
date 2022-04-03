package linkedList;

public class LL {
    int size = 0;
    Node head;
    Node tail;
    LL(){
        this.size = 0;
    }

    void insertAtBeg(int val){
        Node node  = new Node(val);
        //when we insert node at the beginning for first time
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }  
        size+=1;
    }

   void insertAtEnd(int val){
        Node node = new Node(val);
        if(head == null){
            insertAtBeg(val);
            return;
        }
        tail.next = node;
        //in this
        tail = node;
        size+=1;
    }

    void deleteFirst(){
        if(size==0){
            return;
        }
        if(size==1){
            head=null;
            tail=null;
            return;
        }
        head = head.next;
        size-=1;
    }

    void deleteEnd(){
        if(size==0){
            return;
        }
        if(size==1){
            head=null;
            tail = null;
            return; 
        }
        Node temp =  head;
        while(temp.next.next!=null){
            temp = temp.next;
        }

        tail = temp;
        temp.next = null;
        size-=1;
    }

    void deletePos(int pos){
        if(pos>size || pos<1){
        return;
        }

        if(pos==1)
        {
            deleteFirst();
            return;
        }

        if(pos==size){
            deleteEnd();
            return;
        }
        
        int cnt=1;
        Node temp = head;
        while(cnt!=pos-1){
            temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;
        return;
    }



    Node get(int pos){
        Node temp = head;
        if(temp==null){
            return null;
        }

        int cnt=1;
        while(cnt!=pos){
            temp=temp.next;
            cnt++;
        }
       return temp;
    }

   void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    void insetAtPos(int pos,int val){
        //if the pos doesn't exist
        if(pos>size || pos<1){
            System.out.println("position doesn't exist");
            return;
        }


        if(pos==1){
            insertAtBeg(val);
            return;
        }

        if(pos==size){
            insertAtEnd(val);
            return;
        }

        int cnt = 1;
        Node temp = head;
        while(cnt!=pos-1){
            temp = temp.next;
            cnt++;
        }
        
       
        
        Node node = new Node(val);
        //new node point to exist postion node
        node.next  = temp.next;
        //back node point to new node
        temp.next = node;
        size+=1;
        return;
    }

    public class Node{
     int val;
     Node next;


    Node(int val){
        this.val = val;
    }


    }
}
