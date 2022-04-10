package StackAndQueue.stacksquestion;

public class MinStack {
  private int DEFAULT_SIZE=5;
  private int[] main;
  private int[] help;
  private int ptrMain=-1;
  private int ptrHelp=-1;

  MinStack(){
      main = new int[DEFAULT_SIZE];
      help = new int[DEFAULT_SIZE];
  }

  private void doubleSize(){
       DEFAULT_SIZE*=2;
  }

  int getMin() throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is empty");
    }
    return help[ptrHelp];
  }

  boolean isEmpty(){
      if(ptrMain==-1 || ptrHelp==-1){
          return true;
      }
      return false;
  }

  int size(){
      return ptrMain+1;
  }

  void push(int data){
    if(ptrMain+1==DEFAULT_SIZE){
        doubleSize();
        int[] temp = new int[DEFAULT_SIZE];
        for(int i=0;i<=ptrMain;i++){
            temp[i] = main[i];
        }
        main = temp;
        //you can increase the size of min stack if you want;
    } 
    if(isEmpty()){
        ptrMain++;
        ptrHelp++;
        main[ptrMain] = data;
        help[ptrHelp] = data;
    }else{
        if(data<help[ptrHelp]){
            ptrMain++;
            ptrHelp++;
            main[ptrMain] = data;
            help[ptrHelp] = data;
        }else{
            ptrMain++;
            main[ptrMain] = data;
        }
    }
  }


  int pop() throws Exception{
      if(isEmpty()){
          throw new Exception("Stack is empty...");
      }
      
      if(main[ptrMain] == help[ptrHelp]){
          ptrMain--;
          ptrHelp--;
      }else{
          ptrMain--;
      }
      return main[ptrMain+1];
  }


}
