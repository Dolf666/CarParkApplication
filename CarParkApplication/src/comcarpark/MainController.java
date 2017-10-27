package comcarpark;

import java.awt.EventQueue;
import java.util.ArrayList;

public class MainController {
	public static ArrayList<User> list;
	public static void main(String[] args) {
	 list = new ArrayList<User>();
		
		Owner o1=new Owner("admin","Kenguroo", "7474747474747", "john@gmail.com", "Lane Street","admin","admin");
		Owner o2=new Owner("John","Kenguroo", "7474747474747", "john@gmail.com", "Lane Street","java","java");
		Owner o3=new Owner("Sara","Zebra", "7474747474747", "john@gmail.com", "Lane Street","ace","ace");
		Owner o4=new Owner("David","Kenguroo", "7474747474747", "john@gmail.com", "Lane Street","lio","lio");
		Owner o5=new Owner("Catherine","Kenguroo", "7474747474747", "john@gmail.com", "Lane Street","spring","spring");
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		list.add(o5);
		//EventQueue.invokeLater(new Runnable() {/////ttttttrtrtrtr
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
