package com.sun.homework3;

public class Manager {
    private  String name;
    private String code;
    private int[] salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    Manager(){}
    Manager(String name,String code,int[] salary)
    {
        this.code=code;
        this.name=name;
        this.salary=salary;
    }
    public void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号："+code);
    }
    public void showSalary()
    {
        System.out.println("基本工资为"+salary[0]+",奖金为"+salary[1]);
    }
    public void work(){
        System.out.println("正在努力做着管理工作，分配任务，检查员工提交上来的代码.......");
    }
}
