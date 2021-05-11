package OopsConcept;

public class empWageOops implements WageCalci {
	int employeeDailywage=0;
	int salary=0;
	int emphr=8;
	int hr=8;
	int i=0;
public static void main(String[] args) {
	
	WageCalci wage=new empWageOops();
	System.out.println(wage.WageCal());
}

public int wagecal() {
	while(i<20 && hr<100)
	{
		if(Math.floor(Math.random()*10)%2 == 1)
		{
			
			employeeDailywage= emphr*hrrate;
			salary=employeeDailywage + salary;
			hr=hr+8;
			System.out.println("Present Employee");
		}
		else
		{
			
			
			employeeDailywage= emphr*0;
			System.out.println("Absent");
		}
		i=i+1;
	
	}
	return salary;
}

@Override
public int WageCal() {
	
	return 0;
}
}

interface WageCalci {
	int hrrate=20;
	
	int WageCal();
}

