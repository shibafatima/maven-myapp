package com.psi.testng;



import java.util.ArrayList;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.psl.main.InventoryDAO;

public class TesNGTest {

	@Test
	//List1 Not Empty
	public void testList1NotEmpty() throws Exception {
		ArrayList list = new ArrayList();

		list = InventoryDAO.DispList1();
		int size = list.size();
		Assert.assertEquals(3, size);

	}

	@Test
	//List1 Empty
	public void testList1Empty() throws Exception {
		ArrayList list = new ArrayList();

		list = InventoryDAO.DispList1();
		int size = list.size();
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	//List2 Not Empty
	public void testListNotEmpty() throws Exception {
		ArrayList list = new ArrayList();

		list = InventoryDAO.DispList2();
		int size = list.size();
		Assert.assertEquals(2, size);

	}

	@Test
	//List2 Empty
	public void testListEmpty() throws Exception {
		ArrayList list = new ArrayList();

		list = InventoryDAO.DispList2();
		int size = list.size();
		Assert.assertFalse(list.isEmpty());
	}
}
