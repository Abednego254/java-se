package exceptions;

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
    void roar() throws HasSoreThroatException;
}
class Lion implements Roar {
    @Override
    public void roar() throws TiredException {
    }
}
