package security

import com.strengthprogress.repositories.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import security.CustomUserDetails

@Service
open class UserService(private val userRepository: UserRepository):UserDetailsService{

    override fun loadUserByUsername(username: String): UserDetails {
        return CustomUserDetails(userRepository.findByUsername(username)!!)
    }
}