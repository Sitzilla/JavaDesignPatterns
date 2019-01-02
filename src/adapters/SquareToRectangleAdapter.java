package adapters;

public class SquareToRectangleAdapter implements Rectangle {
    private Square square;

    public SquareToRectangleAdapter(final Square square) {
        this.square = square;
    }

    @Override
    public int getWidth() {
        return square.side;
    }

    @Override
    public int getHeight() {
        return square.side;
    }
}