package StackAndQueue;
import java.util.*;
public class StackUsingLl<T> {
Node<T> top;
private int size;
static class Node <T>{
	T data;
	Node<T> next;
	
	Node(T data,Node<T> next){
		this.data = data;
		this.next = next;
	}	
}


StackUsingLl(){
	size = 0;
}

void push(T data) {
	if(top==null) {
		top = new Node(data,null);
	}else {
		top = new Node(data,top);
	}
	size++;
}

T remove() throws Exception {
	if(top==null) throw new Exception("Stack is empty");
	T data = (T)top.data;
	top= top.next;
	size--;
	return data;
}


T top() throws Exception{
	if(top==null) throw new Exception("Stack is empty");
	T data = (T)top.data;
	return data;
}


int size() {
	return size;
}



}
