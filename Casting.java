class Casting {
    //Converting

    private static final String _1_23456 = "1.23456";
    private static final Float FLOAT = new Float(_1_23456);
    int xInt = 10;
    float xFloat;
    xFloat = xInt;

    public Casting(float xFloat2) {
        this.xFloat2 = xFloat2;
    }

    int xInt2;
    float xFloat2 = 1.23456f;

    //xInt2 =(int) xFloat2;

    Float x = FLOAT;
    xInt2 = x.intValue();

    System.out.println(xInt2);
}
}

