package DependencyInject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("DependencyInject")
@PropertySource("classpath:sport.properties")
public class ConfigurationClassForProperties {
@Bean
 public FortuneServiceInterface sadFortune() {
	 return new SadFortune();
 }
@Bean
 public CoachTask swimCoach() {
	 return new SwimCoach(sadFortune());
 }
}
