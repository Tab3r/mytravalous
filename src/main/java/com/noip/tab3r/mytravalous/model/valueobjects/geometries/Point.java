package com.noip.tab3r.mytravalous.model.valueobjects.geometries;

import com.noip.tab3r.mytravalous.model.valueobjects.IValueObject;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Objects;

public class Point implements IPoint, IValueObject {

    @NotNull
    private double x;

    @NotNull
    private double y;

    @Positive
    private int projection;

    public Point(@NotNull double x, @NotNull double y, @Positive int projection) {
        this.x = x;
        this.y = y;
        this.projection = projection;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getProjection() {
        return projection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0 &&
                projection == point.projection;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, projection);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", projection=" + projection +
                '}';
    }
}
