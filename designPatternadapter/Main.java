package designPatternadapter;

import java.util.*;

public class Main {
	EmployeeDetails em = new EmployeeDetails();
	Adapter ad = new Adapter(em);
	Interanet intra = new Interanet(ad);

}
