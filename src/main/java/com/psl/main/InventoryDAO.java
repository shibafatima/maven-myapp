package com.psl.main;

import java.sql.Statement;
import java.util.ArrayList;

public class InventoryDAO {
	
	public static ArrayList DispList1(){
		
		
		
		InventoryBean l_ref = new InventoryBean();
		ArrayList list1 = new ArrayList();
		

		l_ref.setManufacturer("Tata");
		l_ref.setCarName("Nano");
		l_ref.setColorsAvailable("Red, White");
		l_ref.setPrice("6000");

		list1.add(0, l_ref);

		InventoryBean l_ref_1 = new InventoryBean();

		l_ref_1.setManufacturer("Maruti Suzuki");
		l_ref_1.setCarName("Alto");
		l_ref_1.setColorsAvailable("Red, White");
		l_ref_1.setPrice("8000");

		list1.add(1, l_ref_1);

		InventoryBean l_ref_2 = new InventoryBean();

		l_ref_2.setManufacturer("Hyundai");
		l_ref_2.setCarName("i10");
		l_ref_2.setColorsAvailable("Red, White");
		l_ref_2.setPrice("9000");

		list1.add(2, l_ref_2);

		
		return list1;
	}
	
	public static ArrayList DispList2(){
		
		ArrayList list2 = new ArrayList();
		InventoryBean l_ref_3 = new InventoryBean();

		l_ref_3.setManufacturer("Ford");
		l_ref_3.setCarName("Figo");
		l_ref_3.setColorsAvailable("Red, White");
		l_ref_3.setPrice("40000");

		list2.add(0, l_ref_3);

		InventoryBean l_ref_4 = new InventoryBean();

		l_ref_4.setManufacturer("Volkswagen");
		l_ref_4.setCarName("Polo");
		l_ref_4.setColorsAvailable("Red, White");
		l_ref_4.setPrice("42000");

		list2.add(1, l_ref_4);

		
		
		return list2;
	}

	public static void InvLogic() {

		DispList1();
		DispList2();
		
		


	}

}
