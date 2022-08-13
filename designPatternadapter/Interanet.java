package designPatternadapter;
import java.util.*;

public class Interanet {
IphoneListSource source;
public Interanet(IphoneListSource source) {
	this.source = source;
}

 public void phoneNumber() {
	List<String> phones = this.source.getPhoneNumber();
	System.out.println(phones);
}
}
