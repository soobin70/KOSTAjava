package com.kosta.shop;

import java.util.Scanner;

import com.kosta.product.Goods;

import dao.GoodsDAO;
import dao.OrderDAO;

public class Shop {
	private GoodsDAO goodsDAO;
	private OrderDAO orderDAO;
	public Shop() {
		goodsDAO = new GoodsDAO();
		orderDAO = new OrderDAO();
	}
	public void addProduct() {
		System.out.println("[상품등록]");
		System.out.print("제품명 :");
		String name = sc.nextLine();
		System.out.print("제품 가격:");
		Integer price = Integer.parseInt(sc.nextLine());
		System.out.print("제품 수량:");
		Integer stock = Integer.parseInt(sc.nextLine());
		System.out.print("제품 종류: ");
		String category = sc.nextLine();
		goodsDAO.insertGoods(new Goods(name,price,stock,category));
		
	}
	public void GoodsInfo() {
		
	}
	  Scanner sc = new Scanner(System.in);
	  public int menu() {
	      System.out.println("[상품 등록/주문 등록]");
	      System.out.println("1.상품 등록");
	     
	      System.out.println("선택>>");
	      return Integer.parseInt(sc.nextLine());
	   }

	//구현해야 하는 부분: ApplicationMain.java 오류 없이 작동하도록 필요한 모든 메서드를 구현한다.
	
	
	
}
