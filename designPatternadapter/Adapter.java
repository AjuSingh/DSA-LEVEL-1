package designPatternadapter;

import java.util.*;

public class Adapter implements IphoneListSource {
    private EmployeeDetails ds;
    public Adapter(EmployeeDetails ds) {
    	this.ds = ds;
    }
	@Override
	public List<String> getPhoneNumber() {
		List<String> emps = this.ds.getEmployees();
		List<String> phones = new ArrayList<>();
		for(String emp:emps) {
			String[] parts = emp.split("-");
			phones.add(parts[3]);
		}
		return phones;
	}

}
