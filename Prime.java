public class Prime{
public static void main(String[] args) {
    int num = 10;
    // boolean isPrime = true;
    // for(int i = 2; i < num; i++){
    //     if(num%i==0){
    //         isPrime = true;
    //         break;
    //     }
    // }
    // System.out.print(isPrime);
    // }

    int a=0,b=1;
    System.out.println(a);
    System.out.println(b);
    for(int i=2;i<=num;i++){
       int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
}
}