package com.lime.it.auth.limeitauth.controller;

import com.lime.it.auth.limeitauth.model.TestModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LimeItController {

    @PostMapping("/test")
    @ResponseBody
    public ResponseEntity<TestModel> getTest(@RequestBody TestModel testModel) {
        return ResponseEntity.ok()
                .body(
                        TestModel.builder().value1(testModel.value1() + "_response").value2(testModel.value2() + "_response").build()
                );
    }
}
