package edu.hebut.template;

public class HouseOne extends HouseTemplate {

    boolean isBuildToilet;

    public HouseOne(String name) {
        super(name);
    }

    public HouseOne(String name, boolean isBuildToilet) {
        this(name);
        this.isBuildToilet = isBuildToilet;
    }

    @Override
    protected void buildDoor() {

    }

    @Override
    protected void buildWindow() {

    }

    @Override
    protected void buildWall() {

    }

    @Override
    protected void buildBase() {

    }

    @Override
    protected void buildToilet() {

    }

    @Override
    protected boolean isBuildToilet() {
        return this.isBuildToilet();
    }
}
