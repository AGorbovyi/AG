package lesson28.lessoncode.shoppinglist.dto;

import lesson28.lessoncode.shoppinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseForClientFindByIdProduct {
    private ProductForClient productForClients;
    private List<ErrorDto> errorDtoList;

    public ResponseForClientFindByIdProduct(ProductForClient productForClients, List<ErrorDto> errorDtoList) {
        this.productForClients = productForClients;
        this.errorDtoList = errorDtoList;
    }

    public ProductForClient getProductForClients() {
        return productForClients;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientFindByIdProduct{" +
                "productForClients=" + productForClients +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}


