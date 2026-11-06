package ir.maktabsharif.cofiguration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("ir.maktabsharif")
public class AppConfig {


    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/viwes/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
