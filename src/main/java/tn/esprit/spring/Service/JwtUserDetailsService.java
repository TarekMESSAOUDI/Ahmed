package tn.esprit.spring.Service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JwtUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("javainuse".equals(username)){
			return new User("javainuse","$2y$10$DeiQcYfPcbg.F5HQ0wSWk.3uEUHliGliiUe5t613eh3Ghnfv0WNb2"
					,new ArrayList<>()); 
		}else{
			throw new UsernameNotFoundException("User Not Found");
		}
	}

}
