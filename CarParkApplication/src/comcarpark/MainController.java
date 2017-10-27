package comcarpark;

import java.awt.EventQueue;
import java.util.ArrayList;

public class MainController {
	public static ArrayList<User> list;
	public static void main(String[] args) {
	 list = new ArrayList<User>();
		
		Owner o1=new Owner("John","Kenguroo", "7474747474747", "john@gmail.com", "Lane Street","java","java");
		list.add(o1);
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(o1.getName());
				System.out.println(list.get(0).getPassword());
			}
		//});
	//}
	public static ArrayList<User> getList() {
		return list;
	}
	 
	

}
