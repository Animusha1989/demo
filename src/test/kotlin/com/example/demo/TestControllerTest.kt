package com.example.demo

import com.example.demo.controller.TestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import kotlin.test.Test

@WebMvcTest(TestController::class)
class TestControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `should return hello`() {
        mockMvc.get("/demo/test")
            .andExpect {
                status { isOk() }
                content { string("Hello") }
            }
    }
}
