package lesson28.lessoncode.shoppinglist.ui;

public interface MenuCommand {
    void executeCommand();

    String getMenuName();
    boolean shouldExit();
}
