package com.cb.main.service;

import com.cb.main.entiteis.admin;
import com.cb.main.repository.AdminRepository;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AdminServiceIMPL  implements AdminService{

	private final AdminRepository adminRepository;

	AdminServiceIMPL(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}
	
	
	@Override
	public String login(int id, String password) {
		
  Optional<admin> optionalAdmin= adminRepository.findById(id);		
		
  if(optionalAdmin.isEmpty()) {
      return "Admin Not Found";
  }

  admin admin = optionalAdmin.get();

  if(admin.getPassword().equals(password)) {

      return "Welcome " + admin.getName();
  }

  return "Wrong Password";
}

}
