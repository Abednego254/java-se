package gratis.inheritance;

class CD {
    int r;

    CD(int r) {
        this.r = r;
    }
}

class DVD extends CD {
    int c;

    DVD(int r, int c) {
        super(r);
        this.c = c;
    }
}

class Test {
    public static void main(String[] args) {
        DVD dvd = new DVD(3, 4);
    }
}
