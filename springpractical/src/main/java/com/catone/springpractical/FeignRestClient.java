package com.catone.springpractical;

import com.catone.springpractical.models.Students;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "FeignBoss" ,url = "http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient
{
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Students registerStudents(@RequestBody Students students);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Students requestMatch(@RequestParam(name = "MALE") String gender , @RequestParam(name = "51") long studentId, @RequestBody Students students);


//
//    @RequestMapping(method = RequestMethod.PATCH, value = "matches")
//    Students rejectMatch(@PathVariable(name = "blindDateId")long blindDateId, @RequestBody Students students);


}
