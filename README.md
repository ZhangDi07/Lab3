# Lab3  
第三个实验作业 11.9  
计G201 2020322063  
张迪  
##实验内容  
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

##实验目的  
掌握Java中抽象类和抽象方法的定义；   
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
了解异常的使用方法，并在程序中根据输入情况做异常处理

##实验过程  
1.首先创建两个接口类，分别是StudentMnager和TeacherManager；创建一个People类实现这两个接口，再创建一个测试类（主类）。  
2.在两个接口中分别定义对应接口的方法，在People类中定义了name、sex、age、stufee(学生学费)、salary(薪资)、taxsum(纳税额)等属性，还定义了一个final static类型的税率标准（TAXFEE=5000)。写了构造方法和set、get方法并重写两个接口的方法。
编写纳税方法，采用阶梯式纳税，最终的工资=工资-学费。然后判断最终的工资满足纳税方法中的哪一个（其中用到了if判断），然后进行计算。求出来的值再乘12个月，得出一年应交的税。若都不满足，执行else里的内容不交税！  
3.在test类中把两名学生分开设置，分别定义了属性。用next方式判断了是否还有输入，还用了从键盘接收数据的方式（Scanner）。利用try捕获了年龄，学费，薪资的异常，在其中用if语句进行了判断，年龄、学费、薪资不能输入非正或者文字，如进行输入会抛出异常。然后调用了People类中的tax(纳税额度)方法，进行输出。

##核心方法  
1.构造方法（无参、有参）
```
public  People() {
		  
	  }
	 public  People(String name,String sex,int age,int stufee,int salary) {
		  this.name=name;
		  this.sex=sex;
		  this.age=age;
		  this.stufee=stufee;
		  this.salary=salary;
	  }
  ```
  2.纳税额度的方法
  ```
  public void tax(int sa) {
		salary=salary-TAXFEE;
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
  ```
  3.抽象方法(StudentManager类)
  ```
  void payfee(int money);//交学费
	int checkfee();//查学费
  ```
  4.抽象方法(TeacherManager类)
  ```
  void payroll(int salary);//发放薪水
	int querysalary();//查询薪水
  ```
##运行结果  
1.正常的运行结果  
![alt console](https://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/bqQfVz5yrrGYSXMvKr.cqVXHf29vbrPikIXaCpZoBh7scuc**22eqKC8KIbPIyvzCWZdVB9*KifTx2ZJqnaDQPZe6yyM6IHmXXSF2cWBUh4!/b&bo=bwEzAgAAAAADB30!&rf=viewer_4)  
2.学费输入错误的异常  
![alt console](http://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/TmEUgtj9EK6.7V8ajmQrEAibGImM37eldiWeaLju1m7MdBw.4oSZ8JSnMSQrGmHFQQoX3NCsCuERS.i3dntr5lwjDxJprrV.VLErmQ5Kh8E!/b&bo=mwGqAQAAAAADFwM!&rf=viewer_4)  
3.年龄输入错误的异常  
![alt console](http://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/TmEUgtj9EK6.7V8ajmQrEEhiEBNn2GFbEugeU80Iy1vJODDoqbOJUoqKs0ZrOej3gv*MVs11jlMe8gcNeNqFSr0YCTdGm.GJUASYkiblQ4A!/b&bo=AAJYAQAAAAADF2k!&rf=viewer_4)

##实验感想  
通过本次实验，我学会了Java中抽象类和抽象方法的定义；掌握了Java中接口的定义，接口的定义形式以及接口的实现方法；会使用异常方法，并会在程序中根据输入情况做异常处理。但是在实验中遇到了很多问题，比如异常中无法在出问题的地方抛出和不能抛出异常等。不能抛出异常需要自定义一个异常，在相应位置即可解决，无法在出问题的地方抛出异常，是因为每一个代码块后边都要写一个自定义异常，这样抛出异常就可以终止程序。今后还需要更深入的学习JAVA编程~
