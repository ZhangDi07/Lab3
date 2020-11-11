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
1.首先创建一个People类（主类）；再创建两个接口类，分别是StudentMnager和TeacherManager；在创建一个测试类。  
2.在People类中定义了name、sex、age、stufee(学生学费)、salary(薪资)、taxsum(纳税额)等属性，还定义了一个final static类型的税率标准（TAXFEE=5000)。写了构造方法和set、getf方法。
编写纳税方法，采用阶梯式纳税  
3.在StudentMnager和TeacherManager类中，定义了相关属性  
4.在test类中利用try，catch捕获了年龄，学费，薪资的异常。当年龄输入负数或者文字时会抛出相关异常；当学费、薪资输入负数、文字等也会抛出有关异常。
##核心方法  
##运行结果  
1.正常的运行结果  
![alt console](http://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/TmEUgtj9EK6.7V8ajmQrEB*4icxt.xdxc7a4F2KHxfuLprWtWvROpYU4E4vbY2onWr3G6CDdrrXAxTrLKhxsdhPn5nU7eqQBRL8eTvCW30M!/b&bo=zwEnAgAAAAADF9k!&rf=viewer_4)  
2.学费输入错误的异常  
![alt console](http://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/TmEUgtj9EK6.7V8ajmQrEAibGImM37eldiWeaLju1m7MdBw.4oSZ8JSnMSQrGmHFQQoX3NCsCuERS.i3dntr5lwjDxJprrV.VLErmQ5Kh8E!/b&bo=mwGqAQAAAAADFwM!&rf=viewer_4)  
3.年龄输入错误的异常  
![alt console](http://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/TmEUgtj9EK6.7V8ajmQrEEhiEBNn2GFbEugeU80Iy1vJODDoqbOJUoqKs0ZrOej3gv*MVs11jlMe8gcNeNqFSr0YCTdGm.GJUASYkiblQ4A!/b&bo=AAJYAQAAAAADF2k!&rf=viewer_4)

##实验感想
