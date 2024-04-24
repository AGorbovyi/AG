package lesson28.lessoncode.shoppinglist.ui;

import lesson28.lessoncode.shoppinglist.dto.ResponseForClientFindAllProducts;
import lesson28.lessoncode.shoppinglist.service.ProductService;

public class FindAllProductMenu implements MenuCommand{

    private final ProductService service;

    public FindAllProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        ResponseForClientFindAllProducts findAllResult = service.findAll();
        System.out.println(findAllResult);

    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
