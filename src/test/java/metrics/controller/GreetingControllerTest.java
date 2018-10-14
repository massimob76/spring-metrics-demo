package metrics.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GreetingControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private GreetingController greetingController;

    @BeforeEach
    void setUp() {
        initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(greetingController)
                .build();
    }

    @Test
    void shouldGreetDefault() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"greeting\":\"Hello, world\"}"));
    }

    @Test
    void shouldGreetByYourName() throws Exception {
        mockMvc.perform(get("/greeting?name=Massimo"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"greeting\":\"Hello, Massimo\"}"));
    }

}