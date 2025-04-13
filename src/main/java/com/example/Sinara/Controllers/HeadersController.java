package com.example.Sinara.Controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Enumeration;

//Класс для обработки заголовков get запросов
@Controller
public class HeadersController {

    @GetMapping("/headers")
    public String getHeaders(HttpServletRequest request, Model model){
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            model.addAttribute(headerName, request.getHeader(headerName));
        }
        return "headersTemplate";
    }
}
