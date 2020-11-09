package work;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null ;
		String sex = null ;
		int age = 0 ;
		int stufee = 0 ;
		int salary = 0 ;
		//第二个人
		String name_2 = null ;
		String sex_2 = null ;
		int age_2 = 0 ;
		int stufee_2 = 0 ;
		int salary_2 = 0 ;
		Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        // next方式接收字符串
        System.out.println("请输入第一个博士研究生的姓名：");
        
        // 判断是否还有输入
        if (scan.hasNext()) {
            name= scan.next();
        }
        System.out.println("请输入第二个博士研究生的姓名：");
        
        if (scan.hasNext()) {
            name_2= scan.next();
        }
        System.out.println("请输入第一个博士研究生的性别：");
        if (scan.hasNext()) {
            sex= scan.next();
        }
        System.out.println("请输入第二个博士研究生的性别：");
        if (scan.hasNext()) {
            sex_2= scan.next();
        }
        try {
        	System.out.println("请输入第一个博士研究生的年龄：");
            if(scan.hasNext() ){
            	age=Integer.valueOf(scan.next());
            	 if(age<=0) {
              	   throw new Exception("请把第一个博士研究生的年龄输入一个大于等于0得数");
                 }
            }
        	System.out.println("请输入第二个博士研究生的年龄：");
            if(scan.hasNext() ){
            	age_2=Integer.valueOf(scan.next());
            	 if(age<=0) {
                	   throw new Exception("请把第二个博士研究生的年龄输入一个大于等于0得数");
                   }
            }
            
            System.out.println("请输入第一个博士研究生的学费：");
            if(scan.hasNext() ){
            	stufee=Integer.valueOf(scan.next());
            	 if(stufee<=0) {
                	   throw new Exception("请把第一个博士研究生的学费输入一个大于等于0得数");
                   }
            }
            System.out.println("请输入第二个博士研究生的学费：");
            if(scan.hasNext() ){
            	stufee_2=Integer.valueOf(scan.next());
            	 if(stufee_2<=0) {
              	   throw new Exception("请把第二个博士研究生的学费输入一个大于等于0得数");
                 }
            }
            System.out.println("请输入第一个博士研究生的工资：");
            if(scan.hasNext() ){
            	salary=Integer.valueOf(scan.next());
            	 if(salary<=0) {
                	   throw new Exception("请把第一个博士研究生的工资输入一个大于等于0得数");
                   }
            }
            System.out.println("请输入第二个博士研究生的工资：");
            if(scan.hasNext() ){
            	salary_2=Integer.valueOf(scan.next());
            	 if(salary_2<=0) {
              	   throw new Exception("请把第二个博士研究生的工资输入一个大于等于0得数");
                 }
            }
            People p=new People(name, sex, age, stufee, salary);
    		People p1=new People(name_2, sex_2, age_2, stufee_2, salary_2);
            //p.tax(p);
            
            p.tax(p.getSalary());
            p1.tax(p1.getSalary());
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println("发生异常："+e.getMessage());
		}
     
        scan.close();
   
	}
	

}
