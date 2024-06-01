package com.sun.homework4;

import java.util.ArrayList;
import java.util.Random;

public class Test06 {
	    public static void main(String[] args) {
	        int n = 5;
	        ArrayList<String> cards = randomCard(n);

	        if (cards != null) {
	            System.out.println("随机"+ n +"张牌:" );
	            for (int i = 0; i < cards.size(); i++) {
					Card card=new Card();
	                card.showCard();
	            }
	        }else {
	            System.out.println(n+"超越范围,无法获取牌" );
	        }

	        System.out.println();
	        System.out.println();
	        int n2 = 55;
	        ArrayList<String> cards2 = randomCard(n2);

	        if (cards2 != null) {
	            System.out.println("随机"+ n2 +"张牌:" );
	            for (int i = 0; i < cards.size(); i++) {
					Card card=new Card();
	                card.showCard();
	            }
	        }else {
	            System.out.println("随机"+ n2 +"张牌:\r\n超越范围,无法获取" );
	        }
	    }
	    public static ArrayList<String> randomCard(int n) {
            ArrayList<String> arrayList=new ArrayList<>();
            Random random=new Random();
            for (int i = 0; i < n; i++) {
               arrayList.add(arrayList.get(random.nextInt(allCard().size())));
            }
                return arrayList;
	    }

	    public static ArrayList<String> allCard() {
            ArrayList<String> arrayList=new ArrayList<>();
            String[] hs={"黑桃","梅花","方片","红桃"};
            String[] ds={"A","2","3","4","5","6","7","8","9","10","K","J","Q"};
            for (int i = 0; i < hs.length; i++) {
                for (int j = 0; j < ds.length; j++) {
                    arrayList.add(hs[i]+ds[j]);
                }
            }
            return arrayList;
	    }



	}
	class Card {
	private String hs;
	private String ds;
		public  void showCard() {
			System.out.println(hs+ds+" ");
	}

}


