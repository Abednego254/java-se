package gratis;

abstract class Book implements Readable {
    public void readBook() {
        System.out.println("Read Book");
    }
}

interface Readable extends Downloadable {
    public void readBook();
}

interface Downloadable {
    public void download();
}

class Ebook extends Book {
    public void readBook() {
        System.out.println("Read Ebook");
    }

    @Override
    public void download() {

    }
}
