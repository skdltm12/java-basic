package sec1;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolkit.beep();
			
		}

	}

}
