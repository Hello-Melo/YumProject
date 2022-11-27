package com.lee.yum.mapper;

import com.lee.yum.model.BoardDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;
public class BoardMapperTest {

@Autowired
public  BoardMapper mapper;

    @Test
    public void boardList() {
        List<BoardDTO> list = mapper.boardList();
        System.out.println(list);
        /*assertEquals(1, list.size());*/
    }
}