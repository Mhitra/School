class Triangle {
    protected int segment1;
    protected int segment2;
    protected int segment3;
    protected int segment4;
    public Triangle(int segment1, int segment2, int segment3, int segment4) {
        this.segment1 = segment1;
        this.segment2 = segment2;
        this.segment3 = segment3;
        this.segment4 = segment4;
    }}
class MyTriangle extends Triangle {
    public MyTriangle(int segment1, int segment2, int segment3, int segment4) {
        super(segment1, segment2, segment3, segment4);    }

    public boolean isTriangle() {
        if ((segment1 + segment2) > segment4 && (segment1 + segment4) > segment2 && (segment2 + segment4) > segment1) {
            return true;
        }
        if ((segment1 + segment2) > segment3 && (segment1 + segment3) > segment2 && (segment2 + segment3) > segment1) {
            return true;
        }
        
        if ((segment1 + segment3) > segment4 && (segment1 + segment4) > segment3 && (segment3 + segment4) > segment1) {
            return true;
        }
        if ((segment2 + segment3) > segment4 && (segment2 + segment4) > segment3 && (segment3 + segment4) > segment2) {
            return true;
        }
        return false;
    }
    public double area() {
        if ((segment1 + segment2) > segment3 && (segment1 + segment3) > segment2 && (segment2 + segment3) > segment1) {
            int s = (segment1 + segment2 + segment3) / 2;
            System.out.println(Math.sqrt(s * (s - segment1) * (s - segment2) * (s - segment3)));
            return 0 ;
        }
        if ((segment1 + segment2) > segment4 && (segment1 + segment4) > segment2 && (segment2 + segment4) > segment1) {
            int s = (segment1 + segment2 + segment4) / 2;
             System.out.println(Math.sqrt(s * (s - segment1) * (s - segment2) * (s - segment4)));   
             return 0;
            }
        if ((segment1 + segment3) > segment4 && (segment1 + segment4) > segment3 && (segment3 + segment4) > segment1) {
            int s = (segment1 + segment3 + segment4) / 2;
                System.out.println(Math.sqrt(s * (s - segment1) * (s - segment3) * (s - segment4)));
                return 0;
        }
        if ((segment2 + segment3) > segment4 && (segment2 + segment4) > segment3 && (segment3 + segment4) > segment2) {
            int s = (segment2 + segment3 + segment4) / 2;
                System.out.println(Math.sqrt(s * (s - segment2) * (s - segment3) * (s - segment4)));
                return 0;
        }
        return 0;        
    }

    public double perimeter() {
        if ((segment1 + segment2) > segment3 && (segment1 + segment3) > segment2 && (segment2 + segment3) > segment1) {
            int s = (segment1 + segment2 + segment3) ;
            System.out.println(s);
            return 0;
        }
        if ((segment1 + segment2) > segment4 && (segment1 + segment4) > segment2 && (segment2 + segment4) > segment1) {
            int s = (segment1 + segment2 + segment4) ;
            System.out.println(s);
            return 0;
        }
        if ((segment1 + segment3) > segment4 && (segment1 + segment4) > segment3 && (segment3 + segment4) > segment1) {
            int s = (segment1 + segment3 + segment4) ;
            System.out.println(s);
            return 0;
        }
        if ((segment2 + segment3) > segment4 && (segment2 + segment4) > segment3 && (segment3 + segment4) > segment2) {
            int s = (segment2 + segment3 + segment4) ;
            System.out.println(s);
            return 0;
        }
        return 0;
    }}