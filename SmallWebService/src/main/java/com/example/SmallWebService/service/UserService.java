package com.example.SmallWebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SmallWebService.Result;
import com.example.SmallWebService.UserAccount;
import com.example.SmallWebService.Dao.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	
	
	  public Result<Long> login(String userName, String password){
		           Result<Long> result = new Result<>();
		           UserAccount u = userRepository.getByUserName(userName).get();
		           if(u == null){
		              result.setErrCode(-1);
		               result.setErrMessage("Username not exist");
		           }else if(u.getPassword().equals(password)){
		               System.out.println(u.toString());
		               result.setErrCode(0);
		               result.setData(u.getId());
		           }else {
		               result.setErrCode(1);
		               result.setErrMessage("Password doesn't match");
		           }
		           return result;
		       }
	  
	  
}
