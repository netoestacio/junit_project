package br.com.pesn.estudo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MainController.class)
@ActiveProfiles("test")
public class MainControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldGetOkStatus() throws Exception{
        this.mockMvc.perform(get("/api/user/1"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetNotFoundStatus() throws Exception{
        this.mockMvc.perform(get("/api/user/0"))
                .andExpect(status().isNotFound());
    }



}
