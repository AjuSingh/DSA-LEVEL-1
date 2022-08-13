package StackAndQueue;
import java.util.*;


public class CustomArrayList<T>{
private int size=0;
private int DEFAULT_SIZE = 5;
private Object[] arr;
CustomArrayList(){
	arr = new Object[DEFAULT_SIZE];
}


T add(T data) {
	if(size>=arr.length) {
		resize();
	}
	arr[size++] = data;
	return data;
}


T get(int ind) {
	return (T)arr[ind];
}


void resize() {
	int curSize = arr.length;
	Object[] temp = new Object[curSize*2];
	for(int i=0;i<size;i++) {
		temp[i] = arr[i];
	}
	arr = temp;
}

int size() {
	return size;
}

public String toString() {
	String str="[";
	for(int i=0;i<size;i++) {
		if(i==size-1) {
			str+=arr[i]+"]";
		}else {
			str+=arr[i]+" , "; 
		}
	}
	return str;
}
}
