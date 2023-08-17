package ariefbelajarteknologi.spring.core.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

<<<<<<< HEAD
    private ApplicationEventPublisher applicationEventPublisherAware;
=======
    private ApplicationEventPublisherAware applicationEventPublisherAware;
>>>>>>> origin/master

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisherAware = applicationEventPublisher;
    }
}
