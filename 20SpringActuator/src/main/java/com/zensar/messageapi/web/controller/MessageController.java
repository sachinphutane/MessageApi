package com.zensar.messageapi.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.zensar.messageapi.entity.Message;

@Controller
public class MessageController {
	
	private List<Message> messages;

    public MessageController()
    {
        this.messages = new ArrayList<Message>();
        Message m1 = new Message();
        m1.setId(1);
        m1.setMessage("Good Morning");
        this.messages.add(m1);
    }
    
    @GetMapping("/message")
    public String showAllMessages(Model m) {
    	m.addAttribute("allMessages",this.messages);
    	return "message";
    }
    
	@GetMapping("/welcome")
	public String home(Model m) {
		System.out.println("In home()");
		m.addAttribute("name","zensar India");
		//return "index";
		throw new RuntimeException();
	}

}
