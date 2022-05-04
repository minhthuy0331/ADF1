import java.util.Arrays;

public class B2_Line {
    private B2_Point begin;
    private B2_Point end;

    public B2_Line(int x1, int y1, int x2, int y2) {
        begin = new B2_Point(x1, y1);
        end = new B2_Point(x2,y2);
    }
    public B2_Line(B2_Point begin, B2_Point end) {
        begin = begin;
        end = end;
    }
    public B2_Point getBegin() {
        return begin;
    }
   public B2_Point getEnd() {
        return end;
   }
    public void setBegin(B2_Point begin) {
        this.begin = begin;
    }
    public void setEnd(B2_Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
   public void setBeginX(int x) {
        begin.setX(x);
   }

   public int getBeginY() {
        return begin.getY();
   }
   public void setBeginY(int y) {
        begin.setY(y);
   }
   public int [] getBeginXY() {
        return begin.getXY();
   }
   public void setBeginXY(int x, int y) {
        begin.setXY(x,y);
   }
   public int getEndX() {
        return end.getX();
   }
   public void setEndX(int x) {
        end.setX(x);
   }

   public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
   public int [] getEndXY() {
        return end.getXY();
   }
   public void setEndXY(int x,int y) {
        end.setXY(x,y);
   }

    @Override
    public String toString() {
        return "Line[begin = " + begin + ", end=" + end + "]";
    }
    public double getLength() {
        return begin.distance(end);
    }

}
