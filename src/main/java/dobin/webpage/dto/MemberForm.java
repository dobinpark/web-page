package dobin.webpage.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수입니다.")
    private String name;

    @NotEmpty(message = "이메일은 필수입니다.")
    private String email;

    @NotEmpty(message = "주소는 필수입니다.")
    private String address;

    @NotEmpty(message = "상세 주소는 필수입니다.")
    private String detailAddress;
}
