package dobin.webpage.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemForm {

    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    private String color;

    private String size;
}
