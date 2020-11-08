package work;

public  class People implements StudentManager,TeacherManager {
	 private String name;
	 private String sex;
	 private int age;
	 private int stufee;
	 private int salary;
	private String taxsum;
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
	public void tax(int stufee,int salary) {
		int have=salary*12-stufee*2;
		
		if(have<36000) {
			int taxsum=(int) (have*0.03);
			System.out.println("应交的税："+taxsum+"元");
		}
		else if(have<144000&&have>36000) {
			int taxsum=(int) (have*0.01);
			System.out.println("应交的税："+taxsum+"元");
		}
		else if(have<300000&&have>144000) {
			int taxsum=(int) (have*0.02);
			System.out.println("应交的税："+taxsum+"元");
		}
		//System.out.println("我是纳税额度"+taxsum);
	}
	public void tax(int stufee_2,int salary_2,String a ) {
		int have=salary*12-stufee*2;
		
		if(have<36000) {
			int taxsum=(int) (have*0.03);
			System.out.println("第二个人应交的税："+taxsum+"元");
		}
		else if(have<144000&&have>36000) {
			int taxsum=(int) (have*0.01);
			System.out.println("第二个人应交的税："+taxsum+"元");
		}
		else if(have<300000&&have>144000) {
			int taxsum=(int) (have*0.02);
			System.out.println("第二个人应交的税："+taxsum+"元");
		}
		//System.out.println("我是纳税额度"+taxsum);
	}
	
}
