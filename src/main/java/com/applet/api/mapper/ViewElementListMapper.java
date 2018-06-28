package com.applet.api.mapper;

import com.applet.api.entity.ViewElementList;
import com.applet.api.entity.ViewElementListExample;
import java.util.List;

public interface ViewElementListMapper {
    int countByExample(ViewElementListExample example);

    List<ViewElementList> selectByExample(ViewElementListExample example);
}