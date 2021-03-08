package egalimsarov.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"RU", "default"})
@Service("i18nService")
public class I18nRussianService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Привет Мир - RU";
    }
}
