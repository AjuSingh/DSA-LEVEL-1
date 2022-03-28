package Oops.Inheritence;

public class BoxPrice extends BoxWeight{
int price;

BoxPrice(){
    this.price = 0;
}


BoxPrice(int price , int weight){
    super(weight);
    this.price = price;
}

BoxPrice(int price){
    this.price = price;
}
}
