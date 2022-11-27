package com.lee.yum.controller;

import com.lee.yum.model.BoardDTO;
import com.lee.yum.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    final BoardService service;

    @GetMapping("/list")
    public String boardList(Model model){
        List<BoardDTO> list = service.boardList();
        model.addAttribute("list", list);
        return "board/list";
    }

}
