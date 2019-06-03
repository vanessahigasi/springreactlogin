package bts.tech.springreactlogin.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/notes")

public class NotesApi {

    @GetMapping
    // @RequestMapping(method = RequestMethod.GET)
    public List<String> getNotes() {

        return Arrays.asList("one","two","three");

    }
}
