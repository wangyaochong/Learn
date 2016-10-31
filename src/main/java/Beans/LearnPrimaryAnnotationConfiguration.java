package Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by 2 on 2016/10/31.
 */
@Configuration
public class LearnPrimaryAnnotationConfiguration {
    @Bean
    @Primary
    public PrimaryBean firstBean(){
        return new PrimaryBean("firstBean");
    }

    @Bean
    public PrimaryBean secondBean(){
        return new PrimaryBean("secondBean");
    }


}
