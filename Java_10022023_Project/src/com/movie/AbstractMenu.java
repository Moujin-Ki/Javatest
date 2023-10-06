package com.movie;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu{
	
	protected String menuText;
	protected Menu prevMenu;
	protected static final Scanner sc = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevmenu) {
		this.menuText = menuText;
		this.prevMenu = prevmenu;
		
	}
	
	@Override
	public void print() {
		System.out.println("\n" + menuText);
	}
	
	public void SetPrevMenu(Menu prevMenu) {
		this.prevMenu =  prevMenu;
	}

	

	
	
	

}
