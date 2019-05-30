package request

import com.strengthprogress.domain.Gender
import java.time.LocalDate

class RegistrationForm(
        var userName: String = "",
        var passWord: String = "",
        var email: String = "",
        var dateOfBirth: LocalDate,
        var bodyWeight: Double,
        var gender: Gender = Gender.Other
)