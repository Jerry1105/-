package fwj.importtext;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

/*
fuwenjie



*/
public class Imptxt implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		MultiValueMap<String, Object> attr = importingClassMetadata
				.getAllAnnotationAttributes(ImportText.class.getName());

		String[] first = (String[]) attr.getFirst("value");
		List<String> value = Arrays.asList(first);

		BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(processor.class);
		bdb.addPropertyValue("value", value);
		registry.registerBeanDefinition(processor.class.getName(), bdb.getBeanDefinition());

	}

}
