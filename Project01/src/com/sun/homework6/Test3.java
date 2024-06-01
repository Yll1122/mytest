package com.sun.homework6;

public class Test3 {
		    public static void main(String[] args) {
		        Duck duck = new Duck("鸭子", "感冒", 2, "发烧");
		        duck.showMsg();
		        duck.showSymptom();
		    }
		}
		
		/*
		1.定义抽象家禽类(Poultry)
		*/
		abstract class Poultry {
		    private String name;
			private String symptom;
			private int age;
			private  String illness;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSymptom() {
				return symptom;
			}

			public void setSymptom(String symptom) {
				this.symptom = symptom;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getIllness() {
				return illness;
			}

			public void setIllness(String illness) {
				this.illness = illness;
			}

			public Poultry(String name, String symptom, int age, String illness) {
				this.name = name;
				this.symptom = symptom;
				this.age = age;
				this.illness = illness;
			}

			public Poultry() {
			}
			abstract void showSymptom();
			void showMsg(){
				System.out.println("动物种类："+getName()+",年龄："+getAge()+"岁");
			}
		}
		
		// Duck 类
		
		class Duck extends Poultry {
			public Duck(String name, String symptom, int age, String illness) {
				super(name, symptom, age, illness);
			}

			public Duck() {
			}

			void showSymptom() {
				System.out.println("入院原因："+super.getSymptom());
				System.out.println("症状为："+super.getIllness());
			}
		}