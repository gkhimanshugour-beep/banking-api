package com.cb.main.mapper;

import com.cb.main.dto.adminDto;
import com.cb.main.entiteis.admin;

public class adminMapper {
	
	
	public static admin mapToAdmin(adminDto admindto) {
		
		admin addmin = new admin (
				admindto.getId(),
				admindto.getName(),
				admindto.getPassword()	
				);
		return addmin;
			
	}
	
	
	public static adminDto mapToAdminDto(admin addmin) {
		
		adminDto addmindto = new adminDto(
				
				addmin.getId(),
				addmin.getName(),
				addmin.getPassword()
				
				);
				
		return addmindto;	
	}

}
