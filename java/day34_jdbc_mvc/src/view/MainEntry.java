package view;

import controller.GiftController;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) throws Exception {
//		GiftController.connect();
		GiftController.connect();
		GiftController.menu();
//		ConnectionHelper.getConnection("oracle","system","oracle");
	}
}
