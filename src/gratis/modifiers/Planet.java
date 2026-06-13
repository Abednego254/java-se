package gratis.modifiers;

abstract class Planet {
    protected void revolve() {}

    public abstract void rotate();
}

class Earth extends Planet {
    protected void revolve() {}

    public void rotate() {}
}
