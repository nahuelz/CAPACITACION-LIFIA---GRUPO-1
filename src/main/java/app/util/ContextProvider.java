package app.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextProvider implements ApplicationContextAware {

	public ContextProvider() {
		super();
	}

	@Override
	public void setApplicationContext(ApplicationContext aContext) throws BeansException {
		
	}

}