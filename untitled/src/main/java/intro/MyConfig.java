package intro;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("intro")
@PropertySource("classpath:app.properties")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
