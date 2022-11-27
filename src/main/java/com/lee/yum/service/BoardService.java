package com.lee.yum.service;

import com.lee.yum.model.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {

    List<BoardDTO> boardList();
}
