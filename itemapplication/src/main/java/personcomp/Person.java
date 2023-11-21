package personcomp;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String personName;
	private String personAddress;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
		
		personName="Peter Chang";
		personAddress="23 old baker street";
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAddress=" + personAddress + "]";
	}
	public Person(String personName, String personAddress) {
		super();
		this.personName = personName;
		this.personAddress = personAddress;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	

}
