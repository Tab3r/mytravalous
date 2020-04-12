package com.noip.tab3r.mytravalous.model.entities;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class TrackSegment implements ITrackSegment, IEntity {

    @NotNull
    List<ITrackPoint> points;

    public TrackSegment(@NotNull List<ITrackPoint> points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackSegment that = (TrackSegment) o;
        return points.equals(that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return "TrackSegment{" +
                "points=" + points +
                '}';
    }
}
