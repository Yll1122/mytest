package com.sun.homework6;

public class Test4 {
		
		      public static void main(String[] args) {
		  //		i.创建老师对象t,并把名称赋值为”王小平”,年龄赋值为30,工资赋值为8000
		          Teacher t = new Teacher("王小平", 30, "Java");
		  //		iii.调用老师对象t的讲解方法
		          t.teach();
		
		  //		iv.创建学生对象 s,并把名称赋值为”李小乐”,年龄赋值为14,成绩赋值为90分.
		          Student s = new Student("李小乐", 14, 90);
		  //		vi.调用学生对象 s 的考试方法
		          s.exam();
		      }
		  }
		
		   class Person {
		      private String name;
			  private  int age;

			   public String getName() {
				   return name;
			   }

			   public void setName(String name) {
				   this.name = name;
			   }

			   public int getAge() {
				   return age;
			   }

			   public void setAge(int age) {
				   this.age = age;
			   }

			   public Person(String name, int age) {
				   this.name = name;
				   this.age = age;
			   }

			   public Person() {
			   }
			   void showMsg(){
				   System.out.println("");
			   }
		   }
		  /*
		   2.定义老师类(Teacher),继承Person类
		   */
		   class Teacher extends Person {
		    private String subject;

			  public String getSubject() {
				  return subject;
			  }

			  public void setSubject(String subject) {
				  this.subject = subject;
			  }

			  public Teacher(String name, int age, String subject) {
				  super(name, age);
				  this.subject = subject;
			  }

			  public Teacher() {
			  }

			  public void teach() {
				  System.out.println(getName()+"老师,讲授"+getSubject()+"课");
			  }
		  }
		  /*
		   3.定义学生类(Student),继承Person类
		   */
		   class Student extends Person {
		     private int score;

			  public Student(String name, int age,int score) {
				  super(name, age);
				  this.score=score;
			  }

			  public Student() {
			  }

			  public int getScore() {
				  return score;
			  }

			  public void setScore(int score) {
				  this.score = score;
			  }

			  public void exam() {
				  System.out.println(getName()+"同学,考试得了:"+getScore()+"分");
			  }
		  }