package org.tyaa.springcontextdemo2.implementations;

import org.springframework.beans.factory.InitializingBean;
import org.tyaa.springcontextdemo2.interfaces.IPerson;

public class Warrior implements IPerson, InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init " + this.toString());
	}

	@Override
	public void goTo(int _x, int _y) {
		System.out.printf("Run to %d; %d\n", _x, _y);
	}
}
