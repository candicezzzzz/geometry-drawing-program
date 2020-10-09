package src.main.java;

import java.awt.Point;

public class SimplePolygon extends Polygon {
  private static final String TYPE = "simple polygon";

  public SimplePolygon(Point... vertices) {
    super(vertices);
  }

  public double calculateArea() {
    double area = 0;
    int[] xPoints = super.getXPoints();
    int[] yPoints = super.getYPoints();
    int numPoints = super.getXPoints().length;
    
    for (int i = 0; i < numPoints; i++) {
      int x1 = xPoints[i];
      int y1 = yPoints[i];
      int x2 = xPoints[(i+1)%(numPoints-1)];
      int y2 = yPoints[(i+1)%(numPoints-1)];
      area +=  x1*y2 - y1*x2;
    }
    return Math.abs(area/2);
  }

  @Override
  public String getType() {
    return SimplePolygon.TYPE;
  }
}
