package com.webService.storage;

import java.util.Arrays;
import java.util.List;

import com.webService.domain.bean.User;

//模仿数据库
public class Storage {
	//数据仓库
    public static List<User> users= Arrays.asList(
            new User(1,"james"),
            new User(2,"mic"),
            new User(3,"sam")
    );
}
