package fwj.importtext;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
fuwenjie



*/
public class processor implements BeanPostProcessor {

	private List<String> value;

	public List<String> getValue() {
		return value;
	}

	public void setValue(List<String> value) {
		this.value = value;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {

		return arg0;

	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		for (String pag : value) {
			if (arg0.getClass().getName().startsWith(pag)) {
				System.out.println(arg0.getClass().getName() + "---------------");
			}
		}
		return arg0;
	}

}
