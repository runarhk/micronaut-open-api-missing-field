package my.openapi.app;

public class TestImpl1 implements TestInterface {

    private TestInterface woopsie;

    @Override
    public String getType() {
        return null;
    }

    public TestInterface getWoopsie() {
        return woopsie;
    }

    public void setWoopsie(TestInterface woopsie) {
        this.woopsie = woopsie;
    }
}
