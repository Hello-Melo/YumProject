package com.lee.yum.mapper;

import com.lee.yum.model.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> boardList();
}
