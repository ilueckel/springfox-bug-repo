package de.ilueckel.springfoxtest;

import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class Rest {

  @GetMapping("test.json")
  public void test(
          @ApiParam(allowMultiple = true) @RequestParam Collection<Long> ids
  ) {

  }
}
