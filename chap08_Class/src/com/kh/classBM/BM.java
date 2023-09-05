package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM {
	 public void main() {
		
		publicMethod();
		protectedMethod();
		
			// main 메서드에서 직접 호출을 하거나 뭔가를 통해
			// 접근 제한자를 가지고 있어서 같은 패키지 내에서
			// extends사용해서 호출을 한다
		
			// 같은 패키지 안에서 사용이 가능함.
			// 다른 패키지 임으로 사용이 안됨.
		
		
			
		// defaultMethed();
	 }
}
