package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class TestController {
    @GetMapping
    public String teste() {
        return """<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
      body {
        font-size: 100px;
      }
    </style>
</head>
<body>
  <img src="https://pbs.twimg.com/media/EixcAcmWoAIPrMb.jpg">
</body>
</html>""";
    }

}
