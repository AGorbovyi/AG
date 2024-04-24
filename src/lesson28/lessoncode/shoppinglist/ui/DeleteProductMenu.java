package lesson28.lessoncode.shoppinglist.ui;

import lesson28.lessoncode.shoppinglist.dto.ResponseForClientForDelete;
import lesson28.lessoncode.shoppinglist.service.ProductService;
import lesson28.lessoncode.shoppinglist.service.util.UserInput;

public class DeleteProductMenu implements MenuCommand{

    private final ProductService service;

    public DeleteProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idFroDelete = UserInput.getInt("Please enter product id for delete:");

        ResponseForClientForDelete deleteResult = service.deleteById(idFroDelete);
        System.out.println(deleteResult);

    }

    @Override
    public String getMenuName() {
        return "Delete product";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
