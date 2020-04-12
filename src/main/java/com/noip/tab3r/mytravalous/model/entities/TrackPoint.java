package com.noip.tab3r.mytravalous.model.entities;

import com.noip.tab3r.mytravalous.model.valueobjects.geometries.IPoint;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

public class TrackPoint implements ITrackPoint, IEntity {

    @NotNull
    private IPoint point;
    private Double elevation;
    private LocalDateTime time;

    public TrackPoint(@NotNull IPoint point, Double elevation, LocalDateTime time) {
        this.point = point;
        this.elevation = elevation;
        this.time = time;
    }

    public IPoint getPoint() {
        return point;
    }

    public void setPoint(IPoint point) {
        this.point = point;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackPoint that = (TrackPoint) o;
        return point.equals(that.point) &&
                elevation.equals(that.elevation) &&
                time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, elevation, time);
    }

    @Override
    public String toString() {
        return "TrackPoint{" +
                "point=" + point +
                ", elevation=" + elevation +
                ", time=" + time +
                '}';
    }
}
