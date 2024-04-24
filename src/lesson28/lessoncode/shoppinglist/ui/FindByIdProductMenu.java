package lesson28.lessoncode.shoppinglist.ui;

import lesson28.lessoncode.shoppinglist.dto.ResponseForClientFindByIdProduct;
import lesson28.lessoncode.shoppinglist.service.ProductService;
import lesson28.lessoncode.shoppinglist.service.util.UserInput;

public class FindByIdProductMenu implements MenuCommand{

    private final ProductService service;

    public FindByIdProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idForSearch = UserInput.getInt("Please enter product id for search:");

        ResponseForClientFindByIdProduct findByIdResult = service.findById(idForSearch);
        System.out.println(findByIdResult);

    }

    @Override
    public String getMenuName() {
        return "Find product by ID";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
