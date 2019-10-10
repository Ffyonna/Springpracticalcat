package com.catone.springpractical;

import com.catone.springpractical.models.Students;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Testing implements CommandLineRunner
{
    private final FeignRestClient feignRestClient;

    public Testing(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Students registeredStudent = feignRestClient.registerStudents(new Students(96135,"Fiona"));

        Students requestedMatch = feignRestClient.requestMatch()


    }
}
