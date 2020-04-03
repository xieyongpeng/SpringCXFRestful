package com.webService.domain.service;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.webService.domain.bean.User;
import com.webService.domain.response.Response;
import com.webService.storage.Storage;

@Controller
public class UserServiceImpl implements UserService{

	@Override
	public List<User> getUsers() {
		return Storage.users;
	}

	@Override
	public Response delete(int id) {
		Response response=new Response();
        response.setCode("00");
        response.setMsg("succes");
        return response;
	}

	@Override
	public User getUser(int id) {
		return Storage.users.get(id);
	}

	@Override
	public Response add(User user) {
		return null;
	}

	@Override
	public Response update(User user) {
		return null;
	}

}
