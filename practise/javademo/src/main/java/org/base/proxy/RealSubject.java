package org.base.proxy;

public class RealSubject implements Subject{

	@Override
	public void Request() {
		System.out.println("我是RealSubject对象的Request方法");
	}

	/* (non-Javadoc)
	 * @see org.base.proxy.Subject#rent()
	 */
	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.base.proxy.Subject#hello(java.lang.String)
	 */
	@Override
	public void hello(String string) {
		// TODO Auto-generated method stub
		
	}

}
