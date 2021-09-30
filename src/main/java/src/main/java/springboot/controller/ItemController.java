package src.main.java.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.springboot.model.Item;


@RestController
public class ItemController {

    private int counter;

    @GetMapping("/showItem")
    public Item getItem(@RequestParam(value="itemDesc", defaultValue = "Default Item") String itemDesc){
        System.out.println("Called");
        return new Item(counter++,itemDesc);
    }
}
