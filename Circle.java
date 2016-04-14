public class Circle {
	
        private double radius;
        private double area;
        private double pi = Math.PI;
        
        public Circle(double radius) {
                this.radius = radius;
                area = pi * radius * radius;
        }
        public void setRadius(double r) {
            radius = r;
            setArea(radius);
        }
        private void setArea(double r) {
            this.area = pi * r * r;
    }
        public double getRadius() {
            return radius;
    }
        public double getArea() {
            return area;
    }
}
