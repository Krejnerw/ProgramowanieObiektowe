package pl.imiajd.krejner;

class NazwanyPunkt extends Punkt
{
    NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }
    @Override
    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    private String name;
}