import java.io.*;

public Child extends Parent {
	Public Child() {
		super();
	}
	super();
}
Public Child(String name,int age,String address) {
	super(name,age,address);
}
public static void main(String args[]) {
	Child c=new Child();
	c.parentDisplay();
	Child c2=new Child("tin",30,"filip");
	c2.parentDisplay();
}

}