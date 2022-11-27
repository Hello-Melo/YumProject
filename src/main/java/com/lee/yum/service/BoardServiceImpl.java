package com.lee.yum.service;

import com.lee.yum.mapper.BoardMapper;
import com.lee.yum.model.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl  implements  BoardService{

    final BoardMapper mapper;

    public List<BoardDTO> boardList() {
        return mapper.boardList();
    }
}
