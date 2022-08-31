package dobin.webpage.entity;

import dobin.webpage.dto.Address;
import dobin.webpage.dto.MemberForm;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String email;

    private String address;

    private String detailAddress;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
