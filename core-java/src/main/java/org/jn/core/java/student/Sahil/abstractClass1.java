package org.jn.core.java.student.Sahil;

public class abstractClass1 extends abstractClass01 {
	
	
@Override
 public void arrayprint() {
	int a[]= {4,5,7,3,67};
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}
	
	
}
@Override
public void ifelse() {
	// TODO Auto-generated method stub
	int a= 122;
	if(a<=1) {
		System.out.println("its Postive");
		
	}
	else {
		if(a>1) {
			System.out.println("its Negative");
			}
	}

}


@Override
public void loop() {
	// TODO Auto-generated method stub
	int s = 9;
	while(s<=10) {
		System.out.println("LOOP");
		break;
		
	}
}
}
