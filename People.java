package work;

public  class People implements StudentManager,TeacherManager {
	 private String name;
	 private String sex;
	 private int age;
	 private int stufee;
	 private int salary;
	 private double taxsum;
	 public final static int TAXFEE=5000; //定义税率标准
	 public  People() {
		  
	  }
	 public  People(String name,String sex,int age,int stufee,int salary) {
		  this.name=name;
		  this.sex=sex;
		  this.age=age;
		  this.stufee=stufee;
		  this.salary=salary;
	  }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStufee() {
		return stufee;
	}
	public void setStufee(int stufee) {
		this.stufee = stufee;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void payroll(int salary) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int querysalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void payfee(int money) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int checkfee() {
		// TODO Auto-generated method stub
		return 0;
	}
	//纳税额度的方法
	public void tax(int sa) {
		
	if(salary>0){
		if(salary <=1500){
			taxsum=salary*0.03;
		}else if(salary<=4500){
			taxsum=1500*0.03+(salary-1500)*0.1;
		}else if(salary<=9000){
			taxsum=1500*0.03+3000*0.1+(salary-4500)*0.2;
		}else if(salary<=35000){
			taxsum=1500*0.03+3000*0.1+4500*0.2+(salary-9000)*0.25;
		}else if(salary<=55000){
			taxsum=1500*0.03+3000*0.1+4500*0.2+26000*0.25+(salary-35000)*0.3;
		}else if(salary<=80000){
			taxsum=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(salary-55000)*0.35;
		}else {
			taxsum=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(salary-80000)*0.45;
		}
		System.out.println("你应交的税为："+taxsum*12);
		}else{
		System.out.println("不交税！");
		}
	
	}
}
