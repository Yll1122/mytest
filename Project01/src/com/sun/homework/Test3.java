package com.sun.homework;

import java.util.ArrayList;

public class Test3 {
		    public static void main(String[] args) {
				ArrayList<User> arrayList=new ArrayList<>();
				for (int i = 1; i <= 50; i++) {
					arrayList.add(new User(i));//把i当做User加入到集合
				}
				Reception r1=new Reception();
				r1.setF(new Filter() {
					@Override
					public void filterUser(User u) {
						u.setType("v1");
						System.out.println(u);
					}
				});
				Reception r2=new Reception();
				r2.setF(new Filter() {
					@Override
					public void filterUser(User u) {
						u.setType("v2");
					}
				});
				Reception r3=new Reception();
				r3.setF(new Filter() {
					@Override
					public void filterUser(User u) {

					}
				});
				r1.getF();
			}
		}
		
		class Reception {
		
		    Filter f;
		
		    public Filter getF() {
		        return f;
		    }
		
		    public void setF(Filter f) {
		        this.f = f;
		    }
		
		    public void recept(User u) {
		        if (u.getType() != null)
		            return;
		        if (f != null) {
		            f.filterUser(u);
		            return;
		        } else {
		            u.setType("A");
		        }
		    }
		}
		
		class User {
		
		    private String type;
		
		    private int id;
		
		    public User(int id) {
		        this.id = id;
		    }
		
		    public int getId() {
		        return id;
		    }
		
		    public String getType() {
		        return type;
		    }
		
		    public void setType(String type) {
		        this.type = type;
		    }
		
		    @Override
		    public String toString() {
		        return id + "-" + type;
		    }
		}
		
		interface Filter {
		
		    public abstract void filterUser(User u);
		
		}