package lsp_wrong;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // violates LSP
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // violates LSP
    }
}
